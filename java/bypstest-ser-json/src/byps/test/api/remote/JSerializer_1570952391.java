package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteListTypes_setFloat1
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
public class JSerializer_1570952391 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1570952391();
	
	public JSerializer_1570952391() {
		super(1570952391);
	}
	
	public JSerializer_1570952391(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setFloat1 obj = (BRequest_RemoteListTypes_setFloat1)obj1;		
		bout.writeObj("float1",obj.float1, false, byps.test.api.JSerializer_1628501332.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setFloat1 obj = (BRequest_RemoteListTypes_setFloat1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setFloat1()));
		
		final BJsonObject js = bin.currentObject;
		obj.float1 = (java.util.List<java.lang.Float>)bin.readObj("float1", false, byps.test.api.JSerializer_1628501332.instance);
		
		return obj;
	}
	
}
