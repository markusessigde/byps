package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BRequest_ClientIF_getStreams
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
public class JSerializer_1654980071 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1654980071();
	
	public JSerializer_1654980071() {
		super(1654980071);
	}
	
	public JSerializer_1654980071(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ClientIF_getStreams obj = (BRequest_ClientIF_getStreams)obj1;		
		bbuf.putInt("ctrl", obj.ctrl);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ClientIF_getStreams obj = (BRequest_ClientIF_getStreams)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ClientIF_getStreams()));
		
		final BJsonObject js = bin.currentObject;
		obj.ctrl = js.getInt("ctrl");
		
		return obj;
	}
	
}
