﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysObject
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
public class JSerializer_738833892 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_738833892();
	
	
	public JSerializer_738833892() {
		super(738833892);
	}
	
	public JSerializer_738833892(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysObject obj = (BRequest_RemoteArrayTypes23_sendArraysObject)obj1;		
		bout.writeObj("arr2",obj.arr2, false, com.wilutions.byps.test.api.JSerializer_340213335.instance);
		bout.writeObj("arr3",obj.arr3, false, com.wilutions.byps.test.api.JSerializer_527503353.instance);
		bout.writeObj("arr4",obj.arr4, false, com.wilutions.byps.test.api.JSerializer_124584219.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysObject obj = (BRequest_RemoteArrayTypes23_sendArraysObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysObject()));
		
		final BJsonObject js = bin.currentObject;
		obj.arr2 = (java.lang.Object[][])bin.readObj("arr2", false, com.wilutions.byps.test.api.JSerializer_340213335.instance);
		obj.arr3 = (java.lang.Object[][][])bin.readObj("arr3", false, com.wilutions.byps.test.api.JSerializer_527503353.instance);
		obj.arr4 = (java.lang.Object[][][][])bin.readObj("arr4", false, com.wilutions.byps.test.api.JSerializer_124584219.instance);
		
		return obj;
	}
	
}
