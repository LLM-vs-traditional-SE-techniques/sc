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


public class CodexTest_0_7_59 { 
       @Test
  public void testAdd() {
    double[] data = {1, 2, 3};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    assertEquals("Adding vectors of the same length works.", new AlgVector(new double[] {2, 4, 6}), v.add(v2));
    assertEquals("Adding vectors of the same length works.", new AlgVector(new double[] {2, 4, 6}), v2.add(v));
  }
}