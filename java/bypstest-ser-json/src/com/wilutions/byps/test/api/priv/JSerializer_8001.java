﻿package com.wilutions.byps.test.api.priv;

/*
 * Serializer for com.wilutions.byps.test.api.priv.PrivateMembers
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=21

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_8001 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_8001();
	
	
	public JSerializer_8001() {
		super(8001);
	}
	
	public JSerializer_8001(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final PrivateMembers obj = (PrivateMembers)obj1;		
		bbuf.putBoolean("boolVal", obj.isBoolVal());
		bbuf.putByte("byteVal", obj.getByteVal());
		bbuf.putChar("charVal", obj.getCharVal());
		bbuf.putDouble("doubleVal", obj.getDoubleVal());
		bbuf.putFloat("floatVal", obj.getFloatVal());
		bbuf.putInt("intVal", obj.getIntVal());
		bbuf.putLong("longVal", obj.getLongVal());
		bbuf.putInt("pprotInt", obj.pprotInt);
		bbuf.putInt("protInt", obj.protInt);
		bbuf.putShort("shortVal", obj.getShortVal());
		bbuf.putString("stringVal", obj.getStringVal());
		bout.writeObj("arrBool",obj.getArrBool(), false, com.wilutions.byps.test.api.JSerializer_2058423690.instance);
		bout.writeObj("arrInt",obj.getArrInt(), false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		bout.writeObj("arrPrimitiveTypes",obj.getArrPrimitiveTypes(), false, com.wilutions.byps.test.api.JSerializer_801243127.instance);
		bout.writeObj("arrString",obj.getArrString(), true, com.wilutions.byps.test.api.JSerializer_1888107655.instance);
		bout.writeObj("listBool",obj.getListBool(), false, com.wilutions.byps.test.api.JSerializer_1617670280.instance);
		bout.writeObj("listInt",obj.getListInt(), false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		bout.writeObj("listPrimitiveTypes",obj.getListPrimitiveTypes(), false, com.wilutions.byps.test.api.JSerializer_1544333227.instance);
		bout.writeObj("listString",obj.getListString(), false, com.wilutions.byps.test.api.JSerializer_2123584667.instance);
		bout.writeObj("mapIntListString",obj.getMapIntListString(), false, com.wilutions.byps.test.api.JSerializer_132175071.instance);
		bout.writeObj("primitiveTypes",obj.getPrimitiveTypes(), false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final PrivateMembers obj = (PrivateMembers)(obj1 != null ? obj1 : bin.onObjectCreated(new PrivateMembers()));
		
		final BJsonObject js = bin.currentObject;
		obj.setBoolVal(js.getBoolean("boolVal"));
		obj.setByteVal(js.getByte("byteVal"));
		obj.setCharVal(js.getChar("charVal"));
		obj.setDoubleVal(js.getDouble("doubleVal"));
		obj.setFloatVal(js.getFloat("floatVal"));
		obj.setIntVal(js.getInt("intVal"));
		obj.setLongVal(js.getLong("longVal"));
		obj.pprotInt = js.getInt("pprotInt");
		obj.protInt = js.getInt("protInt");
		obj.setShortVal(js.getShort("shortVal"));
		obj.setStringVal(js.getString("stringVal"));
		obj.setArrBool((boolean[])bin.readObj("arrBool", false, com.wilutions.byps.test.api.JSerializer_2058423690.instance));
		obj.setArrInt((int[])bin.readObj("arrInt", false, com.wilutions.byps.test.api.JSerializer_100361105.instance));
		obj.setArrPrimitiveTypes((com.wilutions.byps.test.api.prim.PrimitiveTypes[])bin.readObj("arrPrimitiveTypes", false, com.wilutions.byps.test.api.JSerializer_801243127.instance));
		obj.setArrString((java.lang.String[])bin.readObj("arrString", true, com.wilutions.byps.test.api.JSerializer_1888107655.instance));
		obj.setListBool((java.util.List<java.lang.Boolean>)bin.readObj("listBool", false, com.wilutions.byps.test.api.JSerializer_1617670280.instance));
		obj.setListInt((java.util.List<java.lang.Integer>)bin.readObj("listInt", false, com.wilutions.byps.test.api.JSerializer_181681714.instance));
		obj.setListPrimitiveTypes((java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj("listPrimitiveTypes", false, com.wilutions.byps.test.api.JSerializer_1544333227.instance));
		obj.setListString((java.util.List<java.lang.String>)bin.readObj("listString", false, com.wilutions.byps.test.api.JSerializer_2123584667.instance));
		obj.setMapIntListString((java.util.Map<java.lang.Integer,java.util.List<java.lang.String>>)bin.readObj("mapIntListString", false, com.wilutions.byps.test.api.JSerializer_132175071.instance));
		obj.setPrimitiveTypes((com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj("primitiveTypes", false, null));
		
		return obj;
	}
	
}
