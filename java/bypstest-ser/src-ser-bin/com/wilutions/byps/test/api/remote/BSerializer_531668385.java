﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DArray4dim
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
public class BSerializer_531668385 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_531668385();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: pointArray */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_531668385() {
		super(531668385);
	}
	
	public BSerializer_531668385(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DArray4dim obj = (BRequest_RemoteInlineInstance_setPoint2DArray4dim)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.pointArray, false, com.wilutions.byps.test.api.BSerializer_487702928.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_setPoint2DArray4dim obj = (BRequest_RemoteInlineInstance_setPoint2DArray4dim)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DArray4dim()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.pointArray = (com.wilutions.byps.test.api.inl.Point2D[][][][])bin.readObj(false, com.wilutions.byps.test.api.BSerializer_487702928.instance);
		
		return obj;
	}
	
}
