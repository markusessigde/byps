package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_1898022288
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
public class JSerializer_515346332 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_515346332();
	
	public JSerializer_515346332() {
		super(515346332);
	}
	
	public JSerializer_515346332(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1898022288 obj = (BResult_1898022288)obj1;		
		bout.writeObj("result",obj.result, false, byps.test.api.JSerializer_1898022288.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1898022288 obj = (BResult_1898022288)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1898022288()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Set<java.lang.Float>)bin.readObj("result", false, byps.test.api.JSerializer_1898022288.instance);
		
		return obj;
	}
	
}
