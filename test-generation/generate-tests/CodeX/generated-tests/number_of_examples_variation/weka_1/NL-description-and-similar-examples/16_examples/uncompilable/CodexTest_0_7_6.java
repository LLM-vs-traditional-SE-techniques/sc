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


public class CodexTest_0_7_6 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(1, 2, 3);
    AlgVector b = new AlgVector(3, 2, 1);
    AlgVector c = a.add(b);
    assertEquals(4, c.getElement(0));
    assertEquals(4, c.getElement(1));
    assertEquals(4, c.getElement(2));
  }
}