package byps.test.api.ver;

/*
 * Serializer for byps.test.api.ver.BRequest_EvolveIF_setEvolve
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
public class JSerializer_1064683365 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1064683365();
	
	public JSerializer_1064683365() {
		super(1064683365);
	}
	
	public JSerializer_1064683365(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_EvolveIF_setEvolve obj = (BRequest_EvolveIF_setEvolve)obj1;		
		bout.writeObj("obj",obj.obj, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_EvolveIF_setEvolve obj = (BRequest_EvolveIF_setEvolve)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_EvolveIF_setEvolve()));
		
		final BJsonObject js = bin.currentObject;
		obj.obj = (byps.test.api.ver.Evolve)bin.readObj("obj", false, null);
		
		return obj;
	}
	
}