package byps.test.api.remote;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import byps.*;

// checkpoint byps.gen.j.GenRemoteStub:164
public class BStub_RemoteServerCtrl extends BStub implements RemoteServerCtrlAsync, java.io.Serializable {
	
	// checkpoint byps.gen.j.GenRemoteStub:145
	public final static long serialVersionUID = 1652234479L;
	
	public BStub_RemoteServerCtrl(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void publishRemote(java.lang.String name, BRemote remote, boolean fowardToOtherServers) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		publishRemote(name, remote, fowardToOtherServers, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void publishRemote(java.lang.String name, BRemote remote, boolean fowardToOtherServers, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteServerCtrl_publishRemote req = new BRequest_RemoteServerCtrl_publishRemote();		
		req.name = name;
		req.remote = remote;
		req.fowardToOtherServers = fowardToOtherServers;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public BRemote getPublishedRemote(java.lang.String name) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<BRemote> asyncResult = new BSyncResult<BRemote>();		
		getPublishedRemote(name, asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void getPublishedRemote(java.lang.String name, final BAsyncResult<BRemote> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteServerCtrl_getPublishedRemote req = new BRequest_RemoteServerCtrl_getPublishedRemote();		
		req.name = name;
		transport.sendMethod(req, asyncResult);
	}
	
	// checkpoint byps.gen.j.PrintContext:359
	public void removePublishedRemote(java.lang.String name) throws RemoteException {
		// checkpoint byps.gen.j.GenRemoteStub:46
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		removePublishedRemote(name, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint byps.gen.j.PrintContext:403
	public void removePublishedRemote(java.lang.String name, final BAsyncResult<Object> asyncResult) {
		// checkpoint byps.gen.j.GenRemoteStub:113
		BRequest_RemoteServerCtrl_removePublishedRemote req = new BRequest_RemoteServerCtrl_removePublishedRemote();		
		req.name = name;
		transport.sendMethod(req, asyncResult);
	}
	
	
}
