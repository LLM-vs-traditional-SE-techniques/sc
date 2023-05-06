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


public class CodexTest_0_1_1 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 5;
    Instances insts = new Instances(new BufferedReader(new StringReader(
									InstancesTest.INSTANCE_DATA)));
    insts.setClassIndex(insts.numAttributes() - 1);
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numInsts; i++) {
      Instance inst = v.getAsInstance(insts, new Random(i));
      assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
      for (int j = 0; j < numAtts; j++) {
	if (insts.attribute(j).isNumeric()) {
	  assertEquals("Numeric value differs", 0, inst.value(j), 0);
	} else {
	  assertTrue("Nominal value out of range", 
		     (inst.value(j) >= 0) && (inst.value(j) < numVals));
	}
      }
    }
  }
}