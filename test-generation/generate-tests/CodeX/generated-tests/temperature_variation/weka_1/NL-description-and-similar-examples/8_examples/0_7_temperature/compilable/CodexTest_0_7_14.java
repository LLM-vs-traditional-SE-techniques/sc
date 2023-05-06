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


public class CodexTest_0_7_14 { 
  @Test
   public void testAdd() {
    AlgVector a = new AlgVector(3);
    a.setElement(0, 1.0);
    a.setElement(1, 2.0);
    a.setElement(2, 3.0);
    AlgVector b = new AlgVector(3);
    b.setElement(0, 2.0);
    b.setElement(1, 4.0);
    b.setElement(2, 6.0);
    AlgVector c = a.add(b);
    assertEquals("(1, 2, 3) + (2, 4, 6) != (3, 6, 9)", 9.0,
		 c.getElement(0)+c.getElement(1)+c.getElement(2));
  }
}