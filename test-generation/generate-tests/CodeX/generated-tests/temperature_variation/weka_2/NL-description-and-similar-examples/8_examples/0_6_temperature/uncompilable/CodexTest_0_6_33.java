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


public class CodexTest_0_6_33 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 4;
    double[] values = {1.0, 2.0, 3.0};
    Instances insts = makeTestInstances(numAtts, numVals);
    AlgVector vec = new AlgVector(values);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differs", numAtts, inst.numAttributes());
      assertEquals("Number of values differs", numVals, inst.numValues());
    } catch (Exception e) {
      e.printStackTrace();
      fail("Exception occurred: " + e.getMessage());
    }
  }
}