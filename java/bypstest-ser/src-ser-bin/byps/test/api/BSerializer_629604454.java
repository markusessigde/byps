package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_1279823631
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
public class BSerializer_629604454 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_629604454();
	
	public BSerializer_629604454() {
		super(629604454);
	}
	
	public BSerializer_629604454(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_1279823631 obj = (BResult_1279823631)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, byps.test.api.BSerializer_1279823631.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_1279823631 obj = (BResult_1279823631)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1279823631()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (java.util.Map<java.lang.String,java.lang.Boolean>)bin.readObj(false, byps.test.api.BSerializer_1279823631.instance);
		
		return obj;
	}
	
}
