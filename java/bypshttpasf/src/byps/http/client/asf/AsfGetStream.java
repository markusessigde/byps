package byps.http.client.asf;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;

import byps.BAsyncResult;
import byps.BContentStream;
import byps.BContentStreamWrapper;
import byps.BException;
import byps.BExceptionC;

public class AsfGetStream extends AsfRequest {

  private Log log = LogFactory.getLog(AsfGetStream.class);
  private final BAsyncResult<BContentStream> asyncResult;

  protected AsfGetStream(String url, BAsyncResult<BContentStream> asyncResult, CloseableHttpClient httpClient) {
    super(url, httpClient);
    this.asyncResult = asyncResult;
  }

  @Override
  public void run() {
    request = new HttpGet(url);
    applyTimeout();

    CloseableHttpResponse response = null;

    BException returnException = null;
    int statusCode = BExceptionC.CONNECTION_TO_SERVER_FAILED;
    HttpEntity entity = null;

    try {
      
      response = httpClient.execute(request);

      statusCode = response.getStatusLine().getStatusCode();
      if (statusCode != HttpURLConnection.HTTP_OK) {
        throw new IOException("HTTP status " + statusCode);
      }

      entity = response.getEntity();

    }
    catch (SocketException e) {
      if (log.isDebugEnabled()) log.debug("received exception=" + e);
      returnException = new BException(BExceptionC.CONNECTION_TO_SERVER_FAILED, "Socket error", e);
    }
    catch (IOException e) {
      if (log.isDebugEnabled()) log.debug("received exception=" + e);

      returnException = new BException(statusCode, "Send message failed", e);
    }
    finally {
    }

    BContentStream stream = new MyContentStream(returnException, entity, response);

    asyncResult.setAsyncResult(stream, null);
  }

  class MyContentStream extends BContentStreamWrapper {

    final IOException ex;
    final HttpEntity entity;
    final CloseableHttpResponse response;

    MyContentStream(BException ex, HttpEntity entity, CloseableHttpResponse response) {
      this.ex = ex;
      this.entity = entity;
      this.response = response;
      Header header = entity.getContentType();
      contentType = header != null ? header.getValue() : BContentStream.DEFAULT_CONTENT_TYPE;
      contentLength = entity.getContentLength();
    }

    public InputStream ensureStream() throws IOException {
      return entity.getContent();
    }

    public void close() throws IOException {
      super.close();
      if (response != null) {
        response.close();
      }
      AsfGetStream.this.done();
    }

  };

}
