﻿package com.wilutions.byps.test.api.ver;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class com.wilutions.byps.gen.j.GenRemoteStub DO NOT MODIFY.
 */

import com.wilutions.byps.*;

// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:158
public class BStub_EvolveIF extends BStub implements EvolveIFAsync, java.io.Serializable {
	
	public final static long serialVersionUID = 0L;
	
	public BStub_EvolveIF(final BTransport transport) {
		super(transport);		
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setEvolve(Evolve obj) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setEvolve(obj, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setEvolve(Evolve obj, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_EvolveIF_setEvolve req = new BRequest_EvolveIF_setEvolve();		
		req.obj = obj;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public Evolve getEvolve() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Evolve> asyncResult = new BSyncResult<Evolve>();		
		async_getEvolve(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getEvolve(final BAsyncResult<Evolve> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_EvolveIF_getEvolve req = new BRequest_EvolveIF_getEvolve();		
		BAsyncResultReceiveMethod<Evolve> outerResult = new BAsyncResultReceiveMethod<Evolve>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void setClient(EvolveIF partner) throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_setClient(partner, asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_setClient(EvolveIF partner, final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_EvolveIF_setClient req = new BRequest_EvolveIF_setClient();		
		req.partner = partner;
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public EvolveIF getClient() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<EvolveIF> asyncResult = new BSyncResult<EvolveIF>();		
		async_getClient(asyncResult);
		return asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_getClient(final BAsyncResult<EvolveIF> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_EvolveIF_getClient req = new BRequest_EvolveIF_getClient();		
		BAsyncResultReceiveMethod<EvolveIF> outerResult = new BAsyncResultReceiveMethod<EvolveIF>(asyncResult);
		transport.send(req, outerResult);
	}
	
	// checkpoint com.wilutions.byps.gen.j.PrintContext:356
	public void sendEvolveToClient() throws RemoteException {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:45
		final BSyncResult<Object> asyncResult = new BSyncResult<Object>();		
		async_sendEvolveToClient(asyncResult);
		asyncResult.getResult();		
	}
	// checkpoint com.wilutions.byps.gen.j.PrintContext:400
	public void async_sendEvolveToClient(final BAsyncResult<Object> asyncResult) {
		// checkpoint com.wilutions.byps.gen.j.GenRemoteStub:110
		BRequest_EvolveIF_sendEvolveToClient req = new BRequest_EvolveIF_sendEvolveToClient();		
		BAsyncResultReceiveMethod<Object> outerResult = new BAsyncResultReceiveMethod<Object>(asyncResult);
		transport.send(req, outerResult);
	}
	
	
}
