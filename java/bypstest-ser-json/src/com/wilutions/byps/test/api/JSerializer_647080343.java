﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_124584219
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
public class JSerializer_647080343 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_647080343();
	
	
	public JSerializer_647080343() {
		super(647080343);
	}
	
	public JSerializer_647080343(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_124584219 obj = (BResult_124584219)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_124584219.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_124584219 obj = (BResult_124584219)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_124584219()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.lang.Object[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_124584219.instance);
		
		return obj;
	}
	
}
