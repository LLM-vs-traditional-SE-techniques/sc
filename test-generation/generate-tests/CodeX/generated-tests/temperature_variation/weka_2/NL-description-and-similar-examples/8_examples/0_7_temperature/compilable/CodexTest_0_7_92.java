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


public class CodexTest_0_7_92 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Random random = new Random();
    for (int i = 0; i < 10; i++) {
      double[] v = new double[10];
      for (int j = 0; j < 10; j++)
	v[j] = random.nextDouble();
      AlgVector vec = new AlgVector(v);
      Instances predInsts = null;
      try {
	predInsts = new Instances(new java.io.StringReader(
	    "C1,C2,C3,C4,C5\n" +
	    "0,0,0,0,0\n" +
	    "1,1,1,1,1\n" +
	    "2,2,2,2,2\n" +
	    "3,3,3,3,3\n" +
	    "4,4,4,4,4\n" +
	    "5,5,5,5,5\n" +
	    "6,6,6,6,6\n" +
	    "7,7,7,7,7\n" +
	    "8,8,8,8,8\n" +
	    "9,9,9,9,9"));
      } catch (Exception ex) {
	throw new Error("Error reading test data.");
      }
      Instances model = new Instances(predInsts, 0);
      Instance inst = vec.getAsInstance(model, random);
      assertEquals("Number of attributes differs", 10, inst.numAttributes());
      for (int j = 0; j < 10; j++)
	assertEquals("Value differs", v[j], inst.value(j), 1e-6);
    }
  }
}