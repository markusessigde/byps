package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteMapTypes_getFloat1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_530925397 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_530925397();
	
	public BSerializer_530925397() {
		super(530925397);
	}
	
	public BSerializer_530925397(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteMapTypes_getFloat1 obj = (BRequest_RemoteMapTypes_getFloat1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_getFloat1()));
		
		return obj;
	}
	
}
