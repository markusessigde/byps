﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1544333227
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
public class JSerializer_743592613 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_743592613();
	
	
	public JSerializer_743592613() {
		super(743592613);
	}
	
	public JSerializer_743592613(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1544333227 obj = (BResult_1544333227)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1544333227.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1544333227 obj = (BResult_1544333227)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1544333227()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.List<com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1544333227.instance);
		
		return obj;
	}
	
}
