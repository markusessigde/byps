package byps.test.api;

/*
 * Serializer for byps.test.api.inl.Point2D[][][][]
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerArray DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class BSerializer_949340697 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_949340697();
	
	public BSerializer_949340697() {
		super(949340697);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		
		// lengths
		final int n3 = bbuf.getLength();
		final int n2 = bbuf.getLength();
		final int n1 = bbuf.getLength();
		final int n0 = bbuf.getLength();
		
		// create array
		final byps.test.api.inl.Point2D[][][][] arr =  new byps.test.api.inl.Point2D[n3][n2][n1][n0];
		bin.onObjectCreated(arr);
		
		// read
		final byps.test.api.inl.Point2D[][][][] a3 = arr;
		for (int i3 = 0; i3 < n3; i3++) {
			final byps.test.api.inl.Point2D[][][] a2 = a3[i3];
			for (int i2 = 0; i2 < n2; i2++) {
				final byps.test.api.inl.Point2D[][] a1 = a2[i2];
				for (int i1 = 0; i1 < n1; i1++) {
					final byps.test.api.inl.Point2D[] a0 = a1[i1];
					for (int i0 = 0; i0 < n0; i0++) {
						a0[i0] = (byps.test.api.inl.Point2D)bin.readObj(false, byps.test.api.inl.BSerializer_1835035436.instance);
					}
				}
			}
		}
		
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version) throws BException {
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		
		final byps.test.api.inl.Point2D[][][][] arr = (byps.test.api.inl.Point2D[][][][])obj1;
		
		// lengths
		final int n3 = arr.length;
		final int n2 = n3!=0 ? arr[0].length : 0;
		final int n1 = n2!=0 ? arr[0][0].length : 0;
		final int n0 = n1!=0 ? arr[0][0][0].length : 0;
		bbuf.putLength(n3);
		bbuf.putLength(n2);
		bbuf.putLength(n1);
		bbuf.putLength(n0);
		
		// write
		final byps.test.api.inl.Point2D[][][][] a3 = arr;
		for (int i3 = 0; i3 < n3; i3++) {
			final byps.test.api.inl.Point2D[][][] a2 = a3[i3];
			for (int i2 = 0; i2 < n2; i2++) {
				final byps.test.api.inl.Point2D[][] a1 = a2[i2];
				for (int i1 = 0; i1 < n1; i1++) {
					final byps.test.api.inl.Point2D[] a0 = a1[i1];
					for (int i0 = 0; i0 < n0; i0++) {
						bout.writeObj(a0[i0], false, byps.test.api.inl.BSerializer_1835035436.instance);
					}
				}
			}
		}
	}
	
}
