﻿//
// Serializer for com.wilutions.byps.test.api.BResult_6
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using com.wilutions.byps;

namespace com.wilutions.byps.test.api
{
	
	public class BSerializer_148544157 : BSerializer {
		
		public readonly static BSerializer instance = new BSerializer_148544157();
		
		public BSerializer_148544157()
			: base(148544157) {}
		
		public BSerializer_148544157(int typeId)
			: base(typeId) {}
		
		
		public override int size(Object obj, BBinaryModel bmodel)
		{
			return 0
			       /* size of base class */ + 0
			       /* pos=0: result */ + 8			
			       /* padding up to multiple of alignment */ + 0;			
		}
		
		public override void write(Object obj1, BOutput bout1, int version)
		{
			BResult_6 obj = (BResult_6)obj1;			
			BOutputBin bout = (BOutputBin)bout1;
			BBufferBin bbuf = bout.bbuf;
			bbuf.putLong(obj._result);
		}
		
		public override Object read(Object obj1, BInput bin1, int version)
		{
			BInputBin bin = (BInputBin)bin1;
			BResult_6 obj = (BResult_6)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_6()));
			
			BBufferBin bbuf = bin.bbuf;
			obj._result = bbuf.getLong();
			
			return obj;
		}
		
	}
} // namespace
