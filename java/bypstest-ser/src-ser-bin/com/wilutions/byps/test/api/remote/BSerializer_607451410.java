﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes23_sendArraysString
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
public class BSerializer_607451410 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_607451410();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: arr2 */ + 4		
		       /* pos=4: arr3 */ + 4		
		       /* pos=8: arr4 */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_607451410() {
		super(607451410);
	}
	
	public BSerializer_607451410(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteArrayTypes23_sendArraysString obj = (BRequest_RemoteArrayTypes23_sendArraysString)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.arr2, true, com.wilutions.byps.test.api.BSerializer_1995260457.instance);
		bout.writeObj(obj.arr3, true, com.wilutions.byps.test.api.BSerializer_1889888075.instance);
		bout.writeObj(obj.arr4, true, com.wilutions.byps.test.api.BSerializer_588723219.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes23_sendArraysString obj = (BRequest_RemoteArrayTypes23_sendArraysString)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes23_sendArraysString()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.arr2 = (java.lang.String[][])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1995260457.instance);
		obj.arr3 = (java.lang.String[][][])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_1889888075.instance);
		obj.arr4 = (java.lang.String[][][][])bin.readObj(true, com.wilutions.byps.test.api.BSerializer_588723219.instance);
		
		return obj;
	}
	
}
