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


public class CodexTest_0_7_19 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances inst = new Instances(new BufferedReader(
						     new StringReader(
								      InstancesTest.INSTANCE_TEST_DATA)));
    AlgVector v = new AlgVector(inst.numAttributes());
    Instance inst2 = v.getAsInstance(inst, new Random(1));
    assertEquals(v.numElements(), inst.numAttributes());
    assertEquals(inst.numAttributes(), inst2.numAttributes());
    for (int i = 0; i < inst.numAttributes(); i++) {
      if (inst.attribute(i).isNumeric())
	assertEquals(0, inst2.value(i), 1E-6);
      if (inst.attribute(i).isNominal())
	assertEquals(1, inst2.value(i), 1E-6);
    }
  }
}