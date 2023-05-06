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


public class CodexTest_0_3_85 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numVal = 4;
    int numInst = 5;
    int numElements = 6;
    Random random = new Random(1);
    Instances insts = makeTestInstances(numAtt, numVal, numInst);
    AlgVector v = new AlgVector(numElements);
    for (int i = 0; i < numElements; i++)
      v.setElement(i, i);
    Instance inst = null;
    try {
      inst = v.getAsInstance(insts, random);
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
    assertEquals("Wrong number of attributes", numAtt, inst.numAttributes());
    assertEquals("Wrong number of values", numVal, inst.numValues());
    assertEquals("Wrong number of elements", numElements, v.numElements());
    for (int i = 0; i < numAtt; i++) {
      if (insts.attribute(i).isNumeric()) {
	assertEquals("Wrong value for numeric attribute", 
		     i, inst.value(i), 1e-6);
      }
      if (insts.attribute(i).isNominal()) {
	assertEquals("Wrong value for nominal attribute", 
		     1, inst.value(i), 1e-6);
      }
    }
  }
}