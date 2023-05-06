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


public class CodexTest_0_6_7 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(new double[]{1, 2, 3});
    AlgVector w = new AlgVector(new double[]{4, 5, 6});
    AlgVector x = v.add(w);
    assertEquals("Length differs", 3, x.numElements());
    assertEquals("Value 1 differs", 5, x.getElement(0), 1e-15);
    assertEquals("Value 2 differs", 7, x.getElement(1), 1e-15);
    assertEquals("Value 3 differs", 9, x.getElement(2), 1e-15);
  }
}