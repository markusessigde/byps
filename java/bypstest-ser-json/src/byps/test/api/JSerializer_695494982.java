package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_955752991
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
public class JSerializer_695494982 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_695494982();
	
	public JSerializer_695494982() {
		super(695494982);
	}
	
	public JSerializer_695494982(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_955752991 obj = (BResult_955752991)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_955752991 obj = (BResult_955752991)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_955752991()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (byps.test.api.srvr.ClientIF)bin.readObj("result", false, null);
		
		return obj;
	}
	
}
