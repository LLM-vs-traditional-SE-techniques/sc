import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_60 { 
  @Test
    public static void main(String[] args) throws Exception {
        String projectName = args[0];
        String packageName = args[1];
        String className = args[2];
        String srcPackage = args[3];
        String srcClass = args[4];
        File sourceDirectory = new File(projectName + "/src/" + srcPackage.replaceAll(Pattern.quote("."), "/"));
        if (!sourceDirectory.exists()) {
            sourceDirectory.mkdirs();
        }
        File sourceClass = new File(sourceDirectory + "/" + srcClass + ".java");
        if (sourceClass.exists()) {
            Files.delete(sourceClass.toPath());
        }
        File file = new File(projectName + "/src/" + packageName.replaceAll(Pattern.quote("."), "/") + "/" + className + ".java");
        String content = new String(Files.readAllBytes(file.toPath()));
        FileWriter sourceFileWriter = new FileWriter(sourceClass);
        BufferedWriter sourceBufferedWriter = new BufferedWriter(sourceFileWriter);
}