﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1898022288
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
public class JSerializer_1716302523 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1716302523();
	
	
	public JSerializer_1716302523() {
		super(1716302523);
	}
	
	public JSerializer_1716302523(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1898022288 obj = (BResult_1898022288)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1898022288.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1898022288 obj = (BResult_1898022288)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1898022288()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Set<java.lang.Float>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1898022288.instance);
		
		return obj;
	}
	
}
