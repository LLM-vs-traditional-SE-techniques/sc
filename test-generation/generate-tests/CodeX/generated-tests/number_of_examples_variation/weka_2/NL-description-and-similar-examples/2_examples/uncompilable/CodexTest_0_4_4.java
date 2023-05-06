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


public class CodexTest_0_4_4 { 
  @Test
  public void testGetAsInstance() {
    try {
      int len = 3;
      AlgVector v = new AlgVector(len);
      Instances model = new Instances(new BufferedReader(
							new StringReader(
									 "A,B,C,D,E\n" +
									 "N,N,N,N,N\n" +
									 "0,0,0,0,0\n" +
									 "1,1,1,1,1\n" +
									 "2,2,2,2,2\n")));
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Length differs", len, inst.numAttributes());
      assertEquals("Dataset differs", model, inst.dataset());
      assertTrue("Missing value", inst.isMissing(0));
      assertTrue("Missing value", inst.isMissing(1));
      assertTrue("Missing value", inst.isMissing(2));
    } catch (Exception e) {
      fail("Exception thrown: " + e);
}