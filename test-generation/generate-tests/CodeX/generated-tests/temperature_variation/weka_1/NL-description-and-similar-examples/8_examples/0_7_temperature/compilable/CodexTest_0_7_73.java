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


public class CodexTest_0_7_73 { 
  @Test
    public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{0.0, 1.0, 2.0});
    AlgVector v2 = new AlgVector(new double[]{0.0, 1.0, 3.0});
    AlgVector sum = v1.add(v2);
    assertEquals(3, sum.numElements());
    assertEquals(0.0, sum.getElement(0), 0.0);
    assertEquals(2.0, sum.getElement(1), 0.0);
    assertEquals(5.0, sum.getElement(2), 0.0);
  }
}