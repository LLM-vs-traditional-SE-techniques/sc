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


public class CodexTest_0_3_21 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 6;
    int numVals = 5;
    int numInsts = 10;
    int numTests = 20;
    Random random = new Random(1);
    Instances data = new Instances(new BufferedReader(new StringReader(
								       TestInstances.createTestDataset(numAtts, numVals, numInsts, random))));
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      v.setElement(i, random.nextDouble());
    }
    for (int i = 0; i < numTests; i++) {
      Instance inst = v.getAsInstance(data, random);
      assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
      for (int j = 0; j < numAtts; j++) {
	if (data.attribute(j).isNumeric()) {
	  assertEquals("Numeric attribute differs", v.getElement(j), inst.value(j));
	} else {
	  assertTrue("Nominal attribute differs", 
		     (int) inst.value(j) < data.attribute(j).numValues());
	}
      }
    }
  }
}