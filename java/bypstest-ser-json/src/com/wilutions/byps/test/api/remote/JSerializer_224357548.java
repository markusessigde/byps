﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DList
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
public class JSerializer_224357548 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_224357548();
	
	
	public JSerializer_224357548() {
		super(224357548);
	}
	
	public JSerializer_224357548(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DList obj = (BRequest_RemoteInlineInstance_setPoint2DList)obj1;		
		bout.writeObj("pointList",obj.pointList, false, com.wilutions.byps.test.api.JSerializer_172221196.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DList obj = (BRequest_RemoteInlineInstance_setPoint2DList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DList()));
		
		final BJsonObject js = bin.currentObject;
		obj.pointList = (java.util.List<com.wilutions.byps.test.api.inl.Point2D>)bin.readObj("pointList", false, com.wilutions.byps.test.api.JSerializer_172221196.instance);
		
		return obj;
	}
	
}
