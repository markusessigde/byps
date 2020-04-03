package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface RemoteProcessingEx.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_RemoteProcessingEx extends BSkeleton implements RemoteProcessingExAsync {
	
	public final static long serialVersionUID = 790485113L;
	
	// checkpoint byps.gen.j.PrintContext:396
	public boolean getValueAfterProcessingExceptions(int sleepSeconds) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:440
	public void getValueAfterProcessingExceptions(int sleepSeconds, final BAsyncResult<Boolean> asyncResult) {
		try {
			boolean ret = getValueAfterProcessingExceptions(sleepSeconds);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}
