﻿//
// Serializer for byps.test.api.BResult_9001
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BSerializer_2076900492 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_2076900492();
		
		public BSerializer_2076900492()
			: base(2076900492) {}
		
		public BSerializer_2076900492(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_9001 obj = (BResult_9001)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bout.writeObj(obj._result, false, null);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_9001 obj = (BResult_9001)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_9001()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = (byps.test.api.refs.Node)bin.readObj(false, null);
			
			return obj;
		}
		
	}
} // namespace