package byps.test.api.inherit;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface PlantServiceAsync extends BRemote, 
	PlantService {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public java.lang.String grow() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void grow(final BAsyncResult<String> asyncResult) ;
	
	
}
