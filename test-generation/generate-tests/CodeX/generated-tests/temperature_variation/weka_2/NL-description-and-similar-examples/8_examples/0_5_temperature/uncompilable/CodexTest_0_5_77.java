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


public class CodexTest_0_5_77 { 
  @Test
  public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[]{1, 2, 3});
    Instances data = new Instances(new BufferedReader(new StringReader("@RELATION Test\n" +
								      "@ATTRIBUTE a numeric\n" +
								      "@ATTRIBUTE b numeric\n" +
								      "@ATTRIBUTE c numeric\n" +
								      "@DATA\n" +
								      "1,2,3\n")));
    Instance inst = v.getAsInstance(data, new Random(1));
    assertEquals("Number of attributes differs", 3, inst.numAttributes());
    assertEquals("First attribute differs", 1.0, inst.value(0), 1e-8);
    assertEquals("Second attribute differs", 2.0, inst.value(1), 1e-8);
    assertEquals("Third attribute differs", 3.0, inst.value(2), 1e-8);
  }
}