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


public class CodexTest_0_2_6 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 3;
    double[] values = {1.0, 2.0, 3.0};
    Instances model = new Instances("Test", new ArrayList<Attribute>(), numAtts);
    for (int i = 0; i < numAtts; i++) {
      if (i < numAtts - 1) {
	model.insertAttributeAt(new Attribute("Nominal" + (i+1)), i);
      } else {
	model.insertAttributeAt(new Attribute("Numeric" + (i+1)), i);
      }
    }
    model.insertAttributeAt(new Attribute("Nominal" + numAtts, numVals), numAtts - 1);
    model.setClassIndex(model.numAttributes() - 1);
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differ", numAtts, inst.numAttributes());
      for (int i = 0; i < numAtts - 1; i++) {
	assertTrue("Attribute " + i + " is not nominal", inst.attribute(i).isNominal());
      }
      assertTrue("Attribute " + (numAtts - 1) + " is not numeric", inst.attribute(numAtts - 1).isNumeric());
      assertEquals("Number of values differ", numVals, inst.attribute(numAtts - 1).numValues());
      for (int i = 0; i < numAtts - 1; i++) {
	assertTrue("Value of attribute " + i + " is not in range", (inst.value(i) >= 0) && (inst.value(i) < numVals));
      }
      assertEquals("Value of attribute " + (numAtts - 1) + " differs", values[numAtts - 1], inst.value(numAtts - 1));
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage
}