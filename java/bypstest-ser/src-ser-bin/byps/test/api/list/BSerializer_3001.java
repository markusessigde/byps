package byps.test.api.list;

/*
 * Serializer for byps.test.api.list.ListTypes
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=15

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_3001 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_3001();
	
	public BSerializer_3001() {
		super(3001);
	}
	
	public BSerializer_3001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final ListTypes obj = (ListTypes)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.boolean1, false, byps.test.api.BSerializer_1617670280.instance);
		bout.writeObj(obj.byte1, false, byps.test.api.BSerializer_1059148284.instance);
		bout.writeObj(obj.byte2, false, byps.test.api.BSerializer_1174971318.instance);
		bout.writeObj(obj.char1, false, byps.test.api.BSerializer_1661807911.instance);
		bout.writeObj(obj.date1, false, byps.test.api.BSerializer_1504867122.instance);
		bout.writeObj(obj.double1, false, byps.test.api.BSerializer_1555345627.instance);
		bout.writeObj(obj.float1, false, byps.test.api.BSerializer_1628501332.instance);
		bout.writeObj(obj.int1, false, byps.test.api.BSerializer_181681714.instance);
		bout.writeObj(obj.int2, false, byps.test.api.BSerializer_1752158699.instance);
		bout.writeObj(obj.int4, false, byps.test.api.BSerializer_1088217157.instance);
		bout.writeObj(obj.long1, false, byps.test.api.BSerializer_1050216688.instance);
		bout.writeObj(obj.obj1, false, byps.BSerializer_12.instance);
		bout.writeObj(obj.primitiveTypes1, false, byps.test.api.BSerializer_1596367810.instance);
		bout.writeObj(obj.short1, false, byps.test.api.BSerializer_1997002548.instance);
		bout.writeObj(obj.string1, false, byps.test.api.BSerializer_2123584667.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final ListTypes obj = (ListTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new ListTypes()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.boolean1 = (java.util.List<java.lang.Boolean>)bin.readObj(false, byps.test.api.BSerializer_1617670280.instance);
		obj.byte1 = (java.util.List<java.lang.Byte>)bin.readObj(false, byps.test.api.BSerializer_1059148284.instance);
		obj.byte2 = (java.util.List<byte[]>)bin.readObj(false, byps.test.api.BSerializer_1174971318.instance);
		obj.char1 = (java.util.List<java.lang.Character>)bin.readObj(false, byps.test.api.BSerializer_1661807911.instance);
		obj.date1 = (java.util.List<java.util.Date>)bin.readObj(false, byps.test.api.BSerializer_1504867122.instance);
		obj.double1 = (java.util.List<java.lang.Double>)bin.readObj(false, byps.test.api.BSerializer_1555345627.instance);
		obj.float1 = (java.util.List<java.lang.Float>)bin.readObj(false, byps.test.api.BSerializer_1628501332.instance);
		obj.int1 = (java.util.List<java.lang.Integer>)bin.readObj(false, byps.test.api.BSerializer_181681714.instance);
		obj.int2 = (java.util.List<int[]>)bin.readObj(false, byps.test.api.BSerializer_1752158699.instance);
		obj.int4 = (java.util.List<int[][][][]>)bin.readObj(false, byps.test.api.BSerializer_1088217157.instance);
		obj.long1 = (java.util.List<java.lang.Long>)bin.readObj(false, byps.test.api.BSerializer_1050216688.instance);
		obj.obj1 = (java.util.List<java.lang.Object>)bin.readObj(false, byps.BSerializer_12.instance);
		obj.primitiveTypes1 = (java.util.List<byps.test.api.prim.PrimitiveTypes>)bin.readObj(false, byps.test.api.BSerializer_1596367810.instance);
		obj.short1 = (java.util.List<java.lang.Short>)bin.readObj(false, byps.test.api.BSerializer_1997002548.instance);
		obj.string1 = (java.util.List<java.lang.String>)bin.readObj(false, byps.test.api.BSerializer_2123584667.instance);
		
		return obj;
	}
	
}
