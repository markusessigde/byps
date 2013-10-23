package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface RemoteEnums.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_RemoteEnums extends BSkeleton implements RemoteEnumsAsync {
	
	public final static long serialVersionUID = 485761455L;
	
	// checkpoint byps.gen.j.PrintContext:359
	public byps.test.api.enu.EnumPlanets getPlanet() throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getPlanet(final BAsyncResult<byps.test.api.enu.EnumPlanets> asyncResult) {
		try {
			byps.test.api.enu.EnumPlanets ret = getPlanet();
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setPlanet(byps.test.api.enu.EnumPlanets planet) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setPlanet(byps.test.api.enu.EnumPlanets planet, final BAsyncResult<Object> asyncResult) {
		try {
			setPlanet(planet);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}
