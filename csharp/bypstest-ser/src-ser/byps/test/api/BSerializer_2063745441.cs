﻿//
// Serializer for byps.test.api.BResult_1888107655
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace byps.test.api
{
	
	public class BSerializer_2063745441 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_2063745441();
		
		public BSerializer_2063745441()
			: base(2063745441) {}
		
		public BSerializer_2063745441(int typeId)
			: base(typeId) {}
		
		
		public override void write(Object obj1, BOutput bout1, long version)
		{
			BResult_1888107655 obj = (BResult_1888107655)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			// checkpoint byps.gen.cs.PrintContext:490
			bout.writeObj(obj.resultValue, true, byps.test.api.BSerializer_1888107655.instance);
		}
		
		public override Object read(Object obj1, BInput bin1, long version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_1888107655 obj = (BResult_1888107655)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_1888107655()));
			
			BBufferBin bbuf = bin.bbuf;
			// checkpoint byps.gen.cs.PrintContext:445
			obj.resultValue = (String[])bin.readObj(false, byps.test.api.BSerializer_1888107655.instance);
			
			return obj;
		}
		
	}
} // namespace
