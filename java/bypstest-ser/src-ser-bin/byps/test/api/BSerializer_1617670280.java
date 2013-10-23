package byps.test.api;

/*
 * Serializer for java.util.List<java.lang.Boolean>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1617670280 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1617670280();
	
	public BSerializer_1617670280() {
		super(1617670280);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<java.lang.Boolean> arr = new ArrayList<java.lang.Boolean>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Boolean obj = bbuf.getBoolean();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.lang.Boolean> arr = (java.util.List<java.lang.Boolean>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Boolean obj : arr) {
			bbuf.putBoolean(obj != null ? (Boolean)obj : false);
		}
	}
	
}
