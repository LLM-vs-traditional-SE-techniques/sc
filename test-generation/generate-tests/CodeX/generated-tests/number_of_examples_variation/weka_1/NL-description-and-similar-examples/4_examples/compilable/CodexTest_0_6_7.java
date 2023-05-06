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


public class CodexTest_0_6_7 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4, 5 });
    AlgVector w = new AlgVector(new double[] { 1, 2, 3, 4, 5 });
    assertEquals(new AlgVector(new double[] { 2, 4, 6, 8, 10 }), v.add(w));
  }
}