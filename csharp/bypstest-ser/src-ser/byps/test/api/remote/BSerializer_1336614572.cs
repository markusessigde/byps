﻿//
// Serializer for byps.test.api.remote.BRequest_RemoteArrayTypes4dim_setString
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api.remote
{
	
	public class BSerializer_1336614572 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1336614572();
		
		public BSerializer_1336614572()
			: base(1336614572) {}
		
		public BSerializer_1336614572(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BRequest_RemoteArrayTypes4dim_setString obj = (BRequest_RemoteArrayTypes4dim_setString)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:490
			bout.writeObj(obj.vValue, true, byps.test.api.BSerializer_588723219.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BRequest_RemoteArrayTypes4dim_setString obj = (BRequest_RemoteArrayTypes4dim_setString)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_RemoteArrayTypes4dim_setString()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:445
			obj.vValue = (String[,,,])bin.readObj(false, byps.test.api.BSerializer_588723219.instance);
			
			return obj;
		}
		
	}
} // namespace
