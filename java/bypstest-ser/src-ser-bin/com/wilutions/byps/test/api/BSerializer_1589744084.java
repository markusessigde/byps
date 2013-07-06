﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.inl.Point2D[][]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1589744084 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1589744084();
	
	public BSerializer_1589744084() {
		super(1589744084);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = bmodel.pointerSize;
		final com.wilutions.byps.test.api.inl.Point2D[][] arr = (com.wilutions.byps.test.api.inl.Point2D[][])obj;
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
		final com.wilutions.byps.test.api.inl.Point2D[][] arr =  new com.wilutions.byps.test.api.inl.Point2D[n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final com.wilutions.byps.test.api.inl.Point2D[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final com.wilutions.byps.test.api.inl.Point2D[] a0 = a1[i1];
			for (int i0 = 0; i0 < n0; i0++) {
				a0[i0] = (com.wilutions.byps.test.api.inl.Point2D)bin.readObj(false, com.wilutions.byps.test.api.inl.BSerializer_1835035436.instance);
			}
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final com.wilutions.byps.test.api.inl.Point2D[][] arr = (com.wilutions.byps.test.api.inl.Point2D[][])obj1;
		
		// lengths
		final int n1 = arr.length;
		final int n0 = n1!=0 ? arr[0].length : 0;
		bbuf.putLength(n1);
		bbuf.putLength(n0);
		
		// write
		final com.wilutions.byps.test.api.inl.Point2D[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final com.wilutions.byps.test.api.inl.Point2D[] a0 = a1[i1];
			for (int i0 = 0; i0 < n0; i0++) {
				bout.writeObj(a0[i0], false, com.wilutions.byps.test.api.inl.BSerializer_1835035436.instance);
			}
		}
	}
	
}
