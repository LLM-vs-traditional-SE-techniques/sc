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


public class CodexTest_0_6_27 { 
  @Test
  public void testAdd() {
    final AlgVector v1 = new AlgVector(new double[]{1.0, 2.0, 3.0});
    final AlgVector v2 = new AlgVector(new double[]{0.0, 1.0, 2.0});
    final AlgVector v3 = v1.add(v2);
    assertEquals(1.0, v3.getElement(0), 0.000001);
    assertEquals(3.0, v3.getElement(1), 0.000001);
    assertEquals(5.0, v3.getElement(2), 0.000001);
  }

}