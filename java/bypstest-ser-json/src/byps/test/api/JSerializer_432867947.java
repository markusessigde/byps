package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_432867947 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_432867947();
	
	public JSerializer_432867947() {
		super(432867947);
	}
	
	public JSerializer_432867947(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1 obj = (BResult_1)obj1;		
		bbuf.putBoolean("result", obj.result);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1 obj = (BResult_1)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = js.getBoolean("result");
		
		return obj;
	}
	
}
