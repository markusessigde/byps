package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_1358523233
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
public class JSerializer_1693860029 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1693860029();
	
	public JSerializer_1693860029() {
		super(1693860029);
	}
	
	public JSerializer_1693860029(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1358523233 obj = (BResult_1358523233)obj1;		
		bout.writeObj("result",obj.result, false, byps.test.api.JSerializer_1358523233.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1358523233 obj = (BResult_1358523233)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1358523233()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Map<java.lang.Integer,byps.test.api.inl.Point2D>)bin.readObj("result", false, byps.test.api.JSerializer_1358523233.instance);
		
		return obj;
	}
	
}
