﻿//
// Serializer for byps.test.api.BResult_1710660846
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BSerializer_1899847531 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_1899847531();
		
		public BSerializer_1899847531()
			: base(1899847531) {}
		
		public BSerializer_1899847531(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_1710660846 obj = (BResult_1710660846)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:490
			bout.writeObj(obj.resultValue, false, byps.test.api.BSerializer_1710660846.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_1710660846 obj = (BResult_1710660846)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1710660846()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:445
			obj.resultValue = (IDictionary<String,String>)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace
