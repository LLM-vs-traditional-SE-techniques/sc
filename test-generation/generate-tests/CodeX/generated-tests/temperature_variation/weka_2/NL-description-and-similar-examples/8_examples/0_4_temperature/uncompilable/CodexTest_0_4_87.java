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


public class CodexTest_0_4_87 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAttributes = 4;
    int numInstances = 10;
    Instances testInstances = new Instances("test", 
					    createAttributes(numAttributes),
					    numInstances);
    testInstances.setClassIndex(numAttributes - 1);
    AlgVector v = new AlgVector(testInstances.numAttributes());
    for (int i = 0; i < numInstances; i++) {
      Instance inst = v.getAsInstance(testInstances, new Random(1));
      assertEquals(testInstances.numAttributes(), inst.numAttributes());
      assertEquals(testInstances.numAttributes(), inst.numValues());
      assertEquals(testInstances.numAttributes(), inst.numInputAttributes());
    }
  }
}