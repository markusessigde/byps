package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteReferences_getNode
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
public class JSerializer_1366991859 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1366991859();
	
	public JSerializer_1366991859() {
		super(1366991859);
	}
	
	public JSerializer_1366991859(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteReferences_getNode obj = (BRequest_RemoteReferences_getNode)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteReferences_getNode()));
		
		return obj;
	}
	
}
