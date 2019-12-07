package byps.gen.xml;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.gen.api.ErrorInfo;
import byps.gen.api.GeneratorException;
import byps.gen.api.SerialInfo;
import byps.gen.api.TypeInfo;
import byps.gen.db.ClassDB;

public abstract class XmlGeneratorBase extends AbstractProcessor {
  
  private static Log log = LogFactory.getLog(XmlGeneratorBase.class);
  
  /**
   * Option: all classes should be serialized.
   */
  public static final int OPT_ALL_SERIALS = 0x1;
  
  /**
   * Option: functions of all interfaces should be RPC calls.
   */
  public static final int OPT_ALL_REMOTES = 0x2;
  
  /**
   * Process only classes tagged with @BSerializable 
   */
  public static final int OPT_ONLY_BSERIALS = 0x4;
  
  /**
   * Process only interfaces tagged with @BRemote
   */
  public static final int OPT_ONLY_BREMOTES = 0x8;
 
  
  /**
   * Internal representation of the entire API.
   */
  protected ClassDB classDB;
  
  /**
   * API Classes must not define members with this names.
   */
  protected static final Set<String> FORBIDDEN_FIELD_AND_METHOD_NAMES = new HashSet<>(
      Arrays.asList("_typeId", "__byps__ret", "__byps__asyncResult", "toJSON"));


  private static final HashSet<String> supportedCollections = new HashSet<>(Arrays.asList(
      "java.util.List", "java.util.ArrayList", 
      // We do not support LinkedList because we access the elements by index in JSON serialization.
      "java.util.Map", "java.util.HashMap", "java.util.TreeMap",
      "java.util.Set", "java.util.HashSet", "java.util.TreeSet"));
  
  /**
   * Converter options.
   * Combination of OPT_* constants.
   */
  protected final int options;
  
  public XmlGeneratorBase(int options) {
    this.options = options;
  }

  public ClassDB getClassDB() {
    return classDB;
  }
  
  /**
   * Create SerialInfo for collection.
   * The collection might be a java.util.List, ArrayList, LinkedList, Map, HashMap, TreeMap, Set, HashSet, TreeSet.
   * The collection class definition must have generic arguments. 
   * java.lang.Object is a valid argument type.
   */
  protected void makeSerialInfoForCollectionType(ErrorInfo errInfo, TypeInfo tinfo) {
    log.debug("makeSerialInfoForCollectionType(" + tinfo);
    errInfo = errInfo.copy();
    
    // Create SerialInfo for List and Map and Set
    log.debug("isCollectionType=" + tinfo.isCollectionType());
    if (tinfo.isCollectionType()) {
      
      checkSupportedCollection(errInfo, tinfo);

      // List, ArrayList, LinkedList ohne Argumenttype?
      if (tinfo.typeArgs.isEmpty()) {
        errInfo.msg = "Missing argument types.";
        throw new GeneratorException(errInfo);
      }
      else {
        // List<?>, List<Integer>, Map<?,?> ... 
        for (int i = 0; i < tinfo.typeArgs.size(); i++) {
          TypeInfo ainfo = tinfo.typeArgs.get(i);
          log.debug("type argument=" + ainfo);
          if (ainfo.name.equals("?")) {
            tinfo.typeArgs.set(i, ainfo);
          }
        }
      }
      
      if (tinfo.isMapType()) {
        TypeInfo type = tinfo.typeArgs.get(0);
        // JavaScript supports only numbers and strings as map keys.
        if (!type.isPrimitiveType()) {
          errInfo.typeArg = type.toString();
          errInfo.msg = "Map types must be specified with a key type of Boolean, Byte, Short, Integer, Long, Float, Double or String.";
          throw new GeneratorException(errInfo);
        }
      }
      
      SerialInfo serInfo = classDB.createSerialInfo(tinfo.name, null, 
          tinfo.qname, null, "", tinfo.typeArgs,
          null, tinfo.isEnum, tinfo.isFinal, tinfo.isInline,
          0L);
      classDB.add(serInfo);
    }

    // If tinfo is an array (maybe an array of collections),
    // generate a SerialInfo for this array type. 
    log.debug("isArrayType=" + tinfo.isArrayType());
    if (tinfo.isArrayType()) {
      
      if (tinfo.name.equals("Point2D")) {
        log.debug("");
      }
      
      // Arrays of generic types are unsupported by the java programming language
      if (!tinfo.typeArgs.isEmpty()) {

        // new List<Integer>[2] leads to this compiler error:
        // Cannot create a generic array of List<Integer>
        errInfo.msg = "Arrays of collection types are not supported by java. Declare this type without type arguments, e.g. java.util.HashMap instead of java.util.HashMap<Integer,String>.";
        throw new GeneratorException(errInfo);
      }
      
      SerialInfo sinfo = classDB.createSerialInfo(tinfo.name, null, tinfo.qname, null, 
          tinfo.dims, tinfo.typeArgs, null, tinfo.isEnum, tinfo.isFinal, tinfo.isInline, 0L);
      classDB.add(sinfo);
    }
    
    // Walk recursively though the type arguments
    for (TypeInfo argInfo : tinfo.typeArgs) {
      makeSerialInfoForCollectionType(errInfo, argInfo);
    }

    log.debug(")makeSerialInfoForCollectionType");
  }

  /**
   * Is the given type a supported collection type?
   * @param errInfo
   * @param tinfo
   * @throws GeneratorException
   */
  private void checkSupportedCollection(ErrorInfo errInfo, TypeInfo tinfo) {
    errInfo = errInfo.copy();
    int p = tinfo.qname.indexOf('<');
    String qname = p >= 0 ? tinfo.qname.substring(0, p) : tinfo.qname;
    if (!supportedCollections.contains(qname)) {
      StringBuilder msg = new StringBuilder();
      msg.append("Unsupported collection type. ");
      msg.append("Please use one of this types: ").append(supportedCollections).append(", ");
      msg.append("e.g. List<Map<Integer,Set<String>>>.");
      errInfo.msg = msg.toString();
      throw new GeneratorException(errInfo);
    }
  }
  
  /**
   * Serialize the fields of the given java object into JSON format.
   * The object values are read by reflection.
   * @param errInfo
   * @param value JSON representation.
   * @return
   */
  private String serializeFieldsToJson(ErrorInfo errInfo, Object value) {
    errInfo = errInfo.copy();
    StringBuilder sbuf = new StringBuilder();
    boolean addComma = false;
    Class<?> clazz = value.getClass();
    for (java.lang.reflect.Field field : clazz.getDeclaredFields()) {
      field.setAccessible(true);
      try {
        field.get(null);
      } catch (Exception e) {
        try {
          Object fieldValue = field.get(value);
          if (fieldValue != null) {
            if (addComma) sbuf.append(","); else addComma = true;
            sbuf.append("\"").append(field.getName()).append("\":");
            errInfo.fieldName = field.getName();
            sbuf.append(serializeObjectToJson(errInfo, fieldValue));
          }
          else {
            Class<?> fclazz = field.getType();
            if (fclazz.getName().equals("java.lang.String")) {
              if (addComma) sbuf.append(","); else addComma = true;
              sbuf.append("\"").append(field.getName()).append("\":\"\"");
            }
          }
        }
        catch (Exception e2) {}
      }
    }
    return sbuf.toString();
  }
  
  /**
   * Serialize an object into JSON format.
   * @param errInfo
   * @param value
   * @return JSON representation of the object.
   * @throws GeneratorException
   */
  protected String serializeObjectToJson(ErrorInfo errInfo, Object value) throws GeneratorException {
    errInfo = errInfo.copy();
    
    StringBuilder sbuf = new StringBuilder();
    Class<?> clazz = value.getClass();
    if (clazz.isArray()) {
      sbuf.append("[");
      for (int i = 0; i < Array.getLength(value); i++) {
        if (i != 0) sbuf.append(",");
        Object elm = Array.get(value, i);
        sbuf.append(serializeObjectToJson(errInfo, elm));
      }
      sbuf.append("]");
    }
    else if (clazz == Character.class) {
      int ch = (Character)value;
      if (!Character.isDefined(ch)) {
        errInfo.msg = "Invalid unicode character";
        throw new GeneratorException(errInfo);
      }
      sbuf.append("\"").append(value).append("\"");
    }
    else if (clazz == String.class) {
      sbuf.append("\"").append(value).append("\"");
    }
    else if (clazz.getName().startsWith("java.lang.")) {
      sbuf.append(value);
    }
    else {
      sbuf.append("{").append(serializeFieldsToJson(errInfo, value)).append("}");
    }
    return sbuf.toString();
  }


}