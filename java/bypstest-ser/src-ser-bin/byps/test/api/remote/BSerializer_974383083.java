package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_setBoolean1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_974383083 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_974383083();
	
	public BSerializer_974383083() {
		super(974383083);
	}
	
	public BSerializer_974383083(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteMapTypes_setBoolean1 obj = (BRequest_RemoteMapTypes_setBoolean1)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.boolean1, false, byps.test.api.BSerializer_1279823631.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteMapTypes_setBoolean1 obj = (BRequest_RemoteMapTypes_setBoolean1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setBoolean1()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.boolean1 = (java.util.Map<java.lang.String,java.lang.Boolean>)bin.readObj(false, byps.test.api.BSerializer_1279823631.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemoteMapTypes_setBoolean1 obj = (BRequest_RemoteMapTypes_setBoolean1)(obj1);		
		
	}
	
}
