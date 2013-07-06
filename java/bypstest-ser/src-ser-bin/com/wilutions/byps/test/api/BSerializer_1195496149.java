﻿package com.wilutions.byps.test.api;

/*
 * Serializer for com.wilutions.byps.test.api.prim.PrimitiveTypes[][]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class BSerializer_1195496149 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1195496149();
	
	public BSerializer_1195496149() {
		super(1195496149);
	}
	
	@Override
	public int size(Object obj, BBinaryModel bmodel) throws BException { 
		final int elementSize = bmodel.pointerSize;
		final com.wilutions.byps.test.api.prim.PrimitiveTypes[][] arr = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][])obj;
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
		final com.wilutions.byps.test.api.prim.PrimitiveTypes[][] arr =  new com.wilutions.byps.test.api.prim.PrimitiveTypes[n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final com.wilutions.byps.test.api.prim.PrimitiveTypes[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final com.wilutions.byps.test.api.prim.PrimitiveTypes[] a0 = a1[i1];
			for (int i0 = 0; i0 < n0; i0++) {
				a0[i0] = (com.wilutions.byps.test.api.prim.PrimitiveTypes)bin.readObj(false, null);
			}
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final int version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final com.wilutions.byps.test.api.prim.PrimitiveTypes[][] arr = (com.wilutions.byps.test.api.prim.PrimitiveTypes[][])obj1;
		
		// lengths
		final int n1 = arr.length;
		final int n0 = n1!=0 ? arr[0].length : 0;
		bbuf.putLength(n1);
		bbuf.putLength(n0);
		
		// write
		final com.wilutions.byps.test.api.prim.PrimitiveTypes[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final com.wilutions.byps.test.api.prim.PrimitiveTypes[] a0 = a1[i1];
			for (int i0 = 0; i0 < n0; i0++) {
				bout.writeObj(a0[i0], false, null);
			}
		}
	}
	
}
