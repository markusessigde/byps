package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_7007
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
public class BSerializer_2076960068 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_2076960068();
	
	public BSerializer_2076960068() {
		super(2076960068);
	}
	
	public BSerializer_2076960068(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_7007 obj = (BResult_7007)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_7007 obj = (BResult_7007)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_7007()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (byps.test.api.srvr.ChatStructure)bin.readObj(false, null);
		
		return obj;
	}
	
}
