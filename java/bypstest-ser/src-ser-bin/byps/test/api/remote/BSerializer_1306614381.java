package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysObject
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1306614381 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1306614381();
	
	public BSerializer_1306614381() {
		super(1306614381);
	}
	
	public BSerializer_1306614381(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysObject obj = (BRequest_RemoteArrayTypes23_sendArraysObject)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.arr2, false, byps.test.api.BSerializer_340213335.instance);
		bout.writeObj(obj.arr3, false, byps.test.api.BSerializer_527503353.instance);
		bout.writeObj(obj.arr4, false, byps.test.api.BSerializer_124584219.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes23_sendArraysObject obj = (BRequest_RemoteArrayTypes23_sendArraysObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysObject()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.arr2 = (java.lang.Object[][])bin.readObj(false, byps.test.api.BSerializer_340213335.instance);
		obj.arr3 = (java.lang.Object[][][])bin.readObj(false, byps.test.api.BSerializer_527503353.instance);
		obj.arr4 = (java.lang.Object[][][][])bin.readObj(false, byps.test.api.BSerializer_124584219.instance);
		
		return obj;
	}
	
}
