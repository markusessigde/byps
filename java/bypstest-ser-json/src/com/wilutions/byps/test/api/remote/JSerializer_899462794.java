﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysInline
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
public class JSerializer_899462794 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_899462794();
	
	
	public JSerializer_899462794() {
		super(899462794);
	}
	
	public JSerializer_899462794(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysInline obj = (BRequest_RemoteArrayTypes23_sendArraysInline)obj1;		
		bout.writeObj("arr2",obj.arr2, false, com.wilutions.byps.test.api.JSerializer_1589744084.instance);
		bout.writeObj("arr3",obj.arr3, false, com.wilutions.byps.test.api.JSerializer_1264295566.instance);
		bout.writeObj("arr4",obj.arr4, false, com.wilutions.byps.test.api.JSerializer_487702928.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysInline obj = (BRequest_RemoteArrayTypes23_sendArraysInline)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysInline()));
		
		final BJsonObject js = bin.currentObject;
		obj.arr2 = (com.wilutions.byps.test.api.inl.Point2D[][])bin.readObj("arr2", false, com.wilutions.byps.test.api.JSerializer_1589744084.instance);
		obj.arr3 = (com.wilutions.byps.test.api.inl.Point2D[][][])bin.readObj("arr3", false, com.wilutions.byps.test.api.JSerializer_1264295566.instance);
		obj.arr4 = (com.wilutions.byps.test.api.inl.Point2D[][][][])bin.readObj("arr4", false, com.wilutions.byps.test.api.JSerializer_487702928.instance);
		
		return obj;
	}
	
}
