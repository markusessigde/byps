package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteReferences_setNode
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_693117721 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_693117721();
	
	public JSerializer_693117721() {
		super(693117721);
	}
	
	public JSerializer_693117721(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteReferences_setNode obj = (BRequest_RemoteReferences_setNode)obj1;		
		bout.writeObj("v",obj.v, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteReferences_setNode obj = (BRequest_RemoteReferences_setNode)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteReferences_setNode()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (byps.test.api.refs.Node)bin.readObj("v", false, null);
		
		return obj;
	}
	
}
