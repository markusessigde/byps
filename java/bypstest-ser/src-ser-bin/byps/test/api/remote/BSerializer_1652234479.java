package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteServerCtrl
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_1652234479 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1652234479();
	
	public BSerializer_1652234479() {
		super(1652234479);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteServerCtrl(transport);
	}
	
}
