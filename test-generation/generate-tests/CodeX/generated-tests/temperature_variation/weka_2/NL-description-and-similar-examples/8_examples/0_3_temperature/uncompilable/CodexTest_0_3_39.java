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


public class CodexTest_0_3_39 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 3;
    int numInsts = 10;
    int numTests = 10;
    Random random = new Random(1);
    Instances insts = new Instances(new Instances(new BufferedReader(
								     new StringReader(InstancesTest.INSTANCE_DATA))), 0);
    insts.setClassIndex(insts.numAttributes() - 1);
    for (int i = 0; i < numTests; i++) {
      AlgVector v = new AlgVector(numAtts);
      for (int j = 0; j < numInsts; j++) {
	Instance inst = v.getAsInstance(insts, random);
	assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
	for (int k = 0; k < numAtts; k++) {
	  if (insts.attribute(k).isNumeric()) {
	    assertTrue("Value is not NaN", inst.isMissing(k));
	  } else {
	    assertTrue("Value is out of range", 
		       (inst.value(k) >= 0) && (inst.value(k) < numVals));
	  }
	}
      }
    }
  }
}