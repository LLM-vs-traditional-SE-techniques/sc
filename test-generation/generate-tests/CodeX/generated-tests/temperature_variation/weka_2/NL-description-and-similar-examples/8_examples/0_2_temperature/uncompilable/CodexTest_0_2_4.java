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


public class CodexTest_0_2_4 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 10;
    Instances insts = null;
    try {
      insts = makeTestDataset(numAtts, numInstances);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem setting up test instances");
    }
    AlgVector vec = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      vec.setElement(i, i);
    }
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes is not correct", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	if (insts.attribute(i).isNumeric()) {
	  assertEquals("Numeric value is not correct", i, inst.value(i), 0);
	} else {
	  assertEquals("Nominal value is not correct", 0, inst.value(i), 0);
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem getting instance from vector");
    }
  }
}