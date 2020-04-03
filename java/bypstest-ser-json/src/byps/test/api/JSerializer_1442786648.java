package byps.test.api;

/*
 * Serializer for java.util.List<byps.test.api.refs.Node>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerListJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_1442786648 extends BSerializer {
	
	public final static BSerializer instance = new JSerializer_1442786648();
	
	public JSerializer_1442786648() {
		super(1442786648);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BBufferJson bbuf = bin.bbuf;
		final int n = bin.currentObject.size();
		final ArrayList<byps.test.api.refs.Node> arr = new ArrayList<byps.test.api.refs.Node>(n);
		bin.onObjectCreated(arr);
		for (int i0 = 0; i0 < n; i0++) {
			byps.test.api.refs.Node obj = (byps.test.api.refs.Node)bin.readObj(i0, false, null);
			arr.add(obj);
		}
		return arr;
	}
	
	@Override
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputJson bout = (BOutputJson)bout1;
		BBufferJson bbuf = bout.bbuf;
		java.util.List<byps.test.api.refs.Node> arr = (java.util.List<byps.test.api.refs.Node>)obj1;
		int n = arr.size();
		bbuf.beginArray();
		for (byps.test.api.refs.Node obj : arr) {
			// checkpoint byps.gen.j.PrintContext:340
			bout.writeObj(null, obj, false, null);
		}
		bbuf.endArray();
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		List<byps.test.api.refs.Node> arr = (List<byps.test.api.refs.Node>)obj1;
		for (byps.test.api.refs.Node obj : arr) {
			bin.prepareForLazyLoading(obj, null);
		}
	}
	
}
