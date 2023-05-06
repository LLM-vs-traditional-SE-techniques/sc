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


public class CodexTest_0_7_53 { 
  @Test
  public void testDenseInstance() {
    double[] d1 = {1,2,3,4};
    AlgVector vec = new AlgVector(d1);
    Instances inst = new Instances(new BufferedReader(new StringReader(instData)), 0);
    try {
				Instance i = vec.getAsInstance(inst, new Random(123));
				assertTrue("Instance should have 4 values", i.numValues() == 4);
				// the values should be the same as in d1
				for (int n = 0; n < d1.length; n++)
				  assertEquals("Value differs", d1[n], i.value(n));
				// the last element should be a nominal value
				assertTrue("Last element should be nominal", i.isMissing(3) == false);
			} catch (Exception e) {
				fail("Error converting to instance: " + e);
			}
  }
}