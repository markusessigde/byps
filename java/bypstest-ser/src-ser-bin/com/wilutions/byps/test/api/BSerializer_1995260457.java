﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.lang.String[][]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1995260457 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1995260457();
	
	public BSerializer_1995260457() {
		super(1995260457);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = 4;
		final java.lang.String[][] arr = (java.lang.String[][])obj;
		int n = arr.length;
		if (n != 0) {
			n *= arr[0].length;
		}
		return bmodel.computeArrayWireSize(elementSize, n);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n1 = bbuf.getLength();
		final int n0 = bbuf.getLength();
		
		// create array
		final java.lang.String[][] arr =  new java.lang.String[n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final java.lang.String[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final java.lang.String[] a0 = a1[i1];
			for (int i0 = 0; i0 < n0; i0++) {
				a0[i0] = bbuf.getString();
			}
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final java.lang.String[][] arr = (java.lang.String[][])obj1;
		
		// lengths
		final int n1 = arr.length;
		final int n0 = n1!=0 ? arr[0].length : 0;
		bbuf.putLength(n1);
		bbuf.putLength(n0);
		
		// write
		final java.lang.String[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final java.lang.String[] a0 = a1[i1];
			for (int i0 = 0; i0 < n0; i0++) {
				bbuf.putString(a0[i0] != null ? (String)a0[i0] : "");
			}
		}
	}
	
}
