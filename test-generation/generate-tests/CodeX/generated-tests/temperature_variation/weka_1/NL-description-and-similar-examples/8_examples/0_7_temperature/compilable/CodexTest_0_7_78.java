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


public class CodexTest_0_7_78 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] { 1.0, 2.0 });
    AlgVector b = new AlgVector(new double[] { 3.0, 4.0 });
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    for (int i = 0; i < a.numElements(); i++)
      assertEquals((i+1) + ". value differs", a.getElement(i) + b.getElement(i), c.getElement(i));
  }
}