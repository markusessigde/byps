package byps.test.api.srvr;

/*
 * Serializer for byps.test.api.srvr.BRequest_ClientIF_putStreams
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_2016865344 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2016865344();
	
	public JSerializer_2016865344() {
		super(2016865344);
	}
	
	public JSerializer_2016865344(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_ClientIF_putStreams obj = (BRequest_ClientIF_putStreams)obj1;		
		bbuf.putInt("ctrl", obj.ctrl);
		bout.writeObj("strm",obj.strm, false, byps.test.api.JSerializer_1218831438.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_ClientIF_putStreams obj = (BRequest_ClientIF_putStreams)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_ClientIF_putStreams()));
		
		final BJsonObject js = bin.currentObject;
		obj.ctrl = js.getInt("ctrl");
		obj.strm = (java.util.List<java.io.InputStream>)bin.readObj("strm", false, byps.test.api.JSerializer_1218831438.instance);
		
		return obj;
	}
	
}