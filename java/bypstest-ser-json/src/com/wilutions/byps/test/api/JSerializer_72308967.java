﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1503107601
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
public class JSerializer_72308967 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_72308967();
	
	
	public JSerializer_72308967() {
		super(72308967);
	}
	
	public JSerializer_72308967(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1503107601 obj = (BResult_1503107601)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1503107601.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1503107601 obj = (BResult_1503107601)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1503107601()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1503107601.instance);
		
		return obj;
	}
	
}
