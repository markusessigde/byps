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
public final class BRequest_RemoteListTypes_getObj1 extends BMethodRequest implements Serializable {

	
	private final static long serialVersionUID = 874214665L;
	
	public int getRemoteId() { return 380156079; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final RemoteListTypesAsync __byps__remoteT = (RemoteListTypesAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<java.lang.Object>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<java.lang.Object>>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_12());			
			__byps__remoteT.async_getObj1(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
