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
public final class BRequest_RemoteArrayTypes1dim_getShort extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 1373101854L;
	
	public int getRemoteId() { return 963816328; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes1dimAsync __byps__remoteT = (RemoteArrayTypes1dimAsync)__byps__remote;			
			BAsyncResultSendMethod<short[]> __byps__outerResult = new BAsyncResultSendMethod<short[]>(__byps__asyncResult, new byps.test.api.BResult_2067161310());			
			__byps__remoteT.getShort(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
		}
	}	
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[RemoteArrayTypes1dim.getShort(");
		s.append(")]");
		return s.toString();
	}
	
}
