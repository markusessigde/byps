﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1042475995
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
public class JSerializer_2038872493 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_2038872493();
	
	
	public JSerializer_2038872493() {
		super(2038872493);
	}
	
	public JSerializer_2038872493(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_1042475995 obj = (BResult_1042475995)obj1;		
		bbuf.putInt("result", obj.result!=null ? obj.result.ordinal() : 0);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_1042475995 obj = (BResult_1042475995)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1042475995()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = BEnumHelper.fromOrdinal(com.wilutions.byps.test.api.enu.EnumPlanets.values(), js.getInt("result"));
		
		return obj;
	}
	
}
