package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BStub_RemoteInlineInstance
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_567395951 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_567395951();
	
	public JSerializer_567395951() {
		super(567395951);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteInlineInstance(transport);
	}
	
}
