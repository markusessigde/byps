﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_39910537
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_1682941350 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1682941350();
	
	
	public JSerializer_1682941350() {
		super(1682941350);
	}
	
	public JSerializer_1682941350(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_39910537 obj = (BResult_39910537)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_39910537.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_39910537 obj = (BResult_39910537)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_39910537()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (int[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_39910537.instance);
		
		return obj;
	}
	
}
