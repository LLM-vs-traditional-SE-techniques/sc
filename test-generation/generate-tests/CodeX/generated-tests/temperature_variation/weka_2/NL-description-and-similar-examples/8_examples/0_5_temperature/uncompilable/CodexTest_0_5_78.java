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


public class CodexTest_0_5_78 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    Instances model = new Instances(new FastVector(), numAttributes);
    model.add(new Attribute("A1"));
    model.add(new Attribute("A2"));
    model.add(new Attribute("A3"));
    AlgVector v = new AlgVector(3);
    double[] data = {1.0, 2.0, 3.0};
    v.setElements(data);
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals(numAttributes, inst.numAttributes());
      assertEquals(1.0, inst.value(0), 1e-15);
      assertEquals(2.0, inst.value(1), 1e-15);
      assertEquals(2.0, inst.value(2), 1e-15);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}