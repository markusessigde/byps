﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_19
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
public class JSerializer_309901669 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_309901669();
	
	
	public JSerializer_309901669() {
		super(309901669);
	}
	
	public JSerializer_309901669(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_19 obj = (BResult_19)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_19()));
		
		final BJsonObject js = bin.currentObject;
		// void result		
		return obj;
	}
	
}
