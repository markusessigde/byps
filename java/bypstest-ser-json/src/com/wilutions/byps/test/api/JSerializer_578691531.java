﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1374008726
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
public class JSerializer_578691531 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_578691531();
	
	
	public JSerializer_578691531() {
		super(578691531);
	}
	
	public JSerializer_578691531(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1374008726 obj = (BResult_1374008726)obj1;		
		bbuf.putArrayByte("result", obj.result);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1374008726 obj = (BResult_1374008726)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1374008726()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = js.getArrayByte("result");
		
		return obj;
	}
	
}
