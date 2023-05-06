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


public class CodexTest_0_5_11 { 
  @Test
  public void testGetAsInstance() {
    try {
      int numAttr = 10;
      int numInst = 20;
      Instances model = new Instances(new Instance(numAttr), numInst);
      model.setClassIndex(0);
      AlgVector vec = new AlgVector(numAttr - 1);
      for (int i = 0; i < numAttr - 1; i++)
	vec.setElement(i, i);
      Instance inst = vec.getAsInstance(model, new Random(1));
      assertTrue("Instance is null", inst != null);
      assertTrue("Length of instance differs", 
		 inst.numAttributes() == numAttr);
      for (int i = 0; i < numAttr - 1; i++)
	assertTrue((i+1) + ". value differs", 
		   inst.value(i) == i);
      assertTrue("Class value differs", 
		 inst.classValue() == (int) (numAttr * Math.random()));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}