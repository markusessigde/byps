package byps.test.api;

/*
 * Serializer for java.util.Set<java.lang.Double>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1320560671 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1320560671();
	
	public BSerializer_1320560671() {
		super(1320560671);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final HashSet<java.lang.Double> arr = new HashSet<java.lang.Double>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Double obj = bbuf.getDouble();
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.Set<java.lang.Double> arr = (java.util.Set<java.lang.Double>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.lang.Double obj : arr) {
			bbuf.putDouble(obj != null ? (Double)obj : 0.0);
		}
	}
	
}