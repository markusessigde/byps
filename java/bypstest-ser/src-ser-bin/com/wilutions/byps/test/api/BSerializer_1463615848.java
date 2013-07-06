﻿package com.wilutions.byps.test.api;

/*
 * Serializer for java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>
 * 
 * THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
 */

import com.wilutions.byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1463615848 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1463615848();
	
	public BSerializer_1463615848() {
		super(1463615848);
	}
	
	public Object read(final Object obj1, final BInput bin1, final int version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<List<com.wilutions.byps.test.api.inl.Point2D>> arr = new ArrayList<List<com.wilutions.byps.test.api.inl.Point2D>>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.util.List<com.wilutions.byps.test.api.inl.Point2D> obj = (java.util.List<com.wilutions.byps.test.api.inl.Point2D>)bin.readObj(false, com.wilutions.byps.test.api.BSerializer_172221196.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, int version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>> arr = (java.util.List<java.util.List<com.wilutions.byps.test.api.inl.Point2D>>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.util.List<com.wilutions.byps.test.api.inl.Point2D> obj : arr) {
			bout.writeObj(obj, false, com.wilutions.byps.test.api.BSerializer_172221196.instance);
		}
	}
	
}
