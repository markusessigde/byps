﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1174971318
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
public class JSerializer_994835305 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_994835305();
	
	
	public JSerializer_994835305() {
		super(994835305);
	}
	
	public JSerializer_994835305(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1174971318 obj = (BResult_1174971318)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1174971318.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1174971318 obj = (BResult_1174971318)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1174971318()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.List<byte[]>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1174971318.instance);
		
		return obj;
	}
	
}
