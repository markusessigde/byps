﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_7007
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
public class JSerializer_1462588845 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1462588845();
	
	
	public JSerializer_1462588845() {
		super(1462588845);
	}
	
	public JSerializer_1462588845(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_7007 obj = (BResult_7007)obj1;		
		bout.writeObj("result",obj.result, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_7007 obj = (BResult_7007)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_7007()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (com.wilutions.byps.test.api.srvr.ChatStructure)bin.readObj("result", false, null);
		
		return obj;
	}
	
}
