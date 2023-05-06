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


public class CodexTest_0_6_6 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[]{2.3, 1.2, 5.0});
    AlgVector b = new AlgVector(new double[]{-0.7, -1.9, 0.0});
    AlgVector c = new AlgVector(a);
    c.add(b);
    assertEquals("1. value differs", 1.6, c.getElement(0));
    assertEquals("2. value differs", -0.7, c.getElement(1));
    assertEquals("3. value differs", 5.0, c.getElement(2));
  }
}