﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteMapTypes_setInt1
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1046969349 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1046969349();
	
	
	public JSerializer_1046969349() {
		super(1046969349);
	}
	
	public JSerializer_1046969349(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteMapTypes_setInt1 obj = (BRequest_RemoteMapTypes_setInt1)obj1;		
		bout.writeObj("int1",obj.int1, false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteMapTypes_setInt1 obj = (BRequest_RemoteMapTypes_setInt1)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteMapTypes_setInt1()));
		
		final BJsonObject js = bin.currentObject;
		obj.int1 = (java.util.Map<java.lang.Integer,java.lang.Integer>)bin.readObj("int1", false, com.wilutions.byps.test.api.JSerializer_1347703734.instance);
		
		return obj;
	}
	
}
