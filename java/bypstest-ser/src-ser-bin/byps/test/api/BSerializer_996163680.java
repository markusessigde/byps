package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_124584219
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
public class BSerializer_996163680 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_996163680();
	
	public BSerializer_996163680() {
		super(996163680);
	}
	
	public BSerializer_996163680(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_124584219 obj = (BResult_124584219)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, byps.test.api.BSerializer_124584219.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_124584219 obj = (BResult_124584219)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_124584219()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (java.lang.Object[][][][])bin.readObj(false, byps.test.api.BSerializer_124584219.instance);
		
		return obj;
	}
	
}
