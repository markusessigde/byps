﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.ver
{
	
	public sealed class BRequest_EvolveIF_setEvolve : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 15377840; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint byps.gen.cs.GenApiClass:414
			try {
				EvolveIF __byps__remoteT = (EvolveIF)__byps__remote;				
				BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new byps.test.api.BResult_19());				
				__byps__remoteT.SetEvolve(objValue, BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal Evolve objValue;

		#endregion
		
		
		public static readonly long serialVersionUID = 1064683365L;		
	} // end class
}  // end namespace
