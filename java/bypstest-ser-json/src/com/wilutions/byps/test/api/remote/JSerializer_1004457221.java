﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysClass
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

@SuppressWarnings("all")
public class JSerializer_1004457221 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1004457221();
	
	
	public JSerializer_1004457221() {
		super(1004457221);
	}
	
	public JSerializer_1004457221(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysClass obj = (BRequest_RemoteArrayTypes23_sendArraysClass)obj1;		
		bout.writeObj("arr2",obj.arr2, false, com.wilutions.byps.test.api.JSerializer_1195496149.instance);
		bout.writeObj("arr3",obj.arr3, false, com.wilutions.byps.test.api.JSerializer_2115528243.instance);
		bout.writeObj("arr4",obj.arr4, false, com.wilutions.byps.test.api.JSerializer_1503107601.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysClass obj = (BRequest_RemoteArrayTypes23_sendArraysClass)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysClass()));
		
		final BJsonObject js = bin.currentObject;
		obj.arr2 = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][])bin.readObj("arr2", false, com.wilutions.byps.test.api.JSerializer_1195496149.instance);
		obj.arr3 = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][][])bin.readObj("arr3", false, com.wilutions.byps.test.api.JSerializer_2115528243.instance);
		obj.arr4 = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][][][])bin.readObj("arr4", false, com.wilutions.byps.test.api.JSerializer_1503107601.instance);
		
		return obj;
	}
	
}
