package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BStub_ClientIF
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_2049072174 extends BSerializer_16 {
	
	public final static BSerializer instance = new BSerializer_2049072174();
	
	public BSerializer_2049072174() {
		super(2049072174);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_ClientIF(transport);
	}
	
}
