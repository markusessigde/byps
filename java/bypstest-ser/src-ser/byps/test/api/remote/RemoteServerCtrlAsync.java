package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteClassAsync DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteClassAsync:68
public interface RemoteServerCtrlAsync extends BRemote, 
	RemoteServerCtrl {
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public void publishRemote(java.lang.String name, BRemote remote, boolean fowardToOtherServers) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void publishRemote(java.lang.String name, BRemote remote, boolean fowardToOtherServers, final BAsyncResult<Object> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public BRemote getPublishedRemote(java.lang.String name) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void getPublishedRemote(java.lang.String name, final BAsyncResult<BRemote> asyncResult) ;
	
	/**
	*/
	// checkpoint byps.gen.j.PrintContext:359
	public void removePublishedRemote(java.lang.String name) throws RemoteException;
	// checkpoint byps.gen.j.PrintContext:403
	public void removePublishedRemote(java.lang.String name, final BAsyncResult<Object> asyncResult) ;
	
	
}