package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_766441794
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
public class JSerializer_1167917980 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1167917980();
	
	public JSerializer_1167917980() {
		super(1167917980);
	}
	
	public JSerializer_1167917980(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_766441794 obj = (BResult_766441794)obj1;		
		bout.writeObj("result",obj.result, false, byps.test.api.JSerializer_766441794.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_766441794 obj = (BResult_766441794)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_766441794()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (float[])bin.readObj("result", false, byps.test.api.JSerializer_766441794.instance);
		
		return obj;
	}
	
}
