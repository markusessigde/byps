package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setByte
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
public class JSerializer_185816843 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_185816843();
	
	public JSerializer_185816843() {
		super(185816843);
	}
	
	public JSerializer_185816843(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes4dim_setByte obj = (BRequest_RemoteArrayTypes4dim_setByte)obj1;		
		bout.writeObj("v",obj.v, false, byps.test.api.JSerializer_1201775504.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes4dim_setByte obj = (BRequest_RemoteArrayTypes4dim_setByte)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setByte()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (byte[][][][])bin.readObj("v", false, byps.test.api.JSerializer_1201775504.instance);
		
		return obj;
	}
	
}
