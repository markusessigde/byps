﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_703065817
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
public class JSerializer_1169980470 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1169980470();
	
	
	public JSerializer_1169980470() {
		super(1169980470);
	}
	
	public JSerializer_1169980470(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_703065817 obj = (BResult_703065817)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_703065817.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_703065817 obj = (BResult_703065817)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_703065817()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.prim.PrimitiveTypes>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_703065817.instance);
		
		return obj;
	}
	
}
