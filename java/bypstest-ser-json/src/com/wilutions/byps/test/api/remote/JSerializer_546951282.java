﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DMap
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
public class JSerializer_546951282 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_546951282();
	
	
	public JSerializer_546951282() {
		super(546951282);
	}
	
	public JSerializer_546951282(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DMap obj = (BRequest_RemoteInlineInstance_setPoint2DMap)obj1;		
		bout.writeObj("pointMap",obj.pointMap, false, com.wilutions.byps.test.api.JSerializer_1851881336.instance);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DMap obj = (BRequest_RemoteInlineInstance_setPoint2DMap)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DMap()));
		
		final BJsonObject js = bin.currentObject;
		obj.pointMap = (java.util.Map<java.lang.Integer,com.wilutions.byps.test.api.inl.Point2D>)bin.readObj("pointMap", false, com.wilutions.byps.test.api.JSerializer_1851881336.instance);
		
		return obj;
	}
	
}
