package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemotePrimitiveTypes
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_1178916877 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_1178916877();
	
	public JSerializer_1178916877() {
		super(1178916877);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemotePrimitiveTypes(transport);
	}
	
}
