﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_getPoint2DListList
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
public class JSerializer_177127926 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_177127926();
	
	
	public JSerializer_177127926() {
		super(177127926);
	}
	
	public JSerializer_177127926(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteInlineInstance_getPoint2DListList obj = (BRequest_RemoteInlineInstance_getPoint2DListList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_getPoint2DListList()));
		
		return obj;
	}
	
}
