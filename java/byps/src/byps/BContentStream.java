package byps;

/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */

import java.io.IOException;
import java.io.InputStream;

/**
 * BContentStream is an InputStream with content type and content length.
 * Streams should always be transferred with a given content length. This 
 * makes HTTP communication more reliable. 
 */
public abstract class BContentStream extends InputStream {
	
	/**
	 * Default content type: application/octet-stream
	 */
	public final static String DEFAULT_CONTENT_TYPE = "application/octet-stream";

	/**
	 * Constructor with content type and length.
	 * @param contentType
	 * @param contentLength
	 */
	public BContentStream(String contentType, long contentLength) {
		this.lifetimeMillis = 0;
		this.contentType = contentType != null && contentType.length() != 0 ? contentType : DEFAULT_CONTENT_TYPE;
		this.contentLength = contentLength;
		extendLifetime();
	}
	
	/**
	 * Constructor used on provider side.
	 * @param contentType
	 * @param contentLength
	 * @param lifetimeMillis
	 */
	public BContentStream(String contentType, long contentLength, long lifetimeMillis) {
		this.lifetimeMillis = lifetimeMillis;
		this.contentType = contentType != null && contentType.length() != 0 ? contentType : DEFAULT_CONTENT_TYPE;
		this.contentLength = contentLength;
		extendLifetime();
	}
	
	/**
	 * Internally used copy constructor.
	 * Does not copy lifetimeMillis.
	 * @param rhs
	 */
	public BContentStream(BContentStream rhs) {
		this.lifetimeMillis = 0;
		this.contentType = rhs.contentType;
		this.contentLength = rhs.contentLength;
		this.attachment = rhs.attachment;
		this.fileName = rhs.fileName;
		extendLifetime();
	}
	
	/**
	 * Default constructor.
	 */
	public BContentStream() {
		this.lifetimeMillis = 0;
		this.contentType = DEFAULT_CONTENT_TYPE;
		this.contentLength = -1L;
	}
	
	/**
	 * Returns the content type.
	 * This value is used as HTTP header Content-Type.
	 * @return Content type.
	 */
	public String getContentType() throws IOException {
		return contentType; // e.g. "text/plain; charset=utf-8"
	}
	
	/**
	 * Set content type.
	 * @param v Content-Type header value
	 * @return this
	 */
	public void setContentType(String v) {
	  contentType = v;
	}
	
	/**
	 * Returns the content length.
	 * This value is used as HTTP Header Content-Length.
	 * This function returns -1L, if the content length is unknown.
	 * @return Content length.
	 */
	public long getContentLength() throws IOException {
		return contentLength; 
	}
	
	/**
	 * Set content length
	 * @param v Content-Length header value
	 * @return this
	 */
	public void setContentLength(long v) {
	  contentLength = v;
	}
	
  /**
   * Clone stream.
   * This function is only supported by sub-classes available on the server side.
   * A large cloned stream uses a temporary file. 
   * @return Cloned stream.
   * @throws IOException
   */
  public BContentStream cloneInputStream() throws IOException {
    throw new IOException("Stream cannot be cloned.");
  }
  
	/**
	 * Checks, whether the stream is expired.
	 * This function is only used on the provider side.
	 * @return
	 */
	public boolean isExpired() {
		boolean exp = lifetimeMillis > 0 && System.currentTimeMillis() > bestBefore;
		return exp;
	}
	
	/**
	 * Extends the lifetime.
	 * This function is only used on the provider side.
	 */
	protected void extendLifetime() {
		bestBefore = lifetimeMillis > 0 ? (System.currentTimeMillis() + lifetimeMillis) : 0;
	}
	
	/**
	 * Returns the lifetime in milliseconds.
	 * This function is only used on the provider side.
	 * @return
	 */
	protected long getLifetimeMillis() {
		return lifetimeMillis;
	}
	
	/**
	 * Get the callback interface for asynchronous processing.
	 * This function is for internal use only.
	 * @return Callback interface
	 */
	public BContentStreamAsyncCallback getAsyncCallback() {
	  return callback;
	}
	
	/**
	 * Assign a callback interface to the given stream.
	 * Only streams returned from API calls can be used as a parameter.
	 * @param is InputStream object returned from an API call. 
	 * @param cb Callback interface
	 * @throws IOException
	 */
	public static void assignAsyncCallback(InputStream is, BContentStreamAsyncCallback cb) throws IOException {
	  if (is instanceof BContentStream) {
  	  BContentStream me = ((BContentStream)is);
  	  me.setAsyncCallback(cb);
	  }
	  else {
	    throw new BException(BExceptionC.INTERNAL, "The given stream is not an instance of BContentStream.");
	  }
	}
	
	protected BContentStream setAsyncCallback(BContentStreamAsyncCallback cb) throws IOException {
	  this.callback = cb;
	  return this;
	}
	
	/**
	 * Set HTTP header Content-Disposition.
	 * @param fileName File name
	 * @param attachment true, if the browser should open the file as an attachment.
	 * @return this
	 */
	public BContentStream setContentDisposition(String fileName, boolean attachment) {
    this.fileName = fileName;
    this.attachment = attachment;
    return this;
	}
	
	/**
   * Set HTTP header Content-Disposition.
   * @param value Content-Dispostion header value
   * @return this
   */
 	public BContentStream setContentDisposition(String value) {
 	  String fileName = "";
 	  boolean att = false;
	  if (value != null && value.length() != 0) {
	    value = value.trim();
	    att = value.indexOf("attachment;") >= 0;
	    int p = value.indexOf("filename=");
	    if (p >= 0) {
	      fileName = value.substring(p + "filename=".length()).trim();
	      if (fileName.startsWith("\"")) {
	        fileName = fileName.substring(1);
	        if (fileName.endsWith("\"")) {
	          fileName = fileName.substring(0, fileName.length()-1);
	        }
	      }
	    }
	  }
	  return setContentDisposition(fileName, att);
	}
 	
  /**
   * Get HTTP header Content-Disposition.
   * @return HTTP header Content-Disposition.
   */
 	public String getContentDisposition() throws IOException {
    StringBuilder sbuf = new StringBuilder();
    sbuf.append( isAttachment() ? "attachment;" : "inline;" );
    final String fileName = getFileName();
    if (fileName != null && fileName.length() != 0) {
      sbuf.append(" filename=");
      boolean q = fileName.indexOf(' ') >= 0;
      if (q) sbuf.append("\"");
      sbuf.append(fileName);
      if (q) sbuf.append("\"");
    }
    return sbuf.toString();
 	}
 	
 	/**
 	 * Get content disposition attachment.
 	 * @return true, if the browser should open this stream as an attachment.
 	 */
  public boolean isAttachment() {
    return attachment;
  }
  
  /**
   * Set content disposition attachment.
   * @param att true, if the browser should open this stream as an attachment.
   * @return this;
   */
  public BContentStream setAttachment(boolean att) {
    attachment = att;
    return this;
  }
  
  /**
   * Get file name.
   * @return file name.
   */
  public String getFileName() {
    return fileName;
  }
  
  /**
   * Set file name.
   * @param fileName File name.
   * @return this
   */
  public BContentStream setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }
  
  private volatile long bestBefore;
	protected final long lifetimeMillis;
	protected volatile String contentType;
	protected volatile long contentLength = -1L;
	protected volatile String fileName;
	protected volatile boolean attachment;

	protected volatile BContentStreamAsyncCallback callback;
}
