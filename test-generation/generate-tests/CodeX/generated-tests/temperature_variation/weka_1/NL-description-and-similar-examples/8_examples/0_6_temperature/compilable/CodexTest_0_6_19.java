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


public class CodexTest_0_6_19 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[]{3, 4, 5});
    AlgVector b = new AlgVector(new double[]{2, 3, 4});
    AlgVector c = a.add(b);
    assertEquals(5, c.getElement(0));
    assertEquals(7, c.getElement(1));
    assertEquals(9, c.getElement(2));
  }
}