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


public class CodexTest_0_7_9 { 
  @Test
  public void testCreateSubvector() {
    AlgVector a = new AlgVector(new double[] {0.0, 1.0, 2.0, 3.0, 4.0});
    AlgVector b = new AlgVector(new double[] {5.0, 6.0, 7.0});
    AlgVector c = new AlgVector(new double[] {8.0, 9.0, 10.0, 11.0, 12.0});
    assertEquals(a, a.add(new AlgVector(3)));
    assertEquals(b, b.add(new AlgVector(3)));
    assertEquals(c, c.add(new AlgVector(3)));
  }
}