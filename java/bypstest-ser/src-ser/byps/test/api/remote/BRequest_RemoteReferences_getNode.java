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
public final class BRequest_RemoteReferences_getNode extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1366991859L;
	
	public int getRemoteId() { return 568637225; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteReferencesAsync __byps__remoteT = (RemoteReferencesAsync)__byps__remote;			
			BAsyncResultSendMethod<byps.test.api.refs.Node> __byps__outerResult = new BAsyncResultSendMethod<byps.test.api.refs.Node>(__byps__asyncResult, new byps.test.api.BResult_9001());			
			__byps__remoteT.getNode(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteReferences.getNode(");
		s.append(")]");
		return s.toString();
	}
	
}
