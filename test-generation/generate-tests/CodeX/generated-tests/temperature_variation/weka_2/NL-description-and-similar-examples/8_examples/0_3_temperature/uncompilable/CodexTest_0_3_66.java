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


public class CodexTest_0_3_66 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 4;
    Instances insts = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.INSTANCE_DATA)), 0);
    insts.setClassIndex(insts.numAttributes() - 1);
    AlgVector vec = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      vec.setElement(i, i);
    }
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals(numAtts, inst.numAttributes());
      assertEquals(insts.classAttribute().value((int)inst.classValue()),
		   "first");
      for (int i = 0; i < numAtts; i++) {
	if (i == numAtts - 1) {
	  assertEquals(insts.attribute(i).value((int)inst.value(i)),
		       "first");
	} else {
	  assertEquals(inst.value(i), i, 0);
	}
      }
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}