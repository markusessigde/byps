﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_2078696281
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
public class JSerializer_212739126 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_212739126();
	
	
	public JSerializer_212739126() {
		super(212739126);
	}
	
	public JSerializer_212739126(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_2078696281 obj = (BResult_2078696281)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_2078696281 obj = (BResult_2078696281)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_2078696281()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (com.wilutions.byps.test.api.ver.EvolveIF)bin.readObj("result", false, null);
		
		return obj;
	}
	
}
