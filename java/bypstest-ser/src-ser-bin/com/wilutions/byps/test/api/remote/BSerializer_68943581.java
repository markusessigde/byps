﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BRequest_RemoteWithAuthentication_expire
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

@SuppressWarnings("all")
public class BSerializer_68943581 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_68943581();
	
	public int size(final Object obj, final BBinaryModel bmodel) throws BException {
		return 0
		       /* size of base class */ + 0
		       /* pos=0: sess */ + 4		
		       /* padding up to multiple of alignment */ + 4;		
	}
	
	public BSerializer_68943581() {
		super(68943581);
	}
	
	public BSerializer_68943581(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_RemoteWithAuthentication_expire obj = (BRequest_RemoteWithAuthentication_expire)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.sess, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_RemoteWithAuthentication_expire obj = (BRequest_RemoteWithAuthentication_expire)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_expire()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.sess = (com.wilutions.byps.test.api.auth.SessionInfo)bin.readObj(false, null);
		
		return obj;
	}
	
}
