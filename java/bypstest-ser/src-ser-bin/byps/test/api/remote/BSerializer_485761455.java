package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteEnums
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_485761455 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_485761455();
	
	public BSerializer_485761455() {
		super(485761455);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteEnums(transport);
	}
	
}
