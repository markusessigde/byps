﻿//
// Serializer for byps.test.api.BResult_1898022288
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BSerializer_515346332 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_515346332();
		
		public BSerializer_515346332()
			: base(515346332) {}
		
		public BSerializer_515346332(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_1898022288 obj = (BResult_1898022288)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, byps.test.api.BSerializer_1898022288.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_1898022288 obj = (BResult_1898022288)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1898022288()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (ISet<float>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
