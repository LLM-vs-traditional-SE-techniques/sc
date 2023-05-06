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


public class CodexTest_0_4_5 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {1.0, 2.0, 3.0});
    AlgVector v2 = new AlgVector(new double[] {4.0, 5.0, 6.0});
    AlgVector v3 = v1.add(v2);
    assertEquals(v3.getElement(0), 5.0, 0.0);
    assertEquals(v3.getElement(1), 7.0, 0.0);
    assertEquals(v3.getElement(2), 9.0, 0.0);
  }
}