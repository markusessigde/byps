package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_PlantService extends BStub implements PlantServiceAuth, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1954605928L;
	
	public BStub_PlantService(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:365
	public java.lang.String grow() throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<String> asyncResult = new BSyncResult<String>();		
		grow(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:409
	public void grow(final BAsyncResult<String> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_PlantService_grow req = new BRequest_PlantService_grow();		
		transport.sendMethod(req, asyncResult);
	}
	
	
}
