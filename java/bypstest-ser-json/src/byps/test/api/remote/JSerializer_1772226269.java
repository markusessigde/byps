package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteSetTypes_getInt2
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
public class JSerializer_1772226269 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1772226269();
	
	public JSerializer_1772226269() {
		super(1772226269);
	}
	
	public JSerializer_1772226269(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteSetTypes_getInt2 obj = (BRequest_RemoteSetTypes_getInt2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteSetTypes_getInt2()));
		
		return obj;
	}
	
}
