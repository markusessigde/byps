package byps.test.api;

/*
 * Serializer for java.util.Date[]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArrayJson DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_1406664368 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_1406664368();
	
	public JSerializer_1406664368() {
		super(1406664368);
	}
	
	@Override
	public Object internalRead(final BInputJson bin) throws BException {
		final BJsonObject js0 = bin.currentObject;
		
		int n0 = 0;
		n0 = js0 != null ? js0.size() : 0;
		
		final java.util.Date[] arr =  new java.util.Date[n0];
		bin.onObjectCreated(arr);
		
		// read
		final java.util.Date[] a0 = arr;
		for (int i0 = 0; i0 < n0; i0++) {
			a0[i0] = bin.currentObject.getDate(i0);
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final java.util.Date[] arr = (java.util.Date[])obj1;
		
		// lengths
		final int n0 = arr.length;
		
		// write
		final java.util.Date[] a0 = arr;
		bbuf.beginArray();
		for (int i0 = 0; i0 < n0; i0++) {
			// checkpoint byps.gen.j.PrintContext:343
			bbuf.putDate((java.util.Date)a0[i0]);
		}
		bbuf.endArray();
	}
	
}