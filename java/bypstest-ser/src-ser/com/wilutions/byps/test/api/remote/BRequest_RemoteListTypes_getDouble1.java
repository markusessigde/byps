﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_RemoteListTypes_getDouble1 implements BMethodRequest, Serializable {

	
	private final static long serialVersionUID = 1741299407L;
	
	@Override
	public int getRemoteId() { return 380156079; }
	
	@Override
	public void execute(BRemote remote, BAsyncResult<Object> asyncResult) throws Throwable {
		try {
			final RemoteListTypesAsync remoteT = (RemoteListTypesAsync)remote;			
			BAsyncResultSendMethod<java.util.List<java.lang.Double>> outerResult = new BAsyncResultSendMethod<java.util.List<java.lang.Double>>(asyncResult, new com.wilutions.byps.test.api.BResult_1555345627());			
			remoteT.async_getDouble1(outerResult);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
