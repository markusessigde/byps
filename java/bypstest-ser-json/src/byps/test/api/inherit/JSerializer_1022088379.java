package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.BRequest_LemonService_pick
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1022088379 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1022088379();
	
	public JSerializer_1022088379() {
		super(1022088379);
	}
	
	public JSerializer_1022088379(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_LemonService_pick obj = (BRequest_LemonService_pick)obj1;		
		bbuf.putString("fromTree", obj.fromTree);
		bout.writeObj("sess",obj.sess, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_LemonService_pick obj = (BRequest_LemonService_pick)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_LemonService_pick()));
		
		final BJsonObject js = bin.currentObject;
		obj.fromTree = js.getString("fromTree");
		obj.sess = (byps.test.api.auth.SessionInfo)bin.readObj("sess", false, null);
		
		return obj;
	}
	
}
