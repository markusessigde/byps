package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemotePrimitiveTypes_setObject
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_1425359520 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1425359520();
	
	public JSerializer_1425359520() {
		super(1425359520);
	}
	
	public JSerializer_1425359520(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)obj1;		
		bout.writeObj("v",obj.v, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_setObject()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = (java.lang.Object)bin.readObj("v", false, null);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemotePrimitiveTypes_setObject obj = (BRequest_RemotePrimitiveTypes_setObject)(obj1);		
		bin.prepareForLazyLoading(obj.v, null);
		
	}
	
}
