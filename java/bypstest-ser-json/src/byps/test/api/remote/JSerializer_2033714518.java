package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes1dim_getLong
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
public class JSerializer_2033714518 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2033714518();
	
	public JSerializer_2033714518() {
		super(2033714518);
	}
	
	public JSerializer_2033714518(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes1dim_getLong obj = (BRequest_RemoteArrayTypes1dim_getLong)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_getLong()));
		
		return obj;
	}
	
}
