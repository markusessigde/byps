﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteInlineInstance_setPoint2DListList
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
public class BSerializer_1097161578 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1097161578();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: pointListList */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_1097161578() {
		super(1097161578);
	}
	
	public BSerializer_1097161578(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final int version) throws BException {
		final BRequest_RemoteInlineInstance_setPoint2DListList obj = (BRequest_RemoteInlineInstance_setPoint2DListList)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.pointListList, false, com.wilutions.byps.test.api.BSerializer_1463615848.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteInlineInstance_setPoint2DListList obj = (BRequest_RemoteInlineInstance_setPoint2DListList)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteInlineInstance_setPoint2DListList()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.pointListList = (java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_1463615848.instance);
		
		return obj;
	}
	
}
