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


public class CodexTest_0_3_17 { 
  @Test
  public void testGetAsInstance() throws Exception {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances inst = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"+
								       "1,2,3\n"+
								       "4,5,6\n"+
								       "7,8,9\n")));
    Instance inst2 = v.getAsInstance(inst, new Random(1));
    assertEquals("A", inst2.stringValue(0));
    assertEquals("B", inst2.stringValue(1));
    assertEquals("C", inst2.stringValue(2));
  }
}