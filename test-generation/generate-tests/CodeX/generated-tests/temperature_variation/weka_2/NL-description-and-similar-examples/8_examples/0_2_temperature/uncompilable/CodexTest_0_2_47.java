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


public class CodexTest_0_2_47 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 2;
    int numInstances = 1;
    int numValues = 2;
    double[] values = {1.0, 2.0};
    Instances data = new Instances("Test", new ArrayList<Attribute>(), numInstances);
    data.insertAttributeAt(new Attribute("A1"), 0);
    data.insertAttributeAt(new Attribute("A2", Arrays.asList("V1", "V2")), 1);
    data.setClassIndex(1);
    AlgVector v = new AlgVector(values);
    Instance newInst = null;
    try {
      newInst = v.getAsInstance(data, new Random(1));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
    assertEquals("Number of attributes differ", numAttributes, newInst.numAttributes());
    assertEquals("Number of values differ", numValues, newInst.numValues());
    assertEquals("Value differs", values[0], newInst.value(0));
    assertEquals("Value differs", 0, newInst.value(1));
  }
}