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


public class CodexTest_0_2_40 { 
  @Test
  public void testGetAsInstance() {
    Instances insts = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.IRIS_DATASET)));
    AlgVector v = new AlgVector(insts.numAttributes());
    for (int i = 0; i < v.numElements(); i++)
      v.setElement(i, i);
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differs", insts.numAttributes(), 
		   inst.numAttributes());
      for (int i = 0; i < insts.numAttributes(); i++) {
	if (insts.attribute(i).isNumeric())
	  assertEquals("Numeric value differs", i, inst.value(i), 1e-6);
	if (insts.attribute(i).isNominal())
	  assertEquals("Nominal value differs", 0, (int) inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}