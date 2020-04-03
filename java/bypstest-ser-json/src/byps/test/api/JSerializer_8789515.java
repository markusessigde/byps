package byps.test.api;

/*
 * Serializer for java.util.TreeMap<java.lang.Float,java.lang.Character>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMapJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_8789515 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_8789515();
	
	public JSerializer_8789515() {
		super(8789515);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final TreeMap<java.lang.Float,java.lang.Character> map = new TreeMap<java.lang.Float,java.lang.Character>();
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.Float key = keyName != null && keyName.length() != 0 ? Float.parseFloat(keyName) : 0.0f;
			final java.lang.Character value = js.getChar(keyName);
			map.put(key, value);
		}
		return map;
	}
	
	// checkpoint byps.gen.j.GenSerMapJson:80
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? key.toString() : "";
		// checkpoint byps.gen.j.PrintContext:359
		bbuf.putChar(keyName, value != null ? (Character)value : ((char)0));
	}
	
}
