package byps.test.api.ver;

/*
 * Serializer for byps.test.api.ver.BRequest_EvolveIF_sendEvolveToClient
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_714115141 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_714115141();
	
	public JSerializer_714115141() {
		super(714115141);
	}
	
	public JSerializer_714115141(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_EvolveIF_sendEvolveToClient obj = (BRequest_EvolveIF_sendEvolveToClient)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_EvolveIF_sendEvolveToClient()));
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
	}
	
}
