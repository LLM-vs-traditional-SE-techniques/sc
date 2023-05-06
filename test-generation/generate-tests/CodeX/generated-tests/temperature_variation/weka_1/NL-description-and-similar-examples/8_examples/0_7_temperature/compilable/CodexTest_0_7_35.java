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


public class CodexTest_0_7_35 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3});
    AlgVector b = new AlgVector(new double[] {4, 5, 6});
    AlgVector c = a.add(b);
    assertEquals("Sum incorrect", 5, c.getElement(0), 1e-10);
    assertEquals("Sum incorrect", 7, c.getElement(1), 1e-10);
    assertEquals("Sum incorrect", 9, c.getElement(2), 1e-10);
  }
}