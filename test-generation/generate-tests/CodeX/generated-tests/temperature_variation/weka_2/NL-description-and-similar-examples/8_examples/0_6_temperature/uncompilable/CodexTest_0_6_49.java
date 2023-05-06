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


public class CodexTest_0_6_49 { 
  @Test
  public void testGetAsInstance() {
    double[] testArray = {1.0, 2.0, 3.0};
    AlgVector vector = new AlgVector(testArray);
    Instances data = null;
    try {
      data = DataSource.read("test/data/vote.arff");
    } catch (Exception e) {
      fail("Problems reading test data.");
    }
    Instance inst = null;
    try {
      inst = vector.getAsInstance(data, new Random(1));
    } catch (Exception e) {
      fail("Problems converting vector to instance: " + e);
    }
    assertNotNull("Instance is null", inst);
    assertEquals("Number of attributes differs", data.numAttributes(), 
		 inst.numAttributes());
    assertEquals("Number of values differs", testArray.length,
		 inst.numValues());
    for (int i = 0; i < testArray.length; i++)
      assertEquals("Value " + i + " differs", testArray[i], inst.value(i));
  }
}