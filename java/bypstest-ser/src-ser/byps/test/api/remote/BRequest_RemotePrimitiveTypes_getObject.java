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
public final class BRequest_RemotePrimitiveTypes_getObject extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1210742444L;
	
	public int getRemoteId() { return 456456; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemotePrimitiveTypesAsync __byps__remoteT = (RemotePrimitiveTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.lang.Object> __byps__outerResult = new BAsyncResultSendMethod<java.lang.Object>(__byps__asyncResult, new byps.test.api.BResult_21());			
			__byps__remoteT.getObject(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemotePrimitiveTypes.getObject(");
		s.append(")]");
		return s.toString();
	}
	
}
