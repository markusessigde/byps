﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteWithAuthentication_expire
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
public class JSerializer_68943581 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_68943581();
	
	
	public JSerializer_68943581() {
		super(68943581);
	}
	
	public JSerializer_68943581(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteWithAuthentication_expire obj = (BRequest_RemoteWithAuthentication_expire)obj1;		
		bout.writeObj("sess",obj.sess, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteWithAuthentication_expire obj = (BRequest_RemoteWithAuthentication_expire)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_expire()));
		
		final BJsonObject js = bin.currentObject;
		obj.sess = (com.wilutions.byps.test.api.auth.SessionInfo)bin.readObj("sess", false, null);
		
		return obj;
	}
	
}
