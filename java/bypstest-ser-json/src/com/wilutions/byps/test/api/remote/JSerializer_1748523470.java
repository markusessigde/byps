﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysInt
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
public class JSerializer_1748523470 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1748523470();
	
	
	public JSerializer_1748523470() {
		super(1748523470);
	}
	
	public JSerializer_1748523470(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysInt obj = (BRequest_RemoteArrayTypes23_sendArraysInt)obj1;		
		bout.writeObj("arr2",obj.arr2, false, com.wilutions.byps.test.api.JSerializer_1957744307.instance);
		bout.writeObj("arr3",obj.arr3, false, com.wilutions.byps.test.api.JSerializer_196606293.instance);
		bout.writeObj("arr4",obj.arr4, false, com.wilutions.byps.test.api.JSerializer_39910537.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysInt obj = (BRequest_RemoteArrayTypes23_sendArraysInt)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysInt()));
		
		final BJsonObject js = bin.currentObject;
		obj.arr2 = (int[][])bin.readObj("arr2", false, com.wilutions.byps.test.api.JSerializer_1957744307.instance);
		obj.arr3 = (int[][][])bin.readObj("arr3", false, com.wilutions.byps.test.api.JSerializer_196606293.instance);
		obj.arr4 = (int[][][][])bin.readObj("arr4", false, com.wilutions.byps.test.api.JSerializer_39910537.instance);
		
		return obj;
	}
	
}
