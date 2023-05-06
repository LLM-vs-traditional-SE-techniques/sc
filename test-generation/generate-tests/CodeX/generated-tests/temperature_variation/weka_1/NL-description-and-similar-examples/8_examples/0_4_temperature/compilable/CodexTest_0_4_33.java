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


public class CodexTest_0_4_33 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1,2,3,4,5,6});
    AlgVector v2 = new AlgVector(new double[]{6,5,4,3,2,1});
    AlgVector v3 = v1.add(v2);
    assertEquals(v1.getElement(0) + v2.getElement(0), v3.getElement(0), 0.00001);
    assertEquals(v1.getElement(1) + v2.getElement(1), v3.getElement(1), 0.00001);
    assertEquals(v1.getElement(2) + v2.getElement(2), v3.getElement(2), 0.00001);
    assertEquals(v1.getElement(3) + v2.getElement(3), v3.getElement(3), 0.00001);
    assertEquals(v1.getElement(4) + v2.getElement(4), v3.getElement(4), 0.00001);
    assertEquals(v1.getElement(5) + v2.getElement(5), v3.getElement(5), 0.00001);
  }
}