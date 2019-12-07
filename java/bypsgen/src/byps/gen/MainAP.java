package byps.gen;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import javax.tools.StandardJavaFileManager;
import javax.tools.StandardLocation;
import javax.tools.ToolProvider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import byps.gen.db.ClassDB;
import byps.gen.db.ConstFieldReader;
import byps.gen.db.XmlClassDB;
import byps.gen.xml.XmlGenerator;
import byps.gen.xml.XmlGeneratorBase;

public class MainAP extends Main {
  
  private static Log log = LogFactory.getLog(MainAP.class);
  
  private Context context;
  
  public MainAP(Context context) {
    this.context = context;
  }
  
  public void run() throws IOException {
    
    // -----------------------------------------------
    // Read XML file with reference definition

    ClassDB prevClassDB = readReferenceClassDB(context);
    
    // --------------------------------------------------------------------
    // Compile source and provide access to read constant values.

    ConstFieldReader constFieldReader = buildConstFieldReader(context);
    
    // ------------------------------------------------
    // Convert javadoc objects to internal representation

    log.info("Analyze classes in source directories ==============");
    ClassDB newClassDB = generateApi(context, constFieldReader);
    
    // ------------------------------------------------
    // Write current definition into XML file

    File file = context.getFileClassDBNew();
    XmlClassDB.write(file, newClassDB);
    
    // ------------------------------------------------
    // Compare reference definition with current definition.
    // Is the current definition compatible?

    checkCompatibility(context, prevClassDB, newClassDB);
  }

  private ClassDB generateApi(Context context, ConstFieldReader constFieldReader) throws IOException {
    
    int options = XmlGeneratorBase.OPT_ALL_REMOTES | XmlGeneratorBase.OPT_ALL_SERIALS;
    XmlGenerator xmlGenerator = new XmlGenerator(options, constFieldReader);

    List<File> sourceDirs = Arrays.asList(context.getSourceDirs()).stream()
        .map(File::new).map(File::getAbsoluteFile).collect(Collectors.toList());
    Iterable<JavaFileObject> files = getSourceFiles(sourceDirs);

    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();

    CompilationTask task = compiler.getTask(new PrintWriter(System.out), null, null, null, null, files);
    task.setProcessors(Arrays.asList(xmlGenerator));

    task.call();

    return xmlGenerator.getClassDB();
  }
  
  private Iterable<JavaFileObject> getSourceFiles(List<File> sourceDirs) throws IOException {
    JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
    StandardJavaFileManager files = compiler.getStandardFileManager(null, null, null);

    files.setLocation(StandardLocation.SOURCE_PATH, sourceDirs);

    Set<Kind> fileKinds = Collections.singleton(Kind.SOURCE);
    return files.list(StandardLocation.SOURCE_PATH, "", fileKinds, true);
  }


}