package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteSkeleton DO NOT MODIFY.
 */

import byps.*;

/**
 * This class provides a skeleton implementation of the interface RemoteWithAuthentication.
 * Your interface implementation class has to be derived from this skeleton.
 * Either provide an asynchronous or a synchronous function in your subclass.
 * The framework calls only the asynchronous function.
 */
@SuppressWarnings("all")
public class BSkeleton_RemoteWithAuthentication extends BSkeleton implements RemoteWithAuthenticationAsync {
	
	public final static long serialVersionUID = 1983670399L;
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setUseAuthentication(boolean useAuth) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setUseAuthentication(boolean useAuth, final BAsyncResult<Object> asyncResult) {
		try {
			setUseAuthentication(useAuth);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public byps.test.api.auth.SessionInfo login(byps.test.api.auth.SessionInfo sess, java.lang.String userName, java.lang.String userPwd) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void login(byps.test.api.auth.SessionInfo sess, java.lang.String userName, java.lang.String userPwd, final BAsyncResult<byps.test.api.auth.SessionInfo> asyncResult) {
		try {
			byps.test.api.auth.SessionInfo ret = login(sess, userName, userPwd);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public int doit(byps.test.api.auth.SessionInfo sess, int value) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void doit(byps.test.api.auth.SessionInfo sess, int value, final BAsyncResult<Integer> asyncResult) {
		try {
			int ret = doit(sess, value);
			asyncResult.setAsyncResult(ret, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void expire(byps.test.api.auth.SessionInfo sess) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void expire(byps.test.api.auth.SessionInfo sess, final BAsyncResult<Object> asyncResult) {
		try {
			expire(sess);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void setReloginCount(int count) throws RemoteException {
		throw new BException(BExceptionC.UNSUPPORTED_METHOD, "");
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void setReloginCount(int count, final BAsyncResult<Object> asyncResult) {
		try {
			setReloginCount(count);
			asyncResult.setAsyncResult(null, null);
		} catch (Throwable e) {
			asyncResult.setAsyncResult(null, e);
		}
	}
	
	
}
