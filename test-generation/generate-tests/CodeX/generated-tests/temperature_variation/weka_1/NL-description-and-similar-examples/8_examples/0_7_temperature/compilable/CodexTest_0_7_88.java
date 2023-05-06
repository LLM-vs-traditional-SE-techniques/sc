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


public class CodexTest_0_7_88 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(new double[] { 2., 4., 0., 8. });
    AlgVector w = new AlgVector(new double[] { -1., 2., 5., 3. });
    AlgVector result = v.add(w);
    Assert.assertEquals(result.getElement(0), 1., 1e-10);
    Assert.assertEquals(result.getElement(1), 6., 1e-10);
    Assert.assertEquals(result.getElement(2), 5., 1e-10);
    Assert.assertEquals(result.getElement(3), 11., 1e-10);
  }
}