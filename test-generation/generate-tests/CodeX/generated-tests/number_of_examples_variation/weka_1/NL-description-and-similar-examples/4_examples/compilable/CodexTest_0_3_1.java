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
  public void testAdd() {
    AlgVector v = new AlgVector(3);
    AlgVector w = new AlgVector(3);
    AlgVector z = v.add(w);
    assertEquals("Length differs", v.numElements(), z.numElements());
    for (int i = 0; i < v.numElements(); i++)
      assertEquals((i+1) + ". value differs", 0.0, z.getElement(i));
    w.setElement(1, 1.0);
    z = v.add(w);
    assertEquals("Length differs", v.numElements(), z.numElements());
    for (int i = 0; i < v.numElements(); i++)
      assertEquals((i+1) + ". value differs", w.getElement(i), z.getElement(i));
    v.setElement(2, 2.0);
    z = v.add(w);
    assertEquals("Length differs", v.numElements(), z.numElements());
    for (int i = 0; i < v.numElements(); i++)
      assertEquals((i+1) + ". value differs", v.getElement(i) + w.getElement(i), z.getElement(i));
  }
}