﻿package com.wilutions.byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:164
public class BStub_RemoteArrayTypes1dim extends BStub implements RemoteArrayTypes1dimAsync, java.io.Serializable {
	
	// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1557084481L;
	
	public BStub_RemoteArrayTypes1dim(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setBool(boolean[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setBool(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setBool(boolean[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setBool req = new BRequest_RemoteArrayTypes1dim_setBool();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setByte(byte[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setByte(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setByte(byte[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setByte req = new BRequest_RemoteArrayTypes1dim_setByte();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setChar(char[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setChar(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setChar(char[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setChar req = new BRequest_RemoteArrayTypes1dim_setChar();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setShort(short[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setShort(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setShort(short[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setShort req = new BRequest_RemoteArrayTypes1dim_setShort();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setInt(int[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setInt(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setInt(int[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setInt req = new BRequest_RemoteArrayTypes1dim_setInt();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setLong(long[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setLong(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setLong(long[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setLong req = new BRequest_RemoteArrayTypes1dim_setLong();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setFloat(float[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setFloat(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setFloat(float[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setFloat req = new BRequest_RemoteArrayTypes1dim_setFloat();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setDouble(double[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setDouble(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setDouble(double[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setDouble req = new BRequest_RemoteArrayTypes1dim_setDouble();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setString(java.lang.String[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setString(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setString(java.lang.String[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setString req = new BRequest_RemoteArrayTypes1dim_setString();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setPrimitiveTypes(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setPrimitiveTypes(com.wilutions.byps.test.api.prim.PrimitiveTypes[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setPrimitiveTypes req = new BRequest_RemoteArrayTypes1dim_setPrimitiveTypes();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public void setObject(java.lang.Object[] v) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		setObject(v, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void setObject(java.lang.Object[] v, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_setObject req = new BRequest_RemoteArrayTypes1dim_setObject();		
		req.v = v;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public boolean[] getBool() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<boolean[]> asyncResult = new BSyncResult<boolean[]>();		
		getBool(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getBool(final BAsyncResult<boolean[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getBool req = new BRequest_RemoteArrayTypes1dim_getBool();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public byte[] getByte() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<byte[]> asyncResult = new BSyncResult<byte[]>();		
		getByte(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getByte(final BAsyncResult<byte[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getByte req = new BRequest_RemoteArrayTypes1dim_getByte();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public char[] getChar() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<char[]> asyncResult = new BSyncResult<char[]>();		
		getChar(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getChar(final BAsyncResult<char[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getChar req = new BRequest_RemoteArrayTypes1dim_getChar();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public short[] getShort() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<short[]> asyncResult = new BSyncResult<short[]>();		
		getShort(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getShort(final BAsyncResult<short[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getShort req = new BRequest_RemoteArrayTypes1dim_getShort();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public int[] getInt() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<int[]> asyncResult = new BSyncResult<int[]>();		
		getInt(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getInt(final BAsyncResult<int[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getInt req = new BRequest_RemoteArrayTypes1dim_getInt();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public long[] getLong() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<long[]> asyncResult = new BSyncResult<long[]>();		
		getLong(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getLong(final BAsyncResult<long[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getLong req = new BRequest_RemoteArrayTypes1dim_getLong();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public float[] getFloat() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<float[]> asyncResult = new BSyncResult<float[]>();		
		getFloat(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getFloat(final BAsyncResult<float[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getFloat req = new BRequest_RemoteArrayTypes1dim_getFloat();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public double[] getDouble() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<double[]> asyncResult = new BSyncResult<double[]>();		
		getDouble(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getDouble(final BAsyncResult<double[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getDouble req = new BRequest_RemoteArrayTypes1dim_getDouble();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public java.lang.String[] getString() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.lang.String[]> asyncResult = new BSyncResult<java.lang.String[]>();		
		getString(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getString(final BAsyncResult<java.lang.String[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getString req = new BRequest_RemoteArrayTypes1dim_getString();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public com.wilutions.byps.test.api.prim.PrimitiveTypes[] getPrimitiveTypes() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult = new BSyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]>();		
		getPrimitiveTypes(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getPrimitiveTypes(final BAsyncResult<com.wilutions.byps.test.api.prim.PrimitiveTypes[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getPrimitiveTypes req = new BRequest_RemoteArrayTypes1dim_getPrimitiveTypes();		
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:357
	public java.lang.Object[] getObject() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:46
		final BSyncResult<java.lang.Object[]> asyncResult = new BSyncResult<java.lang.Object[]>();		
		getObject(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:401
	public void getObject(final BAsyncResult<java.lang.Object[]> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:113
		BRequest_RemoteArrayTypes1dim_getObject req = new BRequest_RemoteArrayTypes1dim_getObject();		
		transport.sendMethod(req, asyncResult);
	}
	
	
}
