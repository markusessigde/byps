﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1406124761
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
public class JSerializer_104448059 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_104448059();
	
	
	public JSerializer_104448059() {
		super(104448059);
	}
	
	public JSerializer_104448059(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1406124761 obj = (BResult_1406124761)obj1;		
		bout.writeObj("result",obj.result, false, com.wilutions.byps.test.api.JSerializer_1406124761.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1406124761 obj = (BResult_1406124761)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1406124761()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = (java.util.Set<int[]>)bin.readObj("result", false, com.wilutions.byps.test.api.JSerializer_1406124761.instance);
		
		return obj;
	}
	
}
