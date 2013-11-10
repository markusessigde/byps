package byps.test.api;

/*
 * Serializer for byps.test.api.inl.Point2D[][]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArrayJson DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_827767075 extends JSerializer_Array {
	
	public final static BSerializer instance = new JSerializer_827767075();
	
	public JSerializer_827767075() {
		super(827767075);
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
		
		final byps.test.api.inl.Point2D[][] arr =  new byps.test.api.inl.Point2D[n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final byps.test.api.inl.Point2D[][] a1 = arr;
		for (int i1 = 0; i1 < n1; i1++) {
			final byps.test.api.inl.Point2D[] a0 = a1[i1];
			bin.currentObject = js1.getJsonObject(i1);
			for (int i0 = 0; i0 < n0; i0++) {
				a0[i0] = (byps.test.api.inl.Point2D)bin.readObj(i0, false, byps.test.api.inl.JSerializer_1835035436.instance);
			}
		}
		return arr;
		
	}
	
	@Override
	public void internalWrite(Object obj1, final BOutputJson bout, BBufferJson bbuf) throws BException {
		final byps.test.api.inl.Point2D[][] arr = (byps.test.api.inl.Point2D[][])obj1;
		
		// lengths
		final int n1 = arr.length;
		final int n0 = n1!=0 ? arr[0].length : 0;
		
		// write
		final byps.test.api.inl.Point2D[][] a1 = arr;
		bbuf.beginArray();
		for (int i1 = 0; i1 < n1; i1++) {
			final byps.test.api.inl.Point2D[] a0 = a1[i1];
			bbuf.beginArray();
			for (int i0 = 0; i0 < n0; i0++) {
				// checkpoint byps.gen.j.PrintContext:313
				bout.writeObj(null, a0[i0], false, byps.test.api.inl.JSerializer_1835035436.instance);
			}
			bbuf.endArray();
		}
		bbuf.endArray();
	}
	
}
