package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteStreams_getImages extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1911998634L;
	
	public int getRemoteId() { return 1043578866; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteStreamsAsync __byps__remoteT = (RemoteStreamsAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.TreeMap<java.lang.Integer,java.io.InputStream>> __byps__outerResult = new BAsyncResultSendMethod<java.util.TreeMap<java.lang.Integer,java.io.InputStream>>(__byps__asyncResult, new byps.test.api.BResult_476459792());			
			__byps__remoteT.getImages(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteStreams.getImages(");
		s.append(")]");
		return s.toString();
	}
	
}
