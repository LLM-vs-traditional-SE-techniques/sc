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


public class CodexTest_0_7_38 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
																						  "S0,S1,S2\nN,N,N\n1.0,2.0,3.0\n4.0,5.0,6.0\n7.0,8.0,9.0")));
    AlgVector v = new AlgVector(new double[] {2.3, 1.2, 5.0});
    Instance newInst = v.getAsInstance(model, new Random(1));
    assertEquals("Number of attributes differs", model.numAttributes(), newInst.numAttributes());
    assertEquals("1. attribute differs", 1.0, newInst.value(0));
    assertEquals("2. attribute differs", 2.0, newInst.value(1));
    assertEquals("3. attribute differs", 3.0, newInst.value(2));
  }
}