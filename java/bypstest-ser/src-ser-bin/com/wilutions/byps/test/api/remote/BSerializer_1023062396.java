﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteArrayTypes1dim_setObject
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint com.wilutions.byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1023062396 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1023062396();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: v */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1023062396() {
		super(1023062396);
	}
	
	public BSerializer_1023062396(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteArrayTypes1dim_setObject obj = (BRequest_RemoteArrayTypes1dim_setObject)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.v, false, com.wilutions.byps.test.api.BSerializer_183594037.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteArrayTypes1dim_setObject obj = (BRequest_RemoteArrayTypes1dim_setObject)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes1dim_setObject()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.v = (java.lang.Object[])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_183594037.instance);
		
		return obj;
	}
	
}
