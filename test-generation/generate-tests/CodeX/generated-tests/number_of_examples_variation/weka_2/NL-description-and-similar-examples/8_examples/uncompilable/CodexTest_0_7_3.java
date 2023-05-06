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


public class CodexTest_0_7_3 { 
  @Test
  public void testGetAsInstance() {
    // Create the instance
    Instances inst = new Instances(m_Instances, 0);
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    try {
      Instance inst2 = v.getAsInstance(inst, new Random());
      assertEquals("Number of attributes is not the same", inst.numAttributes(),
		   inst2.numAttributes());
      for (int i = 0; i < inst2.numAttributes(); i++) {
	assertEquals("Datatype is not the same", inst.attribute(i).type(),
		     inst2.attribute(i).type());
      }
      assertEquals("Dataset is not the same", inst, inst2.dataset());
      assertEquals("Class is not the same", inst.classIndex(), inst2.classIndex());
      assertEquals("Number of values is not the same", inst.numValues(),
		   inst2.numValues());
      assertEquals("Number of weights is not the same", inst.numWeightAttributes(),
		   inst2.numWeightAttributes());
      assertEquals("Number of missing values is not the same", inst.numMissing(),
		   inst2.numMissing());
      assertEquals("Sum of weights is not the same", inst.sumOfWeights(), 
		   inst2.sumOfWeights());
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
  }
}