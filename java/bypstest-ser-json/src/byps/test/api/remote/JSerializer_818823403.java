package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteStreams_getTextStream
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
public class JSerializer_818823403 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_818823403();
	
	public JSerializer_818823403() {
		super(818823403);
	}
	
	public JSerializer_818823403(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteStreams_getTextStream obj = (BRequest_RemoteStreams_getTextStream)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteStreams_getTextStream()));
		
		return obj;
	}
	
}
