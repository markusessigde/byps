package byps.test.api.enu;

/*
 * Serializer for byps.test.api.enu.UsePlanets
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=5

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_10000 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_10000();
	
	public BSerializer_10000() {
		super(10000);
	}
	
	public BSerializer_10000(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final UsePlanets obj = (UsePlanets)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putInt(obj.planet!=null ? obj.planet.ordinal() : 0);
		bbuf.putInt(obj.getPlanet2()!=null ? obj.getPlanet2().ordinal() : 0);
		bout.writeObj(obj.arrayOfPlanets, false, byps.test.api.BSerializer_1441131650.instance);
		bout.writeObj(obj.listOfPlanets, false, byps.test.api.BSerializer_819140569.instance);
		bout.writeObj(obj.mapOfPlanets, false, byps.test.api.BSerializer_493795497.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final UsePlanets obj = (UsePlanets)(obj1 != null ? obj1 : bin.onObjectCreated(new UsePlanets()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.planet = BEnumHelper.fromOrdinal(byps.test.api.enu.EnumPlanets.values(), bbuf.getInt());
		obj.setPlanet2(BEnumHelper.fromOrdinal(byps.test.api.enu.EnumPlanets.values(), bbuf.getInt()));
		obj.arrayOfPlanets = (byps.test.api.enu.EnumPlanets[])bin.readObj(false, byps.test.api.BSerializer_1441131650.instance);
		obj.listOfPlanets = (java.util.ArrayList<byps.test.api.enu.EnumPlanets>)bin.readObj(false, byps.test.api.BSerializer_819140569.instance);
		obj.mapOfPlanets = (java.util.Map<java.lang.String,byps.test.api.enu.EnumPlanets>)bin.readObj(false, byps.test.api.BSerializer_493795497.instance);
		
		return obj;
	}
	
}
