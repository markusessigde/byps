package byps.test.api;

/*
 * Serializer for java.util.List<java.util.List<byps.test.api.inl.Point2D>>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1823330785 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1823330785();
	
	public BSerializer_1823330785() {
		super(1823330785);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<List<byps.test.api.inl.Point2D>> arr = new ArrayList<List<byps.test.api.inl.Point2D>>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.util.List<byps.test.api.inl.Point2D> obj = (java.util.List<byps.test.api.inl.Point2D>)bin.readObj(false, byps.test.api.BSerializer_2064980445.instance);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.util.List<byps.test.api.inl.Point2D>> arr = (java.util.List<java.util.List<byps.test.api.inl.Point2D>>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.util.List<byps.test.api.inl.Point2D> obj : arr) {
			bout.writeObj(obj, false, byps.test.api.BSerializer_2064980445.instance);
		}
	}
	
}
