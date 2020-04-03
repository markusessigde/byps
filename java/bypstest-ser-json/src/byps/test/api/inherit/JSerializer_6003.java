package byps.test.api.inherit;

/*
 * Serializer for byps.test.api.inherit.Class3
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_6003 extends byps.test.api.inherit.JSerializer_6002 {
	
	public final static BSerializer instance = new JSerializer_6003();
	
	public JSerializer_6003() {
		super(6003);
	}
	
	public JSerializer_6003(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final Class3 obj = (Class3)obj1;		
		super.internalWrite(obj1, bout, bbuf);		
		bbuf.putInt("int3", obj.int3);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final Class3 obj = (Class3)(obj1 != null ? obj1 : bin.onObjectCreated(new Class3()));
		
		// Read base class members
		super.internalRead(obj, bin);
		
		final BJsonObject js = bin.currentObject;
		obj.int3 = js.getInt("int3");
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		super.prepareForLazyLoading(obj1, bin, version);
		final Class3 obj = (Class3)(obj1);		
		
	}
	
}
