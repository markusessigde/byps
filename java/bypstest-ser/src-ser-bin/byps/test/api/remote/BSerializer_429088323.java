package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteConstants
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_429088323 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_429088323();
	
	public BSerializer_429088323() {
		super(429088323);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteConstants(transport);
	}
	
}