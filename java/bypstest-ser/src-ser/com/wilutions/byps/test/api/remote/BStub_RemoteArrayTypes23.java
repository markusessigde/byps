﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

public class BStub_RemoteArrayTypes23 extends BStub implements RemoteArrayTypes23Async, java.io.Serializable {
	
	public final static long serialVersionUID = 2081058997L;
	
	public BStub_RemoteArrayTypes23(final BTransport transport) {
		super(transport);		
	}
	
	public int[] sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4) throws BException, InterruptedException {
		final BSyncResult<int[]> asyncResult = new BSyncResult<int[]>();		
		async_sendArraysInt(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4, final BAsyncResult<int[]> asyncResult) {
		BRequest_RemoteArrayTypes23_sendArraysInt req = new BRequest_RemoteArrayTypes23_sendArraysInt();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		BAsyncResultReceiveMethod<int[]> outerResult = new BAsyncResultReceiveMethod<int[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public java.lang.String[] sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4) throws BException, InterruptedException {
		final BSyncResult<java.lang.String[]> asyncResult = new BSyncResult<java.lang.String[]>();		
		async_sendArraysString(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4, final BAsyncResult<java.lang.String[]> asyncResult) {
		BRequest_RemoteArrayTypes23_sendArraysString req = new BRequest_RemoteArrayTypes23_sendArraysString();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		BAsyncResultReceiveMethod<java.lang.String[]> outerResult = new BAsyncResultReceiveMethod<java.lang.String[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public com.wilutions.byps.test.api.prim.PrimitiveTypes[] sendArraysClass(com.wilutions.byps.test.api.prim.PrimitiveTypes[][] arr2, com.wilutions.byps.test.api.prim.PrimitiveTypes[][][] arr3, com.wilutions.byps.test.api.prim.PrimitiveTypes[][][][] arr4) throws BException, InterruptedException {
		final BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]>();		
		async_sendArraysClass(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_sendArraysClass(com.wilutions.byps.test.api.prim.PrimitiveTypes[][] arr2, com.wilutions.byps.test.api.prim.PrimitiveTypes[][][] arr3, com.wilutions.byps.test.api.prim.PrimitiveTypes[][][][] arr4, final BAsyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult) {
		BRequest_RemoteArrayTypes23_sendArraysClass req = new BRequest_RemoteArrayTypes23_sendArraysClass();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		BAsyncResultReceiveMethod<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.prim.PrimitiveTypes[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public java.lang.Object[] sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4) throws BException, InterruptedException {
		final BSyncResult<java.lang.Object[]> asyncResult = new BSyncResult<java.lang.Object[]>();		
		async_sendArraysObject(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4, final BAsyncResult<java.lang.Object[]> asyncResult) {
		BRequest_RemoteArrayTypes23_sendArraysObject req = new BRequest_RemoteArrayTypes23_sendArraysObject();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		BAsyncResultReceiveMethod<java.lang.Object[]> outerResult = new BAsyncResultReceiveMethod<java.lang.Object[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	public com.wilutions.byps.test.api.inl.Point2D[] sendArraysInline(com.wilutions.byps.test.api.inl.Point2D[][] arr2, com.wilutions.byps.test.api.inl.Point2D[][][] arr3, com.wilutions.byps.test.api.inl.Point2D[][][][] arr4) throws BException, InterruptedException {
		final BSyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.inl.Point2D[]>();		
		async_sendArraysInline(arr2, arr3, arr4, asyncResult);
		return asyncResult.getResult();		
	}
	public void async_sendArraysInline(com.wilutions.byps.test.api.inl.Point2D[][] arr2, com.wilutions.byps.test.api.inl.Point2D[][][] arr3, com.wilutions.byps.test.api.inl.Point2D[][][][] arr4, final BAsyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult) {
		BRequest_RemoteArrayTypes23_sendArraysInline req = new BRequest_RemoteArrayTypes23_sendArraysInline();		
		req.arr2 = arr2;
		req.arr3 = arr3;
		req.arr4 = arr4;
		BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[]> outerResult = new BAsyncResultReceiveMethod<com.wilutions.byps.test.api.inl.Point2D[]>(asyncResult);
		transport.send(req, outerResult);
	}
	
	
}
