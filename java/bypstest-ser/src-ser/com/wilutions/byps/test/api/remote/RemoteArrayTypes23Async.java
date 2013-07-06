﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;

public interface RemoteArrayTypes23Async extends RemoteArrayTypes23, BRemote {

	public void async_sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4, final BAsyncResult<int[]> asyncResult) ;
	
	public void async_sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4, final BAsyncResult<java.lang.String[]> asyncResult) ;
	
	public void async_sendArraysClass(com.wilutions.byps.test.api.prim.PrimitiveTypes[][] arr2, com.wilutions.byps.test.api.prim.PrimitiveTypes[][][] arr3, com.wilutions.byps.test.api.prim.PrimitiveTypes[][][][] arr4, final BAsyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult) ;
	
	public void async_sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4, final BAsyncResult<java.lang.Object[]> asyncResult) ;
	
	public void async_sendArraysInline(com.wilutions.byps.test.api.inl.Point2D[][] arr2, com.wilutions.byps.test.api.inl.Point2D[][][] arr3, com.wilutions.byps.test.api.inl.Point2D[][][][] arr4, final BAsyncResult<com.wilutions.byps.test.api.inl.Point2D[]> asyncResult) ;
	
	
}
