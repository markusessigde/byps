﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1201775504
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
public class JSerializer_541741223 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_541741223();
	
	
	public JSerializer_541741223() {
		super(541741223);
	}
	
	public JSerializer_541741223(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1201775504 obj = (BResult_1201775504)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1201775504.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1201775504 obj = (BResult_1201775504)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1201775504()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (byte[][][][])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1201775504.instance);
		
		return obj;
	}
	
}
