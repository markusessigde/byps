package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_setDouble1
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
public class BSerializer_467931660 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_467931660();
	
	public BSerializer_467931660() {
		super(467931660);
	}
	
	public BSerializer_467931660(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteMapTypes_setDouble1 obj = (BRequest_RemoteMapTypes_setDouble1)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.double1, false, byps.test.api.BSerializer_1487265161.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteMapTypes_setDouble1 obj = (BRequest_RemoteMapTypes_setDouble1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setDouble1()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.double1 = (java.util.Map<java.lang.Byte,java.lang.Double>)bin.readObj(false, byps.test.api.BSerializer_1487265161.instance);
		
		return obj;
	}
	
}
