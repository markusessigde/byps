package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DArray4dim
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
public class BSerializer_1355245240 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1355245240();
	
	public BSerializer_1355245240() {
		super(1355245240);
	}
	
	public BSerializer_1355245240(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DArray4dim obj = (BRequest_RemoteInlineInstance_setPoint2DArray4dim)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.pointArray, false, byps.test.api.BSerializer_949340697.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_setPoint2DArray4dim obj = (BRequest_RemoteInlineInstance_setPoint2DArray4dim)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DArray4dim()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.pointArray = (byps.test.api.inl.Point2D[][][][])bin.readObj(false, byps.test.api.BSerializer_949340697.instance);
		
		return obj;
	}
	
}
