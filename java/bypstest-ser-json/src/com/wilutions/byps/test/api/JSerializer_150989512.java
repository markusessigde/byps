﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1752158699
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
public class JSerializer_150989512 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_150989512();
	
	
	public JSerializer_150989512() {
		super(150989512);
	}
	
	public JSerializer_150989512(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1752158699 obj = (BResult_1752158699)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1752158699.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1752158699 obj = (BResult_1752158699)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1752158699()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.List<int[]>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1752158699.instance);
		
		return obj;
	}
	
}
