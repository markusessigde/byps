﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_15
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
public class JSerializer_309901673 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_309901673();
	
	
	public JSerializer_309901673() {
		super(309901673);
	}
	
	public JSerializer_309901673(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_15 obj = (BResult_15)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_15 obj = (BResult_15)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_15()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.io.InputStream)bin.readObj("result", false, null);
		
		return obj;
	}
	
}