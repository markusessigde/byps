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
public final class BRequest_RemotePrimitiveTypes_setPrimitiveTypes extends BMethodRequest implements Serializable {

	public byps.test.api.prim.PrimitiveTypes v;
	
	public final static long serialVersionUID = 225526541L;
	
	public int getRemoteId() { return 1178916877; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemotePrimitiveTypesAsync __byps__remoteT = (RemotePrimitiveTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new byps.test.api.BResult_19());			
			__byps__remoteT.setPrimitiveTypes(v, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemotePrimitiveTypes.setPrimitiveTypes(");
		s.append(v);
		s.append(")]");
		return s.toString();
	}
	
}
