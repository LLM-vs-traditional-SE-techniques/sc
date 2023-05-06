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


public class CodexTest_0_7_6 { 
  @Test
  public void testToInstance() {
    Instances insts = new Instances(getClass().getResourceAsStream("/weka/core/matrix/test.arff"));
    int numInsts = insts.numInstances();
    AlgVector vector = new AlgVector(new double[]{100});
    Instance inst = null;
    try {
      inst = vector.getAsInstance(insts, new Random(1));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception raised: " + ex.getMessage());
    }
    assertTrue("Object returned is null", inst != null);
    assertTrue("Object returned is not an Instance", inst instanceof Instance);
    assertTrue("Instance has incorrect number of attributes",
               inst.numAttributes() == insts.numAttributes());
    assertTrue("Instance has incorrect number of values",
               inst.numValues() == insts.numAttributes());
    assertTrue("Instance has incorrect class index",
               inst.classIndex() == insts.classIndex());
    assertTrue("Instance has incorrect class is missing",
               inst.classIsMissing() == false);
    assertTrue("Instance has incorrect value for attribute length",
               inst.value(0) == 100);
    assertTrue("Instance has incorrect value for attribute weight",
               inst.value(1) == 0);
    assertTrue("Instance has incorrect value for attribute width",
               inst.value(2) == 2);
    assertTrue("Instance has incorrect value for class attribute",
               inst.value(3) == 2);
  }
}