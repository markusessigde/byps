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
public class BSerializer_224357548 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_224357548();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: pointList */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_224357548() {
		super(224357548);
	}
	
	public BSerializer_224357548(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DList obj = (BRequest_RemoteInlineInstance_setPoint2DList)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.pointList, false, com.wilutions.byps.test.api.BSerializer_172221196.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_setPoint2DList obj = (BRequest_RemoteInlineInstance_setPoint2DList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DList()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.pointList = (java.util.List<com.wilutions.byps.test.api.inl.Point2D>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_172221196.instance);
		
		return obj;
	}
	
}
