package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteArrayTypes23
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_769717182 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_769717182();
	
	public JSerializer_769717182() {
		super(769717182);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteArrayTypes23(transport);
	}
	
}
