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


public class CodexTest_0_2_5 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 3;
    int numInsts = 10;
    int numElements = 2;
    Instances data = null;
    try {
      data = makeTestDataset(numAtts, numVals, numInsts);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem setting up test instances");
    }
    AlgVector v = new AlgVector(numElements);
    for (int i = 0; i < numElements; i++) {
      v.setElement(i, i);
    }
    try {
      Instance inst = v.getAsInstance(data, new Random(1));
      assertEquals("Number of attributes is incorrect", numAtts, inst.numAttributes());
      assertEquals("Number of values is incorrect", numVals, inst.numValues());
      assertEquals("Number of elements is incorrect", numElements, v.numElements());
      assertEquals("Value of first attribute is incorrect", 0, inst.value(0));
      assertEquals("Value of second attribute is incorrect", 1, inst.value(1));
      assertEquals("Value of third attribute is incorrect", 2, inst.value(2));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Problem getting instance");
    }
  }
}