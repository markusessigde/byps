﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteArrayTypes4dim_getBool extends BMethodRequest implements Serializable {

	
	private final static long serialVersionUID = 2032852344L;
	
	public int getRemoteId() { return 1557173854; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes4dimAsync __byps__remoteT = (RemoteArrayTypes4dimAsync)__byps__remote;			
			BAsyncResultSendMethod<boolean[][][][]> __byps__outerResult = new BAsyncResultSendMethod<boolean[][][][]>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_945713488());			
			__byps__remoteT.async_getBool(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
