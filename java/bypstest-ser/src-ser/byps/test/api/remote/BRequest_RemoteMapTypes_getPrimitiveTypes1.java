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
public final class BRequest_RemoteMapTypes_getPrimitiveTypes1 extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1745799327L;
	
	public int getRemoteId() { return 664304990; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteMapTypesAsync __byps__remoteT = (RemoteMapTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>> __byps__outerResult = new BAsyncResultSendMethod<java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>>(__byps__asyncResult, new byps.test.api.BResult_1831201218());			
			__byps__remoteT.getPrimitiveTypes1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}