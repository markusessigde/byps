package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteListTypes_setInt3
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
public class BSerializer_136821226 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_136821226();
	
	public BSerializer_136821226() {
		super(136821226);
	}
	
	public BSerializer_136821226(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteListTypes_setInt3 obj = (BRequest_RemoteListTypes_setInt3)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.int3, false, byps.test.api.BSerializer_1746702954.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteListTypes_setInt3 obj = (BRequest_RemoteListTypes_setInt3)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setInt3()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.int3 = (java.util.List<java.util.List<java.lang.Integer>>)bin.readObj(false, byps.test.api.BSerializer_1746702954.instance);
		
		return obj;
	}
	
}
