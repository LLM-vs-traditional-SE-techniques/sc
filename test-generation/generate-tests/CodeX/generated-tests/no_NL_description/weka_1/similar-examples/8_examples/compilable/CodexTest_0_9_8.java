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


public class CodexTest_0_9_8 { 
  @Test
    public void testAdd() {
      AlgVector u = new AlgVector(new double[] {2.3, 2.4, 2.5});
      AlgVector v = new AlgVector(new double[] {1.1, 1.2, 1.3});
      AlgVector w = u.add(v);
      assertEquals(3.4, w.getElement(0), 1.0E-20);
      assertEquals(3.6, w.getElement(1), 1.0E-20);
      assertEquals(3.8, w.getElement(2), 1.0E-20);
    }
}