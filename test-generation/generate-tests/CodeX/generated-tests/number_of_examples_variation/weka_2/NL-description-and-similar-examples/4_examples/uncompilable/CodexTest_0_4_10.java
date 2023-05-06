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


public class CodexTest_0_4_10 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 5;
    int numValues = 4;
    int numInstances = 3;
    int numElements = 2;
    Random random = new Random(1);
    Instances data = new Instances(new MockInstances(numAttributes, numValues, numInstances));
    AlgVector v = new AlgVector(numElements);
    try {
      Instance inst = v.getAsInstance(data, random);
      assertEquals("number of attributes in instance and data differ", data.numAttributes(), inst.numAttributes());
      assertEquals("number of values in instance and data differ", data.numValues(), inst.numValues());
      assertEquals("number of instances in instance and data differ", data.numInstances(), inst.numInstances());
      assertEquals("number of elements in instance and data differ", data.numElements(), inst.numElements());
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
  }
}