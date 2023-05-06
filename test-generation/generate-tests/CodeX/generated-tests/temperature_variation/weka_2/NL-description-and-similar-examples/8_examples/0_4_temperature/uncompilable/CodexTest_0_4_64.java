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


public class CodexTest_0_4_64 { 
  @Test
  public void testGetAsInstance() {
    int num = 3;
    AlgVector v = new AlgVector(num);
    for (int i = 0; i < num; i++)
      v.setElement(i, i);
    Instances model = new Instances(new FastVector(), new FastVector());
    model.add(new Attribute("1"));
    model.add(new Attribute("2"));
    model.add(new Attribute("3"));
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("1. attribute differs", 0.0, inst.value(0));
      assertEquals("2. attribute differs", 1.0, inst.value(1));
      assertEquals("3. attribute differs", 2.0, inst.value(2));
    } catch (Exception e) {
      fail("Exception occured: " + e.getMessage());
    }
  }
}