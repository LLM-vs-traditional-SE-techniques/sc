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


public class CodexTest_0_7_52 { 
  @Test
  public void testAddVectors() {
    AlgVector a = new AlgVector(3);
    a.setElement(0,1.0);
    a.setElement(1,2.0);
    a.setElement(2,3.0);
    AlgVector b = new AlgVector(3);
    b.setElement(0,4.0);
    b.setElement(1,5.0);
    b.setElement(2,6.0);
    AlgVector c = a.add(b);
    assertEquals("failure - not identical", 5.0, c.getElement(0), DELTA);
    assertEquals("failure - not identical", 7.0, c.getElement(1), DELTA);
    assertEquals("failure - not identical", 9.0, c.getElement(2), DELTA);
  }
}