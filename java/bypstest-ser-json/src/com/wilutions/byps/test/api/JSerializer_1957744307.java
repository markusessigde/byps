﻿package com.wilutions.byps.test.api;

/*
 * Serializer for int[][]
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
@SuppressWarnings("all")
public class JSerializer_1957744307 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1957744307();
	
	public JSerializer_1957744307() {
		super(1957744307);
	}
	
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js1 = bin.currentObject;
		
		int n1 = 0, n0 = 0;
		n1 = js1 != null ? js1.size() : 0;
		if (n1 != 0) {
			final BJsonObject js0 = js1.getJsonObject(0);
			n0 = js0 != null ? js0.size() : 0;
		}
		
		final int[][] arr =  new int[n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final int[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final int[] a0 = a1[i1];
			bin.currentObject = js1.getJsonObject(i1);
			for (int i0 = 0; i0 < n0; i0++) {
				a0[i0] = bin.currentObject.getInt(i0);
			}
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final int[][] arr = (int[][])obj1;
		
		// lengths
		final int n1 = arr.length;
		final int n0 = n1!=0 ? arr[0].length : 0;
		
		// write
		final int[][] a1 = arr;
		bbuf.beginArray();
		for (int i1 = 0; i1 < n1; i1++) {
			final int[] a0 = a1[i1];
			bbuf.beginArray();
			for (int i0 = 0; i0 < n0; i0++) {
				bbuf.putInt(a0[i0]);
			}
			bbuf.endArray();
		}
		bbuf.endArray();
	}
	
}
