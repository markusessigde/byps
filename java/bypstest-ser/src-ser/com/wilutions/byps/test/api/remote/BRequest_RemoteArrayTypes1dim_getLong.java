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
public final class BRequest_RemoteArrayTypes1dim_getLong extends BMethodRequest implements Serializable {

	
	private final static long serialVersionUID = 1645902061L;
	
	public int getRemoteId() { return 1557084481; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteArrayTypes1dimAsync __byps__remoteT = (RemoteArrayTypes1dimAsync)__byps__remote;			
			BAsyncResultSendMethod<long[]> __byps__outerResult = new BAsyncResultSendMethod<long[]>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1097129250());			
			__byps__remoteT.async_getLong(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
