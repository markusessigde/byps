﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_2
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
public class JSerializer_148544161 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_148544161();
	
	
	public JSerializer_148544161() {
		super(148544161);
	}
	
	public JSerializer_148544161(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_2 obj = (BResult_2)obj1;		
		bbuf.putByte("result", obj.result);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_2 obj = (BResult_2)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_2()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = js.getByte("result");
		
		return obj;
	}
	
}
