package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemotePrimitiveTypes_getDouble
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
public class JSerializer_1513332250 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1513332250();
	
	public JSerializer_1513332250() {
		super(1513332250);
	}
	
	public JSerializer_1513332250(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_getDouble obj = (BRequest_RemotePrimitiveTypes_getDouble)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_getDouble()));
		
		return obj;
	}
	
}
