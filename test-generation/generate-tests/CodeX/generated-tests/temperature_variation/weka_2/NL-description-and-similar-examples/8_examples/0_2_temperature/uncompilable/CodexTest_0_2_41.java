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


public class CodexTest_0_2_41 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 3;
    int numInsts = 10;
    Instances insts = makeTestDataset(numAtts, numVals, numInsts);
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numAtts; i++) {
      v.setElement(i, i);
    }
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts; i++) {
	if (i < numAtts - numVals) {
	  assertEquals("Numeric value differs", i, inst.value(i));
	} else {
	  assertEquals("Nominal value differs", 0, inst.value(i));
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}