﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api.remote
{
	
	public sealed class BRequest_RemoteStreams_setImages : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public int getRemoteId() { return 2028487863; }
		
		public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) {
			try {
				RemoteStreams __byps__remoteT = (RemoteStreams)__byps__remote;				
				BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new com.wilutions.byps.test.api.BResult_19());				
				__byps__remoteT.async_SetImages(_istrms, _doNotReadStreamAtKey, __byps__outerResult);
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
				throw e;
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal IDictionary<int,System.IO.Stream> _istrms;

		internal int _doNotReadStreamAtKey;

		#endregion
		
		
		public static readonly long serialVersionUID = 944362859L;		
	} // end class
}  // end namespace
