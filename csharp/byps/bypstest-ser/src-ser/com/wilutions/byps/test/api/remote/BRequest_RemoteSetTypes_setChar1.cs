﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteSetTypes_setChar1 : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 1156008353; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteSetTypes __byps__remoteT = (RemoteSetTypes)__byps__remote;				
				BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_19());				
				__byps__remoteT.async_SetChar1(_char1, __byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal HashSet<char> _char1;

		#endregion
		
		
		public static readonly long serialVersionUID = 1608569502L;		
	} // end class
}  // end namespace
