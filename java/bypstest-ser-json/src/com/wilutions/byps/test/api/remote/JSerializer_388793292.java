﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteWithAuthentication_doit
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_388793292 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_388793292();
	
	
	public JSerializer_388793292() {
		super(388793292);
	}
	
	public JSerializer_388793292(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteWithAuthentication_doit obj = (BRequest_RemoteWithAuthentication_doit)obj1;		
		bbuf.putInt("value", obj.value);
		bout.writeObj("sess",obj.sess, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteWithAuthentication_doit obj = (BRequest_RemoteWithAuthentication_doit)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_doit()));
		
		final BJsonObject js = bin.currentObject;
		obj.value = js.getInt("value");
		obj.sess = (com.wilutions.byps.test.api.auth.SessionInfo)bin.readObj("sess", false, null);
		
		return obj;
	}
	
}
