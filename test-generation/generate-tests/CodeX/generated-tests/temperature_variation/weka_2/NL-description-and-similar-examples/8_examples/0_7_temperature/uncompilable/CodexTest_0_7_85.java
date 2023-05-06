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


public class CodexTest_0_7_85 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 5;
    double[] elements = {1.0, 2.0, 3.0, 4.0};
    AlgVector vector = new AlgVector(elements);
    MockInstances model = new MockInstances();
    model.setNumAttributes(numAttributes);
    model.setNumNumeric(2);
    Random random = new Random();
    try {
      Instance inst = vector.getAsInstance(model, random);
      assertTrue(inst != null);
      assertTrue(inst.dataset() == model);
      assertTrue(inst.numAttributes() == numAttributes);
      assertTrue(inst.numValues() == numAttributes);
      assertTrue(inst.numValues() == numAttributes);
      assertTrue(inst.numMissing() == numAttributes - 2);
      for (int i = 0; i < elements.length; i++)
	assertTrue(inst.value(i) == elements[i]);
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
}