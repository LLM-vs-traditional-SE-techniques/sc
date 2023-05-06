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


public class CodexTest_0_5_20 { 
  @Test
  public void testAddition() {
    AlgVector a = new AlgVector(3);
    AlgVector b = new AlgVector(3);
    a.setElement(0, 1);
    a.setElement(1, 2);
    a.setElement(2, 3);
    b.setElement(0, 4);
    b.setElement(1, 5);
    b.setElement(2, 6);
    AlgVector c = a.add(b);
    assertEquals("0th element", 5, c.getElement(0), EPSILON);
    assertEquals("1st element", 7, c.getElement(1), EPSILON);
    assertEquals("2nd element", 9, c.getElement(2), EPSILON);
  }
}