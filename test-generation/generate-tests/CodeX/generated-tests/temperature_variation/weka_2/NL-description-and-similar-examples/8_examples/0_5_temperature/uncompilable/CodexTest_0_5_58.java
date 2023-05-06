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


public class CodexTest_0_5_58 { 
  @Test
    public void testGetAsInstance() {
    // create dataset
    FastVector fvWekaAttributes = new FastVector(2);
    Attribute a1 = new Attribute("a1");
    Attribute a2 = new Attribute("a2");
    fvWekaAttributes.addElement(a1);
    fvWekaAttributes.addElement(a2);
    Instances dataset = new Instances("TestInstances", fvWekaAttributes, 0);
    // create instance
    AlgVector v = new AlgVector(new double[] {1.0, 2.0});
    // get instance
    Instance inst = null;
    try {
      inst = v.getAsInstance(dataset, new Random(1));
    } catch (Exception e) {
      fail("Problem getting instance from vector: " + e);
    }
    // check instance
    assertEquals("Number of attributes differ", dataset.numAttributes(), 
		 inst.numAttributes());
    assertEquals("Number of values differ", dataset.numAttributes(), 
		 inst.numValues());
    assertEquals("Dataset reference differs", dataset, inst.dataset());
    assertTrue("Attribute type differs", inst.attribute(0).isNumeric());
    assertTrue("Attribute type differs", inst.attribute(1).isNumeric());
    assertEquals("Value differs", 1.0, inst.value(0), PRECISION);
    assertEquals("Value differs", 2.0, inst.value(1), PRECISION);
  }
}