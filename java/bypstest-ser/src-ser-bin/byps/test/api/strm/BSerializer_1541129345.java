package byps.test.api.strm;

/*
 * Serializer for byps.test.api.strm.Stream1
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=5

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1541129345 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1541129345();
	
	public BSerializer_1541129345() {
		super(1541129345);
	}
	
	public BSerializer_1541129345(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final Stream1 obj = (Stream1)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.getContentType());
		bout.writeObj(obj.getArrStream(), false, byps.test.api.BSerializer_1950626768.instance);
		bout.writeObj(obj.is1, false, null);
		bout.writeObj(obj.getListStream(), false, byps.test.api.BSerializer_1218831438.instance);
		bout.writeObj(obj.mapStream, false, byps.test.api.BSerializer_779528402.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final Stream1 obj = (Stream1)(obj1 != null ? obj1 : bin.onObjectCreated(new Stream1()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.setContentType(bbuf.getString());
		obj.setArrStream((java.io.InputStream[])bin.readObj(false, byps.test.api.BSerializer_1950626768.instance));
		obj.is1 = (java.io.InputStream)bin.readObj(false, null);
		obj.setListStream((java.util.List<java.io.InputStream>)bin.readObj(false, byps.test.api.BSerializer_1218831438.instance));
		obj.mapStream = (java.util.Map<java.lang.Integer,java.io.InputStream>)bin.readObj(false, byps.test.api.BSerializer_779528402.instance);
		
		return obj;
	}
	
}
