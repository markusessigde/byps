package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteSetTypes_getString1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1183412410 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1183412410();
	
	public JSerializer_1183412410() {
		super(1183412410);
	}
	
	public JSerializer_1183412410(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_getString1 obj = (BRequest_RemoteSetTypes_getString1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_getString1()));
		
		return obj;
	}
	
}
