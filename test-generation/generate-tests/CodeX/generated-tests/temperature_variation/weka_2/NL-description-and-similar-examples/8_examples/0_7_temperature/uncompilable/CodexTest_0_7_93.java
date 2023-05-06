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


public class CodexTest_0_7_93 { 
  @Test
  public void testSetValues() throws Exception {
    double[] testValues = { 1, 2, 3 };
    Instances testInsts = getTestInstances();
    Random random = new Random(1);
    Instance testInst = new DenseInstance(testInsts.firstInstance());
    testInst.setValue(0, testValues[0]);
    testInst.setValue(1, testValues[1]);
    testInst.setValue(2, testValues[2]);
    AlgVector vector = new AlgVector(testValues);
    Instance testInstance = vector.getAsInstance(testInsts, random);
    assertEquals("Test instance and instance created from vector differ",
		 testInst, testInstance);
  }
}