package byps.test.api.ver;

/*
 * Serializer for byps.test.api.ver.BRequest_EvolveIF_setEvolve
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_1064683365 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1064683365();
	
	public BSerializer_1064683365() {
		super(1064683365);
	}
	
	public BSerializer_1064683365(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_EvolveIF_setEvolve obj = (BRequest_EvolveIF_setEvolve)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.obj, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_EvolveIF_setEvolve obj = (BRequest_EvolveIF_setEvolve)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_EvolveIF_setEvolve()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.obj = (byps.test.api.ver.Evolve)bin.readObj(false, null);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final BRequest_EvolveIF_setEvolve obj = (BRequest_EvolveIF_setEvolve)(obj1);		
		bin.prepareForLazyLoading(obj.obj, null);
		
	}
	
}
