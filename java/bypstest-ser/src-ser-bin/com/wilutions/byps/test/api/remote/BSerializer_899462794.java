﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysInline
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=3

@SuppressWarnings("all")
public class BSerializer_899462794 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_899462794();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: arr2 */ + 4		
		       /* pos=4: arr3 */ + 4		
		       /* pos=8: arr4 */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_899462794() {
		super(899462794);
	}
	
	public BSerializer_899462794(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysInline obj = (BRequest_RemoteArrayTypes23_sendArraysInline)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.arr2, false, com.wilutions.byps.test.api.BSerializer_1589744084.instance);
		bout.writeObj(obj.arr3, false, com.wilutions.byps.test.api.BSerializer_1264295566.instance);
		bout.writeObj(obj.arr4, false, com.wilutions.byps.test.api.BSerializer_487702928.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes23_sendArraysInline obj = (BRequest_RemoteArrayTypes23_sendArraysInline)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysInline()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.arr2 = (com.wilutions.byps.test.api.inl.Point2D[][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1589744084.instance);
		obj.arr3 = (com.wilutions.byps.test.api.inl.Point2D[][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1264295566.instance);
		obj.arr4 = (com.wilutions.byps.test.api.inl.Point2D[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_487702928.instance);
		
		return obj;
	}
	
}
