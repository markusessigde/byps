﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_6
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
public class BSerializer_148544157 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_148544157();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: result */ + 8		
		       /* padding up to multiple of alignment */ + 0;		
	}
	
	public BSerializer_148544157() {
		super(148544157);
	}
	
	public BSerializer_148544157(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BResult_6 obj = (BResult_6)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putLong(obj.result);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_6 obj = (BResult_6)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_6()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = bbuf.getLong();
		
		return obj;
	}
	
}
