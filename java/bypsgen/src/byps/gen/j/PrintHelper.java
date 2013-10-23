package byps.gen.j;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.BRegistry;
import byps.gen.api.TypeInfo;



public class PrintHelper {
	static Log log = LogFactory.getLog(PrintHelper.class);
	
	public static String streamGetMember(TypeInfo tinfo) {
		String fnct = "";
		int typeId = tinfo.typeId;
		if (tinfo.isEnum) fnct = "getInt";
		else if (typeId == BRegistry.TYPEID_INT8   ) fnct = "getByte";
		else if (typeId == BRegistry.TYPEID_WCHAR   ) fnct = "getChar";
		else if (typeId == BRegistry.TYPEID_INT16  ) fnct = "getShort";
		else if (typeId == BRegistry.TYPEID_INT32  ) fnct = "getInt";
		else if (typeId == BRegistry.TYPEID_INT64  ) fnct = "getLong";
//		else if (typeId == BRegistry.TYPEID_UINT8   ) fnct = "getByte";
//		else if (typeId == BRegistry.TYPEID_UINT16  ) fnct = "getShort";
//		else if (typeId == BRegistry.TYPEID_UINT32  ) fnct = "getInt";
//		else if (typeId == BRegistry.TYPEID_UINT64  ) fnct = "getLong";
		else if (typeId == BRegistry.TYPEID_FLOAT  ) fnct = "getFloat";
		else if (typeId == BRegistry.TYPEID_DOUBLE ) fnct = "getDouble";
		else if (typeId == BRegistry.TYPEID_BOOL   ) fnct = "getBoolean";
		else if (typeId == BRegistry.TYPEID_STRING   ) fnct = "getString";
			else {
			String msg = "Unknown typeId=" + typeId;
			log.error(msg);
			throw new IllegalStateException(msg);
		}
		return fnct;
	}
	
	public static String streamPutMember(TypeInfo tinfo) {
		String fnct = "";
		int typeId = tinfo.typeId;
		if (tinfo.isEnum) fnct = "putInt";
		else if (typeId == BRegistry.TYPEID_INT8   ) fnct = "putByte";
		else if (typeId == BRegistry.TYPEID_WCHAR   ) fnct = "putChar";
		else if (typeId == BRegistry.TYPEID_INT16  ) fnct = "putShort";
		else if (typeId == BRegistry.TYPEID_INT32  ) fnct = "putInt";
		else if (typeId == BRegistry.TYPEID_INT64  ) fnct = "putLong";
//		else if (typeId == BRegistry.TYPEID_UINT8   ) fnct = "putByte";
//		else if (typeId == BRegistry.TYPEID_UINT16  ) fnct = "putShort";
//		else if (typeId == BRegistry.TYPEID_UINT32  ) fnct = "putInt";
//		else if (typeId == BRegistry.TYPEID_UINT64  ) fnct = "putLong";
		else if (typeId == BRegistry.TYPEID_FLOAT  ) fnct = "putFloat";
		else if (typeId == BRegistry.TYPEID_DOUBLE ) fnct = "putDouble";
		else if (typeId == BRegistry.TYPEID_BOOL   ) fnct = "putBoolean";
		else if (typeId == BRegistry.TYPEID_STRING   ) fnct = "putString";
		else {
			String msg = "Unknown tpyeId=" + typeId;
			log.error(msg);
			throw new IllegalStateException(msg);
		}
		return fnct;
	}
	
	public static String getDefaultValueForType(TypeInfo tinfo) {
		String fnct = "";
		int typeId = tinfo.typeId;
		if (tinfo.isEnum) fnct = "0"; 
		else if (typeId == BRegistry.TYPEID_INT8   ) fnct = "((byte)0)";
		else if (typeId == BRegistry.TYPEID_WCHAR   ) fnct = "((char)0)";
		else if (typeId == BRegistry.TYPEID_INT16  ) fnct = "((short)0)";
		else if (typeId == BRegistry.TYPEID_INT32  ) fnct = "0";
		else if (typeId == BRegistry.TYPEID_INT64  ) fnct = "0L";
//		else if (typeId == BRegistry.TYPEID_UINT8   ) fnct = "((byte)0)";
//		else if (typeId == BRegistry.TYPEID_UINT16  ) fnct = "((short)0)";
//		else if (typeId == BRegistry.TYPEID_UINT32  ) fnct = "0";
//		else if (typeId == BRegistry.TYPEID_UINT64  ) fnct = "0L";
		else if (typeId == BRegistry.TYPEID_FLOAT  ) fnct = "0.0f";
		else if (typeId == BRegistry.TYPEID_DOUBLE ) fnct = "0.0";
		else if (typeId == BRegistry.TYPEID_BOOL   ) fnct = "false";
		else if (typeId == BRegistry.TYPEID_STRING ) fnct = "\"\"";
//		else if (typeId == BRegistry.TYPEID_VOID   ) throw new IllegalStateException("void does not have a default value");
		else {
			return "null";
		}
		return fnct;
	}
	
}
