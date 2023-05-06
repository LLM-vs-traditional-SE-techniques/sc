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


public class CodexTest_0_4_2 { 
  @Test
  public void testAddVector() {
    AlgVector a = new AlgVector(3);
    AlgVector b = new AlgVector(3);
    AlgVector c = new AlgVector(3);
    a.setElement(0, 1.0);
    a.setElement(1, 2.0);
    a.setElement(2, 3.0);
    b.setElement(0, 4.0);
    b.setElement(1, 5.0);
    b.setElement(2, 6.0);
    c.setElement(0, 5.0);
    c.setElement(1, 7.0);
    c.setElement(2, 9.0);
    AlgVector d = a.add(b);
    assertEquals(c, d);
  }
}