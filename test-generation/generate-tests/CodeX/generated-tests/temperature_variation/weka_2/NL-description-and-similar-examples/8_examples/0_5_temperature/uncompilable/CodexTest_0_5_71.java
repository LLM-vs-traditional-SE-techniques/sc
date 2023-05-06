import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_71 { 
  @Test
  public void testCopy() throws Exception {
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "Id,Class,A,B,C,D\n"
								       +"1,1,0,0,0,0\n"
								       +"2,2,1,0,0,0\n"
								       +"3,3,0,1,0,0\n"
								       +"4,4,0,0,1,0\n"
								       +"5,5,0,0,0,1\n"
								       +"6,6,1,1,1,1\n")));
    data.setClassIndex(1);
    Instances copy = new Instances(data);
    copy.delete();
    assertEquals("Number of instances should be 0", 0, copy.numInstances());
    assertEquals("Number of attributes should be 0", 0, copy.numAttributes());
    copy = new Instances(data);
    copy.delete(0);
    assertEquals("Number of instances should be 5", 5, copy.numInstances());
    assertEquals("Number of attributes should be 6", 6, copy.numAttributes());
    copy = new Instances(data);
    copy.delete(1);
    assertEquals("Number of instances should be 5", 5, copy.numInstances());
    assertEquals("Number of attributes should be 6", 6, copy.numAttributes());
    copy = new Instances(data);
    copy.delete(2);
    assertEquals("Number of instances should be 5", 5, copy.numInstances());
    assertEquals("Number of attributes should be 6", 6, copy.numAttributes());
    copy = new Instances(data);
    copy.delete(3);
    assertEquals("Number of instances should be 5", 5, copy.numInstances());
    assertEquals
}