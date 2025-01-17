package byps.gen.j;
/* USE THIS FILE ACCORDING TO THE COPYRIGHT RULES IN LICENSE.TXT WHICH IS PART OF THE SOURCE CODE PACKAGE */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import byps.BException;
import byps.BJsonObject;
import byps.BRegistry;
import byps.gen.api.ErrorInfo;
import byps.gen.api.GeneratorException;
import byps.gen.api.MemberAccess;
import byps.gen.api.MemberInfo;
import byps.gen.api.MethodInfo;
import byps.gen.api.RemoteInfo;
import byps.gen.api.SerialInfo;
import byps.gen.api.TypeInfo;
import byps.gen.utils.CodePrinter;
import byps.gen.utils.Utils;

class GenApiClass {
	
	static Logger log = LoggerFactory.getLogger(GenApiClass.class);
	
	static void generate(PrintContext pctxt, SerialInfo serInfo) throws IOException {
		log.debug("generate(" + serInfo);
		if (serInfo.isCollectionType()) {
			// No API class for List<>...
		}
		else if (serInfo.isArrayType()) {
			// No API class for int[]...
		}
		else if (serInfo.isStubType()) {
			// Stub API class is generated by GenRemoteStub
		}
		else if (serInfo.typeId < pctxt.classDB.getRegistry().getMinTypeIdUser()){
			// No API class for RemoteException ...
		}
		else  {
			log.info("Generate API class for type " + serInfo.typeId + ": " + serInfo);
			CodePrinter pr = pctxt.getPrinterForApiClass(serInfo, "",
					serInfo.isResultClass() || serInfo.isRequestClass());
			if (pr != null) {
				new GenApiClass(pctxt, serInfo, pr).generate();
				pr.close();
			}
		}
		log.debug(")generate");
	}
	
	private GenApiClass(PrintContext pctxt, SerialInfo serInfo, CodePrinter pr) {
		this.pctxt = pctxt;
		this.serInfo = serInfo;
		this.pr = pr;
		this.methodInfo = serInfo.methodInfo;
	}
	
	private String accessToString(MemberAccess a) {
		if (a == MemberAccess.PUBLIC) {
			return pctxt.isGenerateChangedMembers() ? "protected " : "public ";
		}
		if (a == MemberAccess.PROTECTED) return "protected ";
		if (a == MemberAccess.PRIVATE)return "private ";
		return "";
	}
	
	private void printMember(MemberInfo minfo) throws IOException {
		log.debug("printMember");
		
		if (minfo.type.typeId == BRegistry.TYPEID_VOID) {
			// Type void can be used by method return values 
		}
		else {
			pctxt.printComments(pr, minfo.comments);
			
			String access = accessToString(minfo.access);
			String f = minfo.isFinal ? "final " : "";
			String s = minfo.isStatic ? "static " : "";
			String t = minfo.isTransient ? "transient " : "";
	
			CodePrinter mpr = pr.print(access).print(f).print(s).print(t)
			  .print(minfo.type.toString(serInfo.pack)).print(" ")
			  .print(minfo.name);
			
			String value = minfo.value;
			if (value != null) {
				mpr.print(" = ");
				if (value.startsWith("\"")) value = value.substring(1, value.length()-1);
				mpr.print(printConstValue(minfo.type, value));
			}
			
			mpr.println(";");

		}		
		
		log.debug(")printMember");
	}
	
	private String printStringChar(char c) {
		StringBuilder sbuf= new StringBuilder();
		if (Character.isLetterOrDigit(c)) sbuf.append(c);
		else if (c == '\\') sbuf.append("\\\\");
		else if (c == '\t') sbuf.append("\\t");
		else if (c == '\r') sbuf.append("\\r");
		else if (c == '\n') sbuf.append("\\n");
		else if (c == '\b') sbuf.append("\\b");
		else if (c == '\"') sbuf.append("\\\"");
		else if (c == '\'') sbuf.append("\\\'");
		else if (c >= 0x20 && c <= 0x7F) sbuf.append(c);
		else {
			sbuf.append("\\u");			
			String s = Integer.toHexString((int)c);
			for (int i = s.length(); i < 4; i++) sbuf.append("0");
			sbuf.append(s);
		}
		return sbuf.toString();
	}
	
	private String printConstValue(TypeInfo tinfo, Object value) throws BException, GeneratorException {
		StringBuilder sbuf = new StringBuilder();
		
		if (tinfo.dims.length() != 0) {
			BJsonObject js = BJsonObject.fromString((String)value);
			sbuf.append(makeNewArrayInstance(tinfo, js));
		}
		else if (tinfo.qname.equals("java.lang.String")) {
			String s = (String)value;
			sbuf.append("\"");
			for (int i = 0; i < s.length(); i++) {
				sbuf.append( printStringChar(s.charAt(i)) );
			}
			sbuf.append("\"");
		}
		else if (tinfo.qname.equals("char")) {
			String s = (String)value;
			sbuf.append("\'");
			sbuf.append( printStringChar(s.charAt(0)) );
			sbuf.append("\'");
		}
		else if (tinfo.qname.equals("boolean")) {
			if (value instanceof Number) value = ((Number)value).longValue();
			sbuf.append(value);
		}
		else if (tinfo.qname.equals("byte")) {
			if (value instanceof Number) value = ((Number)value).longValue();
			sbuf.append("(byte)").append(value);
		}
		else if (tinfo.qname.equals("short")) {
			if (value instanceof Number) value = ((Number)value).longValue();
			sbuf.append("(short)").append(value);
		}
		else if (tinfo.qname.equals("int")) {
			if (value instanceof Number) value = ((Number)value).longValue();
			sbuf.append(value);
		}
		else if (tinfo.qname.equals("long")) {
			if (value instanceof Number) value = ((Number)value).longValue();
			sbuf.append(value).append("L");
		}
		else if (tinfo.qname.equals("double")) {
			sbuf.append(value);
		}
		else if (tinfo.qname.equals("float")) {
			sbuf.append(value).append("f");
		}
		else if (tinfo.isPointerType() && (value instanceof BJsonObject)) {
			sbuf.append(makeNewInstance(tinfo, (BJsonObject)value));
		}
		else if (value instanceof String && ((String)value).trim().startsWith("{")) {
			BJsonObject js = BJsonObject.fromString((String)value);
			sbuf.append(makeNewInstance(tinfo, js));
		}
		else {
		  // BYPS-60: Default-Wert für Methodenaufruf wird in die BRequest_remote_method-Klasse eingefügt.
      sbuf.append(value);
    }
		
		return sbuf.toString();
	}
	
	private String makeNewArrayInstance(TypeInfo tinfo, BJsonObject js) throws BException, GeneratorException {
		if (js == null) return "null";
		StringBuilder sbuf = new StringBuilder();
		sbuf.append("new ").append(tinfo.toString(serInfo.pack));
		sbuf.append(makeArrayLevel(tinfo, 1, js));
		return sbuf.toString();
	}
	
	private String makeArrayLevel(TypeInfo tinfo, int dim, BJsonObject js) throws BException, GeneratorException {
		StringBuilder sbuf = new StringBuilder();
		sbuf.append("{");
		for (int i = 0; i < js.size(); i++) {
			if (i != 0) sbuf.append(",");
			if (dim < tinfo.dims.length()/2) {
				BJsonObject jsElm = (BJsonObject)js.get(i);
				sbuf.append(makeArrayLevel(tinfo, dim+1, jsElm));
			}
			else {
				Object value = js.get(i);
				TypeInfo elmInfo = new TypeInfo(tinfo.name, tinfo.qname, "", null, tinfo.isEnum, tinfo.isFinal, tinfo.isInline);
				sbuf.append(printConstValue(elmInfo, value));
			}
		}
		sbuf.append("}");
		return sbuf.toString();
	}

	private String makeNewInstance(TypeInfo tinfo, BJsonObject params) throws GeneratorException, BException {
		if (params == null) return "null";

		StringBuilder sbuf = new StringBuilder();
		SerialInfo sinfo = null;
		for (SerialInfo s : pctxt.classDB.getSerials()) {
			if (s.toString().equals(tinfo.toString())) {
				sinfo = s; break;
			}
		}
		if (sinfo == null) {
			ErrorInfo errInfo = new ErrorInfo();
			errInfo.className = tinfo.toString();
			errInfo.msg = "Internal error, typeId=" + tinfo.typeId + " not found in list of serials.";
			throw new GeneratorException(errInfo);
		}
		
		boolean first = true;
		sbuf.append("new ").append(sinfo.toString(serInfo.pack)).append("(");
		for (MemberInfo minfo : sinfo.members) {
			if (minfo.isStatic) continue;
			if (!first) sbuf.append(", "); else first = false; 
			if (minfo.type.dims.length() != 0) {
				sbuf.append(makeNewArrayInstance(minfo.type, (BJsonObject)params.get(minfo.name)));
			} else if (minfo.type.isPointerType()) {
				sbuf.append(makeNewInstance(minfo.type, (BJsonObject)params.get(minfo.name)));
			}
			else {
				sbuf.append(printConstValue(minfo.type, params.get(minfo.name)));
			}
		}
		sbuf.append(")");
		
		return sbuf.toString();
	}
	
	private void printGetSet(MemberInfo minfo) throws IOException {
		log.debug("printGetSet");

		log.debug("is public=" + (minfo.access == MemberAccess.PUBLIC));
		
		if (minfo.access != MemberAccess.PUBLIC &&
			!minfo.isStatic) {
			
			String memberType = minfo.type.toString(serInfo.pack);
			
			if (!memberType.equals("void")) {
				pr.print("public ")
				  .print(memberType).print(" ")
				  //.print("get").print(Utils.firstCharToUpper(minfo.name)).print("()")
				  .print(pctxt.getterForMember(minfo.name, true, minfo.type))
				  .print("{").println();
				pr.beginBlock();
				if (memberType.equals("java.lang.String")) {
					pr.print("if (").print(minfo.name).print(" == null) ")
						.print(minfo.name).print(" = \"\";")
						.println();
				}
				pr.print("return ").print(minfo.name).println(";");
				pr.endBlock();
				pr.println("}");
				pr.println();
			}
			
			if (memberType.equals("void")) {
				pr.print("public void ")		  
				  .print("set").print(Utils.firstCharToUpper(minfo.name))
				  .print("() {").println();
				pr.beginBlock();
			}
			else {
				pr.print("public void ")		  
				  .print("set").print(Utils.firstCharToUpper(minfo.name))
				  .print("(").print(memberType).print(" v) {").println();
				pr.beginBlock();
				pr.print(minfo.name).println(" = v;");
				
//				if (pctxt.isGenerateChangedMembers()) {
//					pr.print("changedMembers |= ").print(pctxt.getElementSelector(serInfo, minfo))
//					  .print(";").println();
//				}
			}
			
			if (serInfo.isResultClass()) {
				pr.println("if (resp != null) resp.ready(this);");
			}
			
			pr.endBlock();
			pr.println("}");
			pr.println();
			pr.println();
		}

		log.debug(")printGetSet");
	}
	
	private void printConstructors() throws IOException {
		log.debug("printConstructors");
		
		pr.print("public ").print(serInfo.name).println("() {");
		pr.print("}");
		pr.println();
		pr.println();
		
		if (isValueClass()) {

			List<MemberInfo> constrMembers = new ArrayList<MemberInfo>();
			for (MemberInfo minfo : serInfo.members) {
				if (minfo.type.typeId == BRegistry.TYPEID_VOID) continue;
				if (minfo.isStatic) continue;
				constrMembers.add(minfo);
			}
			
			if (constrMembers.size() != 0) {
				CodePrinter mpr = pr.print("public ").print(serInfo.name).print("(");
				boolean first = true;
				for (MemberInfo minfo : constrMembers) {
					if (minfo.type.typeId == BRegistry.TYPEID_VOID) continue;
					if (minfo.isStatic) continue;
					if (!first) mpr.print(", "); else first = false; 
					  mpr.print(minfo.type.toString(serInfo.pack)).print(" ")
					     .print(minfo.name);
				}
				mpr.println(") {");
	
				pr.beginBlock();
				for (MemberInfo minfo : constrMembers) {
					if (minfo.type.typeId == BRegistry.TYPEID_VOID) continue;
					if (minfo.isStatic) continue;
					pr.print("this.").print(minfo.name).print(" = ").print(minfo.name).println(";");
				}
				pr.endBlock();
				
				pr.print("}");
				pr.println();
			}
		}
		
		log.debug(")printConstructors");
	}

	private void printRemoteId() throws IOException {
		log.debug("printRemoteId");
		pr.print("public int getRemoteId() { return ").print(methodInfo.remoteInfo.typeId).println("; }");
		log.debug(")printRemoteId");
	}
	
	private void printExecuteAsync() throws GeneratorException {
		pr.println("try {");
		pr.beginBlock();
		
		String remoteType = methodInfo.remoteInfo.getRemoteAsync().toString(serInfo.pack);
		pr.print("final ").print(remoteType).print(" __byps__remoteT = (").print(remoteType).print(")__byps__remote;");
		pr.println();

		String rtype = pctxt.getReturnTypeAsObjType(methodInfo, serInfo.pack);
		String outerResultType = "BAsyncResultSendMethod<" + rtype + ">";
		pr.print(outerResultType).print(" __byps__outerResult = new ").print(outerResultType)
			.print("(__byps__asyncResult, new ").print(methodInfo.resultInfo.toString(serInfo.pack))
			.print("());");
		pr.println();
		
		CodePrinter mpr = pr.print("__byps__remoteT.").print(methodInfo.name).print("(");
		
		boolean first = true;
		for (MemberInfo pinfo : methodInfo.requestInfo.members) {
			if (first) first = false; else mpr.print(", ");
			mpr.print(pinfo.name);
		}
		if (!first) mpr.print(", ");
		mpr.print("__byps__outerResult");
		mpr.println(");");
		
		pr.endBlock();
		pr.println("} catch (Throwable e) {");
		pr.beginBlock();
		pr.println("__byps__asyncResult.setAsyncResult(null, e);");
		pr.endBlock();
		pr.println("}");
	}
	
	private void printExecute() throws IOException {
		log.debug("printExecute");

		pr.print("public void ").print("execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable ").println("{");
		pr.beginBlock();
		
		printExecuteAsync();
		
		pr.endBlock();
		pr.print("}");
		pr.println();
		
		log.debug(")printExecute");
	}
	
	private void printHashCode() throws IOException {
		log.debug("printHashCode(");
		pr.println("@Override");
		pr.println("public int hashCode() {");
		pr.beginBlock();				
		
		if (serInfo.members.size() == 0) {
			pr.println("return 0;");
		}
		else {

			boolean moreThanOneMember = serInfo.members.size() > 1;
			
			// print temporary variables for double values
			int countDoubles = 0;
			for (MemberInfo minfo : serInfo.members) {
				if (!minfo.type.isArrayType() && minfo.type.name.equals("double")) {
					String varName = "temp" + (++countDoubles);
					pr.print("final long ").print(varName).print(" = Double.doubleToLongBits(").print(minfo.name).println(");");
				}
			}
			
			// compute hash
			
			// print line 31*(31*(31* ...
			CodePrinter mpr = pr.print("return ");
			for (int i = 0; i < serInfo.members.size()-1; i++) {
				mpr.print("31*(");
			}
			
			if (moreThanOneMember) pr.beginBlock();
			
			// print hash values for doubles - use the temporary variables created above
			for (int i = 0; i < countDoubles; i++) {
				if (i != 0) mpr.print(" )");
				if (moreThanOneMember) { 
					pr.println();   
					mpr = pr.print(i != 0 ? " + " : "   ");
				}
				String varName = "temp" + (i + 1);
				mpr.print("(int)(").print(varName).print(" ^ (").print(varName).print(" >>> 32))");
			}
	
			// print hash values for non-double members
			for (int i = 0; i < serInfo.members.size(); i++) {
				MemberInfo minfo = serInfo.members.get(i);
				if (minfo.type.isArrayType() || !minfo.type.name.equals("double")) {
					boolean notFirst = (countDoubles != 0 || i != 0);
					if (notFirst) mpr.print(" )");
					if (moreThanOneMember) { 
						pr.println();  
						mpr = pr.print(notFirst ? " + " : "   ");
					}
					printHashMember(mpr, minfo);
				}
			}
			mpr.println(";");
			
			if (moreThanOneMember) pr.endBlock();
		}
		
		pr.endBlock();
		pr.println("}");
		log.debug("printHashCode");
	}
	
	private void printHashMember(CodePrinter pr, MemberInfo minfo) {
		TypeInfo tinfo = minfo.type;
		if (tinfo.isArrayType()) {
			pr.print("java.util.Arrays.hashCode(").print(minfo.name).print(")");
		}
		else if (tinfo.isPointerType()) {
			pr.print("(").print(minfo.name).print("==null ? 0 : ").print(minfo.name).print(".hashCode())");
		}
		else if (tinfo.name.equals("boolean")) {
			pr.print("(").print(minfo.name).print(" ? 1231 : 1237)");
		}
		else if (tinfo.name.equals("byte") ||
				 tinfo.name.equals("char") ||
				 tinfo.name.equals("short") ||
				 tinfo.name.equals("int")) {
			pr.print(minfo.name);
		}
		else if (tinfo.name.equals("long")) {
			pr.print("(int)(").print(minfo.name).print(" ^ ").print("(").print(minfo.name).print(" >>> 32))");
		}
		else if (tinfo.name.equals("float")) {
			pr.print("Float.floatToIntBits(").print(minfo.name).print(")");
		}
		else if (tinfo.name.equals("void")) {
			// Type void can be used by methods
			pr.print("0");
		}
		else {
			throw new IllegalStateException("printHashMember called for unexpected type: " + minfo.type.toString());
		}
	}

	private void printEquals() throws IOException {
		log.debug("printEquals");

		pr.println("@Override");
		pr.println("public boolean equals(Object obj) {");
		pr.beginBlock();
		pr.println("if (this==obj) return true;");
		pr.println("if (obj==null) return false;");
		pr.println("if (getClass() != obj.getClass()) return false;");
		
		if (serInfo.members.size() == 0) {
			pr.println("return true;");
		}
		else {

			pr.println();
			pr.print("final ").print(serInfo.name).print(" rhs = (").print(serInfo.name).print(")obj;").println();

			CodePrinter mpr = pr.print("return ");
			for (int i = 0; i < serInfo.members.size(); i++) {
				MemberInfo minfo = serInfo.members.get(i);
				if (i != 0) {
					mpr.println(" &&");
					mpr = pr.print("  ");
				}
				if (minfo.type.isArrayType()) {
					// Arrays.equals(arrayStruct2, other.arrayStruct2) &&
					if (minfo.type.dims.length() == 2) {
						mpr.print("java.util.Arrays.equals(").print(minfo.name).print(", rhs.").print(minfo.name).print(")");
					}
					else {
						mpr.print("java.util.Arrays.deepEquals(").print(minfo.name).print(", rhs.").print(minfo.name).print(")");
					}
				}
				else if (minfo.type.isPointerType()) {
					// (listStruct1 == other.listStruct1 || (listStruct1 != null && listStruct1.equals(other.listStruct1)))
					String lhs = minfo.name;
					String rhs = "rhs." + minfo.name;
					mpr.print("(").print(lhs).print("==").print(rhs).print(" || ")
					   .print("(").print(lhs).print("!=null && ").print(lhs).print(".equals(").print(rhs).print(")))");
				}
				else if (minfo.type.name.equals("double")) {
					String lhs = "Double.doubleToLongBits(" + minfo.name + ")";
					String rhs = "Double.doubleToLongBits(rhs." + minfo.name + ")";
					mpr.print(lhs).print("==").print(rhs);
				}
				else if (minfo.type.name.equals("float")) {
					String lhs = "Float.floatToIntBits(" + minfo.name + ")";
					String rhs = "Float.floatToIntBits(rhs." + minfo.name + ")";
					mpr.print(lhs).print("==").print(rhs);
				}
				else if (minfo.type.name.equals("void")) {
					// Type void can be used by methods
					mpr.print("true");
				}
				else {
					mpr.print(minfo.name).print("==rhs.").print(minfo.name);
				}
			}
			mpr.println(";");
		}
		
		pr.endBlock();
		pr.println("}");
		
		log.debug(")printEquals");
	}
	
	private void printSerialVersionUID() {
		log.debug("printSerialVersionUID");
		pr.println("public final static long serialVersionUID = " + serInfo.typeId + "L;");
		log.debug(")printSerialVersionUID");
	}
	
	private void generate() throws IOException {
		if (serInfo.isEnum){
			generateEnum();
		}
		else {
			generateClass();
		}
	}
	
	private ArrayList<MemberInfo> sortEnumMembersByOrdinal(List<MemberInfo> members) {
		ArrayList<MemberInfo> m = new ArrayList<MemberInfo>(members);

		Collections.sort(m, new Comparator<MemberInfo>() {
			@Override
			public int compare(MemberInfo o1, MemberInfo o2) {
				int v1 = Integer.parseInt(o1.value);
				int v2 = Integer.parseInt(o2.value);
				return v1 - v2;
			}
		});
		
		return m;
	}
	
	private void generateEnum() throws IOException {
		pr.print("package ").print(serInfo.pack).print(";").println();
		pr.println();
		pctxt.printDoNotModify(pr, this.getClass());

		pr.print("public enum ").print(serInfo.name).println(" {");
		pr.beginBlock();
		
		ArrayList<MemberInfo> membersByOrdinal = sortEnumMembersByOrdinal(serInfo.members);
		for (MemberInfo minfo : membersByOrdinal) {
			pctxt.printComments(pr, minfo.comments);
			pr.print(minfo.name).print(", // ordinal=").print(minfo.value).println();
		}
		
		pr.endBlock();
		pr.println("}");
	}
	
	private void printSetSession() throws IOException {
	  if (methodInfo == null) return;
	
	  RemoteInfo rinfo = methodInfo.remoteInfo;
    for (MemberInfo pinfo : methodInfo.requestInfo.members) {
      
      // Supply authentication parameter
      if (pctxt.isSessionParam(rinfo, pinfo)) {
        pr.checkpoint();
        
        pr.println("public void setSession(Object __byps__sess) {");
        pr.beginBlock();
        pr.print(pinfo.name).print(" = (").print(rinfo.authParamClassName).println(")__byps__sess;");
        pr.endBlock();
        pr.println("}");
        pr.println();
        
        break;
      }
    }
	   
	}
	
	private void generateClass() throws IOException {
		log.debug("generate");

		pr.print("package ").print(serInfo.pack).print(";").println();
		pr.println();

		pctxt.printDoNotModify(pr, getClass());

//		pr.println("import java.io.Serializable;");
//		if (serInfo.isRequestClass() || serInfo.isResultClass()) {
//			pr.println("import byps.*;");
//		}
		
		pr.println("import byps.*;");
		pr.println("import java.io.Serializable;");
		
		serInfo.members.stream()
		    .filter(m -> !m.type.isPrimitiveType())
		    .map(m -> m.type.qname)
		    .distinct()
  		  .filter(qname -> !qname.startsWith(serInfo.pack + "."))
  		  .forEach(qname -> pr.println("import " + qname + ";"));
		
//		  .filter(pack -> !pack.equals("java.lang"))
//		  .filter(pack -> !pack.equals(serInfo.pack))
//		  .forEach(pack -> pr.println("import " + pack + ";"));
		
		pr.println();
		
		pctxt.printComments(pr, serInfo.comments);
		
		pr.println("@SuppressWarnings(\"all\")");

		{
			String sfinal = serInfo.isFinal ? "final " : "";
			CodePrinter mpr = pr.print("public ").print(sfinal).print("class ").print(serInfo.name);
			if (serInfo.isResultClass()) {
				String rtype = pctxt.getReturnTypeAsObjType(methodInfo, serInfo.pack);
				String baseClass = "BMethodResult<" + rtype + ">";
				mpr.print(" extends ").print(baseClass).print(" implements Serializable");
			}
			else if (serInfo.isRequestClass()) {
				mpr.print(" extends BMethodRequest implements Serializable");
			}
			else {
				if (serInfo.baseInfo != null) {
					mpr.print(" extends ").print(serInfo.baseInfo.toString(serInfo.pack));
				}
				mpr.print(" implements Serializable");
			}
			
			mpr.println(" {");
			pr.println();
		}
		
		pr.beginBlock();
		
		if (!serInfo.isResultClass()) {
			for (MemberInfo minfo : serInfo.members) {
				printMember(minfo);
			}
		}
		else {
			// Result Klasse erbt beide Elemente (result, exception) von BMethodResult
		} 
		
		pr.println();
		printSerialVersionUID();
		pr.println();
		
		if (!serInfo.isResultClass() && !serInfo.isRequestClass()) {
			printConstructors();
			pr.println();
		}

		for (MemberInfo minfo : serInfo.members) {
			printGetSet(minfo);
		}
		
		if (serInfo.isRequestClass()) {
			
			printRemoteId();
			pr.println();
			
			printSetSession();

			printExecute();
			pr.println();
			
			printToString();
			pr.println();
		}
		
		// Generate hashCode() and equals() 
		if (pctxt.isGenerateHashCodeAndEquals() && methodInfo == null) {
			printHashCode();
			pr.println();
			
			printEquals();
			pr.println();
		}
		
		pr.endBlock();
		
		pr.println("}");

		log.debug(")generate");
	}

  private void printToString() throws GeneratorException {
    pr.println("public String toString() {");
    pr.beginBlock();
    
    pr.println("StringBuilder s = new StringBuilder();");
    pr.print("s.append(\"[").print(methodInfo.remoteInfo.name).print(".").print(methodInfo.name).print("(\");").println();
    
    CodePrinter mpr = pr;
    boolean first = true;
    for (MemberInfo pinfo : methodInfo.requestInfo.members) {
      if (first)  mpr = pr.print("s."); else mpr = pr.print("s.append(\",\").");
      mpr.print("append(BBuffer.paramToString(");
      mpr.print(pinfo.name);
      mpr.print("));").println();
      first = false;
    }
    
    pr.println("s.append(\")]\");");
    pr.println("return s.toString();");
    
    pr.endBlock();
    pr.println("}");
  }

  private boolean isValueClass() {
		return methodInfo == null;
	}

	private final SerialInfo serInfo;
	private final CodePrinter pr;
	private final MethodInfo methodInfo;
	private final PrintContext pctxt;
}
