﻿package com.wilutions.byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_ServerIF_getPartner extends BMethodRequest implements Serializable {

	
	public final static long serialVersionUID = 748402113L;
	
	public int getRemoteId() { return 1313562065; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final ServerIFAsync __byps__remoteT = (ServerIFAsync)__byps__remote;			
			BAsyncResultSendMethod<ClientIF> __byps__outerResult = new BAsyncResultSendMethod<ClientIF>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_1473575576());			
			__byps__remoteT.getPartner(__byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
