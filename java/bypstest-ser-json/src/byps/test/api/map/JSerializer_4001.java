package byps.test.api.map;

/*
 * Serializer for byps.test.api.map.MapTypes
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=14

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_4001 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_4001();
	
	public JSerializer_4001() {
		super(4001);
	}
	
	public JSerializer_4001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final MapTypes obj = (MapTypes)obj1;		
		bout.writeObj("boolean1",obj.boolean1, false, byps.test.api.JSerializer_1279823631.instance);
		bout.writeObj("byte1",obj.byte1, false, byps.test.api.JSerializer_1972793385.instance);
		bout.writeObj("byte2",obj.byte2, false, byps.test.api.JSerializer_1799280818.instance);
		bout.writeObj("char1",obj.char1, false, byps.test.api.JSerializer_8789515.instance);
		bout.writeObj("date1",obj.date1, false, byps.test.api.JSerializer_1366799209.instance);
		bout.writeObj("double1",obj.double1, false, byps.test.api.JSerializer_1487265161.instance);
		bout.writeObj("float1",obj.float1, false, byps.test.api.JSerializer_94341197.instance);
		bout.writeObj("int1",obj.int1, false, byps.test.api.JSerializer_1347703734.instance);
		bout.writeObj("int2",obj.int2, false, byps.test.api.JSerializer_1633750383.instance);
		bout.writeObj("long1",obj.long1, false, byps.test.api.JSerializer_1973996106.instance);
		bout.writeObj("obj1",obj.obj1, false, byps.test.api.JSerializer_1488550492.instance);
		bout.writeObj("primitiveTypes1",obj.primitiveTypes1, false, byps.test.api.JSerializer_1831201218.instance);
		bout.writeObj("short1",obj.short1, false, byps.test.api.JSerializer_601099730.instance);
		bout.writeObj("string1",obj.string1, false, byps.test.api.JSerializer_1710660846.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final MapTypes obj = (MapTypes)(obj1 != null ? obj1 : bin.onObjectCreated(new MapTypes()));
		
		final BJsonObject js = bin.currentObject;
		obj.boolean1 = (java.util.Map<java.lang.String,java.lang.Boolean>)bin.readObj("boolean1", false, byps.test.api.JSerializer_1279823631.instance);
		obj.byte1 = (java.util.HashMap<java.lang.Double,java.lang.Byte>)bin.readObj("byte1", false, byps.test.api.JSerializer_1972793385.instance);
		obj.byte2 = (java.util.Map<java.lang.Integer,byte[]>)bin.readObj("byte2", false, byps.test.api.JSerializer_1799280818.instance);
		obj.char1 = (java.util.TreeMap<java.lang.Float,java.lang.Character>)bin.readObj("char1", false, byps.test.api.JSerializer_8789515.instance);
		obj.date1 = (java.util.Map<java.lang.String,java.util.Date>)bin.readObj("date1", false, byps.test.api.JSerializer_1366799209.instance);
		obj.double1 = (java.util.Map<java.lang.Byte,java.lang.Double>)bin.readObj("double1", false, byps.test.api.JSerializer_1487265161.instance);
		obj.float1 = (java.util.Map<java.lang.Character,java.lang.Float>)bin.readObj("float1", false, byps.test.api.JSerializer_94341197.instance);
		obj.int1 = (java.util.Map<java.lang.Integer,java.lang.Integer>)bin.readObj("int1", false, byps.test.api.JSerializer_1347703734.instance);
		obj.int2 = (java.util.Map<java.lang.Integer,int[]>)bin.readObj("int2", false, byps.test.api.JSerializer_1633750383.instance);
		obj.long1 = (java.util.Map<java.lang.Short,java.lang.Long>)bin.readObj("long1", false, byps.test.api.JSerializer_1973996106.instance);
		obj.obj1 = (java.util.Map<java.lang.String,java.lang.Object>)bin.readObj("obj1", false, byps.test.api.JSerializer_1488550492.instance);
		obj.primitiveTypes1 = (java.util.Map<java.lang.Integer,byps.test.api.prim.PrimitiveTypes>)bin.readObj("primitiveTypes1", false, byps.test.api.JSerializer_1831201218.instance);
		obj.short1 = (java.util.Map<java.lang.Long,java.lang.Short>)bin.readObj("short1", false, byps.test.api.JSerializer_601099730.instance);
		obj.string1 = (java.util.Map<java.lang.String,java.lang.String>)bin.readObj("string1", false, byps.test.api.JSerializer_1710660846.instance);
		
		return obj;
	}
	
}
