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


public class CodexTest_0_6_60 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances instances = new Instances(new StringReader(
							 InstancesTest.irisHeader + InstancesTest.irisData));
    AlgVector algVector = new AlgVector(instances.numAttributes());
    for (int j = 0; j < instances.numAttributes(); j++) {
      algVector.setElement(j, (double) j);
    }
    Instance instance = algVector.getAsInstance(instances, new Random(1));
    assertEquals("Number of attributes incorrect", 
		 instances.numAttributes(), instance.numAttributes());
    assertEquals("Class value incorrect", 1, instance.classValue());
    assertTrue("Dataset reference incorrect", instance.dataset() == instances);
    for (int j = 0; j < instances.numAttributes(); j++) {
      assertEquals("Value for attribute " + (j + 1) + " incorrect", 
		   j, instance.value(j), AlgVector.SMALL);
    }
  }
}