package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_2067161310
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
public class BSerializer_925799231 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_925799231();
	
	public BSerializer_925799231() {
		super(925799231);
	}
	
	public BSerializer_925799231(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_2067161310 obj = (BResult_2067161310)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, byps.test.api.BSerializer_2067161310.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_2067161310 obj = (BResult_2067161310)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_2067161310()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (short[])bin.readObj(false, byps.test.api.BSerializer_2067161310.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BResult_2067161310 obj = (BResult_2067161310)(obj1);		
		
	}
	
}
