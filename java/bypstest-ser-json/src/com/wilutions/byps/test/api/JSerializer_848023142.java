﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_100361105
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
public class JSerializer_848023142 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_848023142();
	
	
	public JSerializer_848023142() {
		super(848023142);
	}
	
	public JSerializer_848023142(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_100361105 obj = (BResult_100361105)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_100361105 obj = (BResult_100361105)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_100361105()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (int[])bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_100361105.instance);
		
		return obj;
	}
	
}
