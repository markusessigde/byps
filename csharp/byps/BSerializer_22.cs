﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace com.wilutions.byps
{
    public class BSerializer_22 : BSerializer
    {
	    public static BSerializer instance = new BSerializer_22();

	    public BSerializer_22() 
            : base(BRegistry.TYPEID_VALUECLASS)
        {
	    }

	    public BSerializer_22(int typeId) 
            : base(typeId)
        {
	    }
	
	    public override void write(Object obj1, BOutput bout1, int version) {
		    BOutputBin bout = ((BOutputBin)bout1);
		    BValueClass obj = (BValueClass)obj1;
            bout.bbuf.putLong(obj.ChangedMembers);
	    }

	    public override Object read(Object obj1, BInput bin1, int version) {
		    BInputBin bin = ((BInputBin)bin1);
		    long v = bin.bbuf.getLong();
            BValueClass obj = (BValueClass)(obj1 != null ? obj1 : bin.onObjectCreated(new BValueClass()));
            obj.ChangedMembers = v;
		    return obj;
	    }


    }
}