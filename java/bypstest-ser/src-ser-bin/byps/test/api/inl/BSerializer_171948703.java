package byps.test.api.inl;

/*
 * Serializer for byps.test.api.inl.Actor
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:304
@SuppressWarnings("all")
public class BSerializer_171948703 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_171948703();
	
	public BSerializer_171948703() {
		super(171948703);
	}
	
	public BSerializer_171948703(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final Actor obj = (Actor)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.position, false, byps.test.api.inl.BSerializer_135329019.instance);
		bout.writeObj(obj.shape, false, byps.test.api.BSerializer_184101377.instance);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final Actor obj = (Actor)(obj1 != null ? obj1 : bin.onObjectCreated(new Actor()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.position = (byps.test.api.inl.Matrix2D)bin.readObj(false, byps.test.api.inl.BSerializer_135329019.instance);
		obj.shape = (byps.test.api.inl.Point2D[])bin.readObj(false, byps.test.api.BSerializer_184101377.instance);
		
		return obj;
	}
	
	@Override
	public void prepareForLazyLoading(final Object obj1, final BInput bin, final long version) throws BException {
		final Actor obj = (Actor)(obj1);		
		bin.prepareForLazyLoading(obj.position, byps.test.api.inl.BSerializer_135329019.instance);
		bin.prepareForLazyLoading(obj.shape, byps.test.api.BSerializer_184101377.instance);
		
	}
	
}
