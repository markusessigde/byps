package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setInt
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1530512055 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1530512055();
	
	public BSerializer_1530512055() {
		super(1530512055);
	}
	
	public BSerializer_1530512055(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteArrayTypes1dim_setInt obj = (BRequest_RemoteArrayTypes1dim_setInt)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.v, false, byps.test.api.BSerializer_100361105.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes1dim_setInt obj = (BRequest_RemoteArrayTypes1dim_setInt)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setInt()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = (int[])bin.readObj(false, byps.test.api.BSerializer_100361105.instance);
		
		return obj;
	}
	
}
