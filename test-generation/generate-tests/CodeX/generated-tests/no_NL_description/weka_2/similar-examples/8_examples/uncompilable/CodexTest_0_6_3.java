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


public class CodexTest_0_6_3 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{0.0, 1.0, 2.0});
    Instances model = null;
    Instance inst = null;
    try {
      model = v.getAsInstance(null, null);
      inst = v.getAsInstance(model, null);
    } catch (Exception ex) {
      fail("Could not create instance from vector");
    }
    assertEquals("Number of attributes differs", 3, model.numAttributes());
    assertEquals("Number of attributes differs", 3, inst.numAttributes());
    assertEquals("Number of values differs", 3, v.numElements());
    assertEquals("Number of values differs", 3, inst.numValues());
    assertEquals("Value differs", 0.0, inst.value(0), 0.0);
    assertEquals("Value differs", 1.0, inst.value(1), 0.0);
    assertEquals("Value differs", 2.0, inst.value(2), 0.0);
  }
}