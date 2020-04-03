package byps.test.api;

/*
 * Serializer for java.util.TreeSet<java.lang.Character>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_936607009 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_936607009();
	
	public JSerializer_936607009() {
		super(936607009);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final TreeSet<java.lang.Character> arr = new TreeSet<java.lang.Character>();
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Character obj = bin.currentObject.getChar(i0);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.TreeSet<java.lang.Character> arr = (java.util.TreeSet<java.lang.Character>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (java.lang.Character obj : arr) {
			// checkpoint byps.gen.j.PrintContext:359
			bbuf.putChar(obj != null ? (Character)obj : ((char)0));
		}
		bbuf.endArray();
	}
	
}
