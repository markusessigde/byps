﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteStreams_getImage : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 2028487863; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteStreams __byps__remoteT = (RemoteStreams)__byps__remote;				
				BAsyncResultSendMethod<System.IO.Stream> __byps__outerResult = new BAsyncResultSendMethod<System.IO.Stream>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_15());				
				__byps__remoteT.async_GetImage(__byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		#endregion
		
		
		public static readonly long serialVersionUID = 1902276204L;		
	} // end class
}  // end namespace
