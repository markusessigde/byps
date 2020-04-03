package byps.test.api.remote;

/*
 * Serializer for byps.test.api.remote.BRequest_RemotePrimitiveTypes_makeDate
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=7

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class JSerializer_1918934973 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1918934973();
	
	public JSerializer_1918934973() {
		super(1918934973);
	}
	
	public JSerializer_1918934973(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BRequest_RemotePrimitiveTypes_makeDate obj = (BRequest_RemotePrimitiveTypes_makeDate)obj1;		
		bbuf.putInt("day", obj.day);
		bbuf.putInt("hour", obj.hour);
		bbuf.putInt("millisecond", obj.millisecond);
		bbuf.putInt("minute", obj.minute);
		bbuf.putInt("month", obj.month);
		bbuf.putInt("second", obj.second);
		bbuf.putInt("year", obj.year);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BRequest_RemotePrimitiveTypes_makeDate obj = (BRequest_RemotePrimitiveTypes_makeDate)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemotePrimitiveTypes_makeDate()));
		
		final BJsonObject js = bin.currentObject;
		obj.day = js.getInt("day");
		obj.hour = js.getInt("hour");
		obj.millisecond = js.getInt("millisecond");
		obj.minute = js.getInt("minute");
		obj.month = js.getInt("month");
		obj.second = js.getInt("second");
		obj.year = js.getInt("year");
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_RemotePrimitiveTypes_makeDate obj = (BRequest_RemotePrimitiveTypes_makeDate)(obj1);		
		
	}
	
}
