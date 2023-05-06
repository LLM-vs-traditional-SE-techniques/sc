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


public class CodexTest_0_3_34 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 10;
    int numTests = 10;
    int numTestsPerInst = 10;
    Random random = new Random(1);
    Instances instances = new Instances(new BufferedReader(new StringReader(
									   InstancesTest.makeTestDataset(numAtts, numVals, numInsts))));
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numTests; i++) {
      for (int j = 0; j < numInsts; j++) {
	for (int k = 0; k < numTestsPerInst; k++) {
	  Instance inst = v.getAsInstance(instances, random);
	  assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
	  for (int l = 0; l < numAtts; l++) {
	    if (instances.attribute(l).isNumeric()) {
	      assertTrue("Numeric value out of range", 
			 (inst.value(l) >= 0) && (inst.value(l) <= 1));
	    } else {
	      assertTrue("Nominal value out of range", 
			 (inst.value(l) >= 0) && (inst.value(l) < numVals));
	    }
	  }
	}
      }
    }
  }
}