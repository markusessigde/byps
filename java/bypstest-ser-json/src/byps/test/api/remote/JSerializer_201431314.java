package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setByte
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
public class JSerializer_201431314 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_201431314();
	
	public JSerializer_201431314() {
		super(201431314);
	}
	
	public JSerializer_201431314(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes1dim_setByte obj = (BRequest_RemoteArrayTypes1dim_setByte)obj1;		
		bbuf.putArrayByte("v", obj.v);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes1dim_setByte obj = (BRequest_RemoteArrayTypes1dim_setByte)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setByte()));
		
		final BJsonObject js = bin.currentObject;
		obj.v = js.getArrayByte("v");
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteArrayTypes1dim_setByte obj = (BRequest_RemoteArrayTypes1dim_setByte)(obj1);		
		
	}
	
}
