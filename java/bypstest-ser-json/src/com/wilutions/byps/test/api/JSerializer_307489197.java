﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_31512998
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
public class JSerializer_307489197 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_307489197();
	
	
	public JSerializer_307489197() {
		super(307489197);
	}
	
	public JSerializer_307489197(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_31512998 obj = (BResult_31512998)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_31512998.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_31512998 obj = (BResult_31512998)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_31512998()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.HashSet<java.lang.Byte>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_31512998.instance);
		
		return obj;
	}
	
}
