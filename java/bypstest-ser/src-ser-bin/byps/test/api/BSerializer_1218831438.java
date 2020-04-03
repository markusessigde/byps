package byps.test.api;

/*
 * Serializer for java.util.List<java.io.InputStream>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerList DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_1218831438 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1218831438();
	
	public BSerializer_1218831438() {
		super(1218831438);
	}
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final int n = bbuf.getLength();
		final ArrayList<java.io.InputStream> arr = new ArrayList<java.io.InputStream>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.io.InputStream obj = (java.io.InputStream)bin.readObj(false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		java.util.List<java.io.InputStream> arr = (java.util.List<java.io.InputStream>)obj1;
		int n = arr.size();
		bbuf.putLength(n);
		for (java.io.InputStream obj : arr) {
			// checkpoint byps.gen.j.PrintContext:340
			bout.writeObj(obj, false, null);
		}
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		List<java.io.InputStream> arr = (List<java.io.InputStream>)obj1;
		for (java.io.InputStream obj : arr) {
			bin.prepareForLazyLoading(obj, null);
		}
	}
	
}
