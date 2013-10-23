package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.Long,java.lang.Short>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMap DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class BSerializer_601099730 extends BSerializer_13 {
	
	public final static BSerializer instance = new BSerializer_601099730();
	
	public BSerializer_601099730() {
		super(601099730);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BBufferBin bbuf = bin.bbuf;
		final HashMap<java.lang.Long,java.lang.Short> map = new HashMap<java.lang.Long,java.lang.Short>();
		bin.onObjectCreated(map);
		int n = bbuf.getLength();
		for (int i0 = 0; i0 < n; i0++) {
			java.lang.Long key = bbuf.getLong();
			java.lang.Short value = bbuf.getShort();
			map.put(key, value);
		}
		return map;
	}
	
	public void write(Object obj1, BOutput bout1, final long version)  throws BException {
		BOutputBin bout = (BOutputBin)bout1;
		BBufferBin bbuf = bout.bbuf;
		Map<java.lang.Long,java.lang.Short> map = (Map<java.lang.Long,java.lang.Short>)obj1;
		int n = map.size();
		bbuf.putLength(n);
		for (Map.Entry<java.lang.Long,java.lang.Short> obj : map.entrySet()) {
			bbuf.putLong(obj.getKey() != null ? (Long)obj.getKey() : 0L);
			bbuf.putShort(obj.getValue() != null ? (Short)obj.getValue() : ((short)0));
		}
	}
	
}
