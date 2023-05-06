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


public class CodexTest_0_4_77 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {1.2, 3.4, 5.6});
    AlgVector v2 = new AlgVector(new double[] {2.3, 4.5, 6.7});
    AlgVector v3 = new AlgVector(new double[] {3.5, 7.9, 12.3});
    assertEquals("Addition failed", v3, v1.add(v2));
  }
}