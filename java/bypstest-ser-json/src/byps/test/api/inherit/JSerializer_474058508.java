package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.BStub_BioLemonService
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_474058508 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_474058508();
	
	public JSerializer_474058508() {
		super(474058508);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_BioLemonService(transport);
	}
	
}