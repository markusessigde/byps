package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteSetTypes
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_1900796440 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_1900796440();
	
	public BSerializer_1900796440() {
		super(1900796440);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteSetTypes(transport);
	}
	
}
