package byps.test.api;

/*
 * Serializer for java.util.Map<java.lang.String,byps.test.api.enu.EnumPlanets>
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerMapJson DO NOT MODIFY.
 */

import byps.*;
import java.util.*;

@SuppressWarnings("all")
public class JSerializer_493795497 extends JSerializer_13 {
	
	public final static BSerializer instance = new JSerializer_493795497();
	
	public JSerializer_493795497() {
		super(493795497);	}
	
	
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputJson bin = (BInputJson)bin1;
		final BJsonObject js = bin.currentObject;
		final Set<String> keys = js.keys();
		final HashMap<java.lang.String,byps.test.api.enu.EnumPlanets> map = new HashMap<java.lang.String,byps.test.api.enu.EnumPlanets>(keys.size());
		bin.onObjectCreated(map);
		for (String keyName : keys) {
			java.lang.String key = keyName;
			final byps.test.api.enu.EnumPlanets value = BEnumHelper.fromOrdinal(byps.test.api.enu.EnumPlanets.values(), js.getInt(keyName));
			map.put(key, value);
		}
		return map;
	}
	
	@Override
	protected void internalWriteKeyValue(final BOutputJson bout, final BBufferJson bbuf, final Object key, final Object value) throws BException {
		final String keyName = key != null ? (String)key : "";
		bbuf.putInt(keyName, value != null ? ((byps.test.api.enu.EnumPlanets)value).ordinal() : 0);
	}
	
}
