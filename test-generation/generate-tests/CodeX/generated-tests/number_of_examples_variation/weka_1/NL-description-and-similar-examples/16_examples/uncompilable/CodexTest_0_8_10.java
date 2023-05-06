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


public class CodexTest_0_8_10 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(2);
    a.setElement(0, 1.0);
    a.setElement(1, 2.0);
    AlgVector b = new AlgVector(2);
    b.setElement(0, 3.0);
    b.setElement(1, 4.0);
    AlgVector c = a.add(b);
    assertEquals("Wrong value for element 0", 4.0, c.getElement(0), DOUBLE_EPS);
    assertEquals("Wrong value for element 1", 6.0, c.getElement(1), DOUBLE_EPS);
  }
}