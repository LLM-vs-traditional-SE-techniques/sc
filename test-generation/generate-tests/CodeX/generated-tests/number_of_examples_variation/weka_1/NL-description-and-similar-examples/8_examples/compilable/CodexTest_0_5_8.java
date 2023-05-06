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


public class CodexTest_0_5_8 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector w = new AlgVector(data);
    AlgVector u = v.add(w);
    AlgVector expected = new AlgVector(new double[]{2.3*2, 1.2*2, 5.0*2});
    assertTrue(expected.equals(u));
  }
}