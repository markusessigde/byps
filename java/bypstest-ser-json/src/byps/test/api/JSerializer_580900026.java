package byps.test.api;

/*
 * Serializer for byps.test.api.BResult_769021986
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_580900026 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_580900026();
	
	public JSerializer_580900026() {
		super(580900026);
	}
	
	public JSerializer_580900026(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_769021986 obj = (BResult_769021986)obj1;		
		bout.writeObj("result",obj.result, false, byps.test.api.JSerializer_769021986.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_769021986 obj = (BResult_769021986)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_769021986()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (char[][][][])bin.readObj("result", false, byps.test.api.JSerializer_769021986.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BResult_769021986 obj = (BResult_769021986)(obj1);		
		
	}
	
}
