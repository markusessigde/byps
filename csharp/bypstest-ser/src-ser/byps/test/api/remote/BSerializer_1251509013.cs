﻿//
// Serializer for byps.test.api.remote.BRequest_RemoteWithAuthentication_doit
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.remote
{
	
	public class BSerializer_1251509013 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1251509013();
		
		public BSerializer_1251509013()
			: base(1251509013) {}
		
		public BSerializer_1251509013(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_RemoteWithAuthentication_doit obj = (BRequest_RemoteWithAuthentication_doit)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bbuf.putInt(obj._value);
			bout.writeObj(obj._sess, false, null);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteWithAuthentication_doit obj = (BRequest_RemoteWithAuthentication_doit)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteWithAuthentication_doit()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._value = bbuf.getInt();
			obj._sess = (byps.test.api.auth.SessionInfo)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
