﻿package com.wilutions.byps.test.api.remote;

/*
 * Serializer for com.wilutions.byps.test.api.remote.BStub_RemoteArrayTypes23
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_2081058997 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_2081058997();
	
	public JSerializer_2081058997() {
		super(2081058997);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_RemoteArrayTypes23(transport);
	}
	
}
