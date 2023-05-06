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


public class CodexTest_0_3_1 { 
  @Test
  public void testGetAsInstance() {
    int numInstances = 10;
    int numAttributes = 10;
    int numValues = 5;
    Instances model = new Instances(numInstances);
    for (int i = 0; i < numAttributes; i++) {
      if (i % 2 == 0) {
	model.insertAttributeAt(new Attribute("Numeric" + i), i);
      } else {
	model.insertAttributeAt(new Attribute("Nominal" + i, numValues), i);
      }
    }
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instance inst = null;
    try {
      inst = v.getAsInstance(model, new Random(1));
    } catch (Exception e) {
      fail("Error: " + e.getMessage());
    }
    assertEquals("Length differs", numAttributes, inst.numAttributes());
    for (int i = 0; i < numAttributes; i++) {
      if (i % 2 == 0) {
	assertEquals((i+1) + ". value differs", data[i/2], inst.value(i));
      } else {
	assertTrue((
}