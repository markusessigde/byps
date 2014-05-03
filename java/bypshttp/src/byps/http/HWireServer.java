package byps.http;

/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.BAsyncResult;
import byps.BContentStream;
import byps.BException;
import byps.BMessage;
import byps.BMessageHeader;
import byps.BStreamRequest;
import byps.BWire;

public class HWireServer extends BWire {

  private final HWriteResponseHelper writeHelper;
  public final HActiveMessages activeMessages = new HActiveMessages();
  private final static Log log = LogFactory.getLog(HWireServer.class);
  private final File tempDir;

  public HWireServer(HWriteResponseHelper writeHelper, File tempDir) {
    super(FLAG_DEFAULT);
    this.writeHelper = writeHelper;
    activeMessages.init(tempDir);
    
    if (tempDir == null) {
      String tempDirStr = System.getProperty("java.io.tmpdir");
      if (tempDirStr != null && tempDirStr.length() != 0) {
        tempDir = new File(tempDirStr);
      }
      else {
        tempDir = new File(".");
      }
      tempDir = new File(tempDir, "byps");
    }
    this.tempDir = tempDir;
  }

  public void done() {
    if (log.isDebugEnabled()) log.debug("done(");
    activeMessages.done();
    if (log.isDebugEnabled()) log.debug(")done");
  }

  private class MyIncomingInputStream extends BWire.InputStreamWrapper {

    public MyIncomingInputStream(long messageId, long streamId) {
      super(messageId, streamId);
    }

    @Override
    public String toString() {
      return "[" + messageId + "," + streamId + "]";
    }

    @Override
    protected InputStream openStream() throws IOException {
      if (log.isDebugEnabled()) log.debug("openStream(");

      BContentStream is = null;
      try {
        is = activeMessages.getIncomingStream(messageId, streamId, HConstants.REQUEST_TIMEOUT_MILLIS);
        if (log.isDebugEnabled()) log.debug("stream for messageId=" + messageId + ", streamId=" + streamId + ", is=" + is);

        if (is == null) {
          throw new IOException("Timeout while waiting for stream");
        }
      }
      catch (InterruptedException e) {
        if (log.isDebugEnabled()) log.debug("interrupted " + e);
        throw new InterruptedIOException("Interrupted");
      }

      if (log.isDebugEnabled()) log.debug(")openStream=" + is);
      return is;
    }

    @Override
    public BContentStream cloneInputStream() throws IOException {
      if (log.isDebugEnabled()) log.debug("cloneInputStream(");
      final BContentStream src = (BContentStream) ensureStream();
      final BContentStream ret = src.cloneInputStream();
      if (log.isDebugEnabled()) log.debug(")cloneInputStream=" + ret);
      return ret;
    }

    @Override
    public long getContentLength() throws IOException {
      BContentStream src = (BContentStream) ensureStream();
      return src.getContentLength();
    }

    @Override
    public String getContentType() throws IOException {
      BContentStream src = (BContentStream) ensureStream();
      return src.getContentType();
    }
  }

  public void cleanup() {
    if (log.isDebugEnabled()) log.debug("cleanup(");
    activeMessages.cleanup(false);
    if (log.isDebugEnabled()) log.debug(")cleanup");
  }

  @Override
  public BContentStream getStream(long messageId, long streamId) throws IOException {
    if (log.isDebugEnabled()) log.debug("getStream(messageId=" + messageId + ", streamId=" + streamId);
    MyIncomingInputStream is = new MyIncomingInputStream(messageId, streamId);
    if (log.isDebugEnabled()) log.debug(")getStream=" + is);
    return is;
  }

  @Override
  public void putStreams(List<BStreamRequest> streamRequests, BAsyncResult<BMessage> asyncResult) {
    if (log.isDebugEnabled()) log.debug("putStreams(");
    try {
      activeMessages.addOutgoingStreams(streamRequests);
    }
    catch (BException e) {
      // An exception is thrown, if the message has been canceled.
      if (log.isDebugEnabled()) log.debug("Exception: " + e);
    }
    if (log.isDebugEnabled()) log.debug(")putStreams");
  }

  private class AsyncMessageResponse implements BAsyncResult<BMessage> {

    final boolean isAsync;
    final BMessageHeader header;

    AsyncMessageResponse(BMessageHeader header, boolean isAsync) {
      this.header = header;
      this.isAsync = isAsync;
    }

    @Override
    public void setAsyncResult(BMessage msg, Throwable e) {
      if (log.isDebugEnabled()) log.debug("setAsyncResult(" + msg + ", e=" + e);

      try {
        ByteBuffer buf = null;
        if (msg != null) {
          putStreams(msg.streams, null);
          buf = msg.buf;
        }
        writeResponse(header.messageId, buf, e, isAsync);
      }
      catch (IOException ex) { // Tomcat: Client abort Exception
        if (log.isDebugEnabled()) log.debug("ClientAbortException");
        // Client has closed the connection.
        throw new IllegalStateException(ex);
      }
      catch (Throwable ex) {
        // Seen under high load:
        //   called from HWireClientR.cancelAllRequests:
        //     java.lang.IllegalStateException: Calling [asyncComplete()] is not valid for a request with Async state [DISPATCHED]
        //     java.lang.IllegalStateException: The request associated with the AsyncContext has already completed processing.
        //   called from HWireClientR.cleanup
        //     java.lang.IllegalStateException: The request associated with the AsyncContext has already completed processing.
        if (log.isDebugEnabled()) log.debug("Failed to write response.", ex);
        throw new IllegalStateException(ex);
      }
      finally {
        // Close all incoming streams of this message.
        // This is especially important if the server-side has not completely 
        // read all incoming streams. Since the client waits until all requests
        // of a message are returned, all incoming streams must be closed and 
        // the associated requests must return.
        activeMessages.closeMessageIncomingStreams(header.messageId);
      }
      if (log.isDebugEnabled()) log.debug(")setAsyncResult");
    }

    @Override
    public String toString() {
      return "[" + header.messageId + "]";
    }
  };

  private void writeResponse(Long messageId, ByteBuffer obuf, Throwable e, boolean isAsync) throws IOException {
    if (log.isDebugEnabled()) log.debug("writeResponse(messageId=" + messageId + ", obuf=" + obuf + ", exception=" + e);
    HRequestContext rctxt = activeMessages.getAndRemoveRequestContext(messageId);
    if (log.isDebugEnabled()) log.debug("async context of messageId: " + rctxt);
    if (rctxt == null) {
      // An async request could be already completed if a timeout has occurred. 
      if (log.isDebugEnabled()) log.debug("No async context for messageId=" + messageId + ", message already written or an exception occured while it was beeing written before.");
      throw new IOException("Response already written.");
    }
    else {
      writeHelper.writeResponse(obuf, e, (HttpServletResponse) rctxt.getResponse(), isAsync);
      rctxt.complete();
    }
    if (log.isDebugEnabled()) log.debug(")writeResponse");
  }

  public BAsyncResult<BMessage> addMessage(final BMessageHeader header, HRequestContext rctxt, Thread workerThread) {
    if (log.isDebugEnabled()) log.debug("addMessage(" + rctxt + ", messageId=" + header.messageId);

    BAsyncResult<BMessage> asyncResponse = new AsyncMessageResponse(header, rctxt.isAsync());
    try {
      activeMessages.addMessage(header, rctxt, workerThread);
    }
    catch (BException e) {
      try {
        writeHelper.writeResponse(null, e, (HttpServletResponse) rctxt.getResponse(), true);
      }
      catch (IOException e1) {
        if (log.isWarnEnabled()) log.warn("Failed to write error response.", e1);
      }
      rctxt.complete();
      asyncResponse = null;
    }

    if (log.isDebugEnabled()) log.debug(")addMessage=" + header.messageId);
    return asyncResponse;
  }

  public void sendOutgoingStream(Long messageId, Long streamId, HttpServletResponse response) throws IOException {
    if (log.isDebugEnabled()) log.debug("sendOutgoingStream(streamId=" + streamId + ", response=" + response);

    BContentStream is = null;
    OutputStream os = null;
    try {
      is = activeMessages.getOutgoingStream(messageId, streamId);
      
      // Before setting headers: check that the InputStream can be read.
      byte[] buf = new byte[HConstants.DEFAULT_BYTE_BUFFER_SIZE];
      int len = is.read(buf);

      final String contentType = is.getContentType();
      response.setContentType(contentType);

      final long contentLength = is.getContentLength();
      if (contentLength >= 0) {
        response.setHeader("Content-Length", Long.toString(contentLength));
      }
      
      final String contentDisposition = is.getContentDisposition();
      if (contentDisposition != null && contentDisposition.length() != 0) {
        response.setHeader("Content-Disposition", contentDisposition);
      }

      os = response.getOutputStream();
      while (len != -1) {
        os.write(buf, 0, len);
        len = is.read(buf);
      }
    }
    catch (IOException e) {
      throw e;
    }
    catch (Throwable e) {
      throw new IOException("Read stream failed.", e);
    }
    finally {
      if (log.isDebugEnabled()) log.debug("close response of outgoing stream, streamId=" + streamId);
      if (is != null) try {
        is.close();
      }
      catch (IOException ignored) {
      }
      if (os != null) try {
        os.close();
      }
      catch (IOException ignored) {
      }
    }

    if (log.isDebugEnabled()) log.debug(")sendOutgoingStream");
  }

  @Override
  public void send(BMessage msg, BAsyncResult<BMessage> asyncResult) {
    throw new IllegalStateException("BWireServer.send must not be called");
  }

  public File getTempDir() {
    return tempDir;
  }
}
