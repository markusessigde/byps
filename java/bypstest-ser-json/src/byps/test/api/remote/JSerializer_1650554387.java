package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DListList
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
public class JSerializer_1650554387 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1650554387();
	
	public JSerializer_1650554387() {
		super(1650554387);
	}
	
	public JSerializer_1650554387(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteInlineInstance_getPoint2DListList obj = (BRequest_RemoteInlineInstance_getPoint2DListList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_getPoint2DListList()));
		
		return obj;
	}
	
}
