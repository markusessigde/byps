﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_846419204
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
public class JSerializer_516356161 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_516356161();
	
	
	public JSerializer_516356161() {
		super(516356161);
	}
	
	public JSerializer_516356161(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_846419204 obj = (BResult_846419204)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_846419204.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_846419204 obj = (BResult_846419204)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_846419204()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (long[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_846419204.instance);
		
		return obj;
	}
	
}
