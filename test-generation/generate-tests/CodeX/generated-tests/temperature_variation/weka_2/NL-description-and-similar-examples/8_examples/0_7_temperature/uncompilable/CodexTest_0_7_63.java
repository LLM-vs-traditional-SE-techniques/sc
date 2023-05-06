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


public class CodexTest_0_7_63 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances i = new Instances(new FastVector(), 0);
    i.insertAttributeAt(new Attribute("A1"), 0);
    i.insertAttributeAt(new Attribute("A2"), 1);
    i.insertAttributeAt(new Attribute("A3"), 2);
    try {
      Instance inst = v.getAsInstance(i, new Random(1));
      assertEquals("A1 wrong", 1.0, inst.value(0));
      assertEquals("A2 wrong", 1.0, inst.value(1));
      assertEquals("A3 wrong", 1.0, inst.value(2));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}