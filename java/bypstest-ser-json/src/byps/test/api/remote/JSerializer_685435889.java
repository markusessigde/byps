package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_setChar1
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
public class JSerializer_685435889 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_685435889();
	
	public JSerializer_685435889() {
		super(685435889);
	}
	
	public JSerializer_685435889(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteMapTypes_setChar1 obj = (BRequest_RemoteMapTypes_setChar1)obj1;		
		bout.writeObj("char1",obj.char1, false, byps.test.api.JSerializer_8789515.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_setChar1 obj = (BRequest_RemoteMapTypes_setChar1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setChar1()));
		
		final BJsonObject js = bin.currentObject;
		obj.char1 = (java.util.TreeMap<java.lang.Float,java.lang.Character>)bin.readObj("char1", false, byps.test.api.JSerializer_8789515.instance);
		
		return obj;
	}
	
}