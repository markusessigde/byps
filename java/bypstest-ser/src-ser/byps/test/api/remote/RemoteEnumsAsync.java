package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface RemoteEnumsAsync extends BRemote, 
	RemoteEnums {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public byps.test.api.enu.EnumPlanets getPlanet() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void getPlanet(final BAsyncResult<byps.test.api.enu.EnumPlanets> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:365
	public void setPlanet(byps.test.api.enu.EnumPlanets planet) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:409
	public void setPlanet(byps.test.api.enu.EnumPlanets planet, final BAsyncResult<Object> asyncResult) ;
	
	
}
