﻿package com.wilutions.byps.test.api.srvr;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import com.wilutions.byps.*;

/**
 * This class provides a skeleton implementation of the interface ClientIF.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_ClientIF extends BSkeleton implements ClientIFAsync {
	
	public final static long serialVersionUID = 1784257353L;
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public int incrementInt(int a) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void incrementInt(int a, final BAsyncResult<Integer> asyncResult) {
		try {
			int ret = incrementInt(a);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public java.util.List<java.io.InputStream> getStreams(int ctrl) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getStreams(int ctrl, final BAsyncResult<java.util.List<java.io.InputStream>> asyncResult) {
		try {
			java.util.List<java.io.InputStream> ret = getStreams(ctrl);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void putStreams(java.util.List<java.io.InputStream> strm, int ctrl, final BAsyncResult<Object> asyncResult) {
		try {
			putStreams(strm, ctrl);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public ChatStructure sendChat(ChatStructure cs) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void sendChat(ChatStructure cs, final BAsyncResult<ChatStructure> asyncResult) {
		try {
			ChatStructure ret = sendChat(cs);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}
