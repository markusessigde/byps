package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAuth DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface RemoteWithAuthenticationAuth extends BRemote {
	/**
	 * Set authentication flag in MySession.
	 * @param useAuth
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public void setUseAuthentication(boolean useAuth) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void setUseAuthentication(boolean useAuth, final BAsyncResult<Object> asyncResult) ;
	
	/**
	 * Login.
	 * Only user "Fritz" is allowed to login.
	 * @param sess Session information, always null in this scenario.
	 * @param userName
	 * @param userPwd
	 * @return Session object
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public byps.test.api.auth.SessionInfo login(java.lang.String userName, java.lang.String userPwd) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void login(java.lang.String userName, java.lang.String userPwd, final BAsyncResult<byps.test.api.auth.SessionInfo> asyncResult) ;
	
	/**
	 * Do something.
	 * @param sess Session information. Must not be null, if user was logged in.
	 * @param value
	 * @return value+1
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public int doit(int value) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void doit(int value, final BAsyncResult<Integer> asyncResult) ;
	
	/**
	 * Logout
	 * @param sess
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public void expire() throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void expire(final BAsyncResult<Object> asyncResult) ;
	
	/**
	 * Set the number of login calls nessesary to login the user.
	 * This function is used to check that parameter reloginCount in BAuthentication.isReloginException is supplied correctly.
	 * @param count
	 * @throws RemoteException
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public void setReloginCount(int count) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void setReloginCount(int count, final BAsyncResult<Object> asyncResult) ;
	
	
}
