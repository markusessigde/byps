﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteListTypes_setByte2
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
public class JSerializer_758429071 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_758429071();
	
	
	public JSerializer_758429071() {
		super(758429071);
	}
	
	public JSerializer_758429071(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteListTypes_setByte2 obj = (BRequest_RemoteListTypes_setByte2)obj1;		
		bout.writeObj("byte2",obj.byte2, false, com.wilutions.byps.test.api.JSerializer_1174971318.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteListTypes_setByte2 obj = (BRequest_RemoteListTypes_setByte2)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteListTypes_setByte2()));
		
		final BJsonObject js = bin.currentObject;
		obj.byte2 = (java.util.List<byte[]>)bin.readObj("byte2", false, com.wilutions.byps.test.api.JSerializer_1174971318.instance);
		
		return obj;
	}
	
}
