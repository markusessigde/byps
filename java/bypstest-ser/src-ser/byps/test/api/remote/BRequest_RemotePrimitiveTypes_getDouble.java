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
public final class BRequest_RemotePrimitiveTypes_getDouble extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1513332250L;
	
	public int getRemoteId() { return 1178916877; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemotePrimitiveTypesAsync __byps__remoteT = (RemotePrimitiveTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<Double> __byps__outerResult = new BAsyncResultSendMethod<Double>(__byps__asyncResult, new byps.test.api.BResult_8());			
			__byps__remoteT.getDouble(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemotePrimitiveTypes.getDouble(");
		s.append(")]");
		return s.toString();
	}
	
}
