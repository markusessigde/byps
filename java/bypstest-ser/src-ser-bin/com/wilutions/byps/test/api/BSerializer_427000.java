﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.BResult_1888107655
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
public class BSerializer_427000 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_427000();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: result */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_427000() {
		super(427000);
	}
	
	public BSerializer_427000(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BResult_1888107655 obj = (BResult_1888107655)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_1888107655 obj = (BResult_1888107655)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1888107655()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (java.lang.String[])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1888107655.instance);
		
		return obj;
	}
	
}
