﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteArrayTypes4dim_getLong : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1557173854; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteArrayTypes4dim __byps__remoteT = (RemoteArrayTypes4dim)__byps__remote;				
				BAsyncResultSendMethod<long[,,,]> __byps__outerResult = new BAsyncResultSendMethod<long[,,,]>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_846419204());				
				__byps__remoteT.async_GetLong(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 2033150218L;		
	} // end class
}  // end namespace