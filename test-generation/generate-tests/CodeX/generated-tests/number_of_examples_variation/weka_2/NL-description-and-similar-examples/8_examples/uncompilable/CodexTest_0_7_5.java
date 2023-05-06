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


public class CodexTest_0_7_5 { 
    @Test
    public void getAsInstance() throws Exception {
      int numAtts = 4;
      int numVals = 2;
      Instances model = new Instances("Test", generateTestHeader(numAtts, numVals), 0);
      double[] values = new double[numAtts];
      for (int j = 0; j < numAtts; j++) {
	values[j] = j;
      }
      AlgVector v = new AlgVector(values);
      Random random = new Random(0);
      Instance inst = v.getAsInstance(model, random);
      assertNotNull(inst);
      assertEquals(inst.numAttributes(), numAtts);
      for (int j = 0; j < numAtts; j++) {
	assertEquals(values[j], inst.value(j), 0);
      }
      random = new Random(0);
      numAtts = 3;
      numVals = 3;
      Instances model2 = new Instances("Test", generateTestHeader(numAtts, numVals), 0);
      values = new double[numAtts];
      for (int j = 0; j < numAtts; j++) {
	values[j] = j;
      }
      v = new AlgVector(values);
      inst = v.getAsInstance(model2, random);
      assertNotNull(inst);
      assertEquals(inst.numAttributes(), numAtts);
      for (int j = 1; j < numAtts; j++) {
	// the first value generated will be 1
	assertEquals(values[j], inst.value(j), 0);
      }
      assertEquals(1.0, inst.value(0), 0);
    }
}