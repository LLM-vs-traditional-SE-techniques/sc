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


public class CodexTest_0_2_53 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 10;
    int numAttributes = 5;
    int numNominal = 3;
    int numNumeric = 2;
    int numString = 0;
    int numDate = 0;
    int numRelational = 0;
    int numClasses = 2;
    int numMissing = 2;
    int seed = 1;
    Instances data = makeTestDataset(42, numInstances, numAttributes, 
				     numNominal, numNumeric, numString, 
				     numDate, numRelational, numClasses, 
				     numMissing, seed);
    AlgVector v = new AlgVector(numAttributes);
    for (int i = 0; i < numAttributes; i++) {
      v.setElement(i, i);
    }
    try {
      Instance inst = v.getAsInstance(data, new Random(seed));
      assertEquals("Number of attributes differs", numAttributes, 
		   inst.numAttributes());
      for (int i = 0; i < numAttributes; i++) {
	if (data.attribute(i).isNumeric()) {
	  assertEquals("Numeric attribute differs", i, inst.value(i), 1e-6);
	} else {
	  assertTrue("Nominal attribute differs", 
		     (int)inst.value(i) < data.attribute(i).numValues());
	}
      }
    } catch (Exception ex) {
      fail("Exception during getAsInstance: " + ex.getMessage());
    }
  }
}