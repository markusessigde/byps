package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface RemoteArrayTypes23Async extends BRemote, 
	RemoteArrayTypes23 {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public int[] sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysInt(int[][] arr2, int[][][] arr3, int[][][][] arr4, final BAsyncResult<int[]> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.String[] sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysString(java.lang.String[][] arr2, java.lang.String[][][] arr3, java.lang.String[][][][] arr4, final BAsyncResult<java.lang.String[]> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public byps.test.api.prim.PrimitiveTypes[] sendArraysClass(byps.test.api.prim.PrimitiveTypes[][] arr2, byps.test.api.prim.PrimitiveTypes[][][] arr3, byps.test.api.prim.PrimitiveTypes[][][][] arr4) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysClass(byps.test.api.prim.PrimitiveTypes[][] arr2, byps.test.api.prim.PrimitiveTypes[][][] arr3, byps.test.api.prim.PrimitiveTypes[][][][] arr4, final BAsyncResult<byps.test.api.prim.PrimitiveTypes[]> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.Object[] sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysObject(java.lang.Object[][] arr2, java.lang.Object[][][] arr3, java.lang.Object[][][][] arr4, final BAsyncResult<java.lang.Object[]> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public byps.test.api.inl.Point2D[] sendArraysInline(byps.test.api.inl.Point2D[][] arr2, byps.test.api.inl.Point2D[][][] arr3, byps.test.api.inl.Point2D[][][][] arr4) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void sendArraysInline(byps.test.api.inl.Point2D[][] arr2, byps.test.api.inl.Point2D[][][] arr3, byps.test.api.inl.Point2D[][][][] arr4, final BAsyncResult<byps.test.api.inl.Point2D[]> asyncResult) ;
	
	
}
