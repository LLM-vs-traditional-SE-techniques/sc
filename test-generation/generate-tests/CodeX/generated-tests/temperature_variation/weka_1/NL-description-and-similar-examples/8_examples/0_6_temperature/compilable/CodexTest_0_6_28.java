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


public class CodexTest_0_6_28 { 
  @Test
  public void testAddMethod() {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector w = new AlgVector(new double[]{2.0, 3.0, 4.0});
    AlgVector z = v.add(w);
    assertEquals(3.0, z.getElement(0), 0.1);
    assertEquals(5.0, z.getElement(1), 0.1);
    assertEquals(7.0, z.getElement(2), 0.1);
  }
}