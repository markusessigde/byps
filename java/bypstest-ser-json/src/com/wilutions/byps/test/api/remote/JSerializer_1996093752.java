﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DList
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=0

@SuppressWarnings("all")
public class JSerializer_1996093752 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1996093752();
	
	
	public JSerializer_1996093752() {
		super(1996093752);
	}
	
	public JSerializer_1996093752(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteInlineInstance_getPoint2DList obj = (BRequest_RemoteInlineInstance_getPoint2DList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_getPoint2DList()));
		
		return obj;
	}
	
}
