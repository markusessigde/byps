﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_4
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class JSerializer_148544159 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_148544159();
	
	
	public JSerializer_148544159() {
		super(148544159);
	}
	
	public JSerializer_148544159(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_4 obj = (BResult_4)obj1;		
		bbuf.putChar("result", obj.result);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_4 obj = (BResult_4)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_4()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = js.getChar("result");
		
		return obj;
	}
	
}