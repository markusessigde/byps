package byps.test.api;

/*
 * Serializer for java.util.Date[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArray DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_1406664368 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1406664368();
	
	public BSerializer_1406664368() {
		super(1406664368);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n0 = bbuf.getLength();
		
		// create array
		final java.util.Date[] arr =  new java.util.Date[n0];
		bin.onObjectCreated(arr);
		
		
		final java.util.Date[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bbuf.getDate();
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final java.util.Date[] arr = (java.util.Date[])obj1;
		
		// lengths
		final int n0 = arr.length;
		bbuf.putLength(n0);
		
		
		final java.util.Date[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			// checkpoint byps.gen.j.PrintContext:370
			bbuf.putDate((java.util.Date)a0[i0]);
		}
	}
	
}
