﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_181681714
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
public class JSerializer_1414119390 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1414119390();
	
	
	public JSerializer_1414119390() {
		super(1414119390);
	}
	
	public JSerializer_1414119390(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_181681714 obj = (BResult_181681714)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_181681714 obj = (BResult_181681714)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_181681714()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.List<java.lang.Integer>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_181681714.instance);
		
		return obj;
	}
	
}
