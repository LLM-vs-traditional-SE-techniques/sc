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


public class CodexTest_0_8_58 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 3;
    int numAttributes = 4;
    String nameOfDataset = "Test";
    Instances data = null;
    double[] element1 = {1, 2, 3, 4};
    double[] element2 = {5, 6, 7, 8};
    double[] element3 = {9, 10, 11, 12};
    double[] element_new  = {13, 14, 15, 16};
    AlgVector test = new AlgVector(element3);
    try {
      data = getRandomInstances(numInstances, numAttributes, nameOfDataset);
      Instance inst = test.getAsInstance(data, null);
      assertEquals(numAttributes, inst.numAttributes());
      assertEquals(nameOfDataset, inst.dataset().relationName());
      assertEquals(9.0, inst.value(0), 0.1);
      assertEquals(10.0, inst.value(1), 0.1);
      assertEquals(11.0, inst.value(2), 0.1);
      assertEquals(12.0, inst.value(3), 0.1);
    } catch (Exception e) {
      e.printStackTrace();
      fail("Exception occured: " + e.getMessage());
    }
  }
}