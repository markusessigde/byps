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
public final class BRequest_RemoteListTypes_getByte2 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 608486404L;
	
	public int getRemoteId() { return 1233438138; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteListTypesAsync __byps__remoteT = (RemoteListTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<byte[]>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<byte[]>>(__byps__asyncResult, new byps.test.api.BResult_1174971318());			
			__byps__remoteT.getByte2(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteListTypes.getByte2(");
		s.append(")]");
		return s.toString();
	}
	
}
