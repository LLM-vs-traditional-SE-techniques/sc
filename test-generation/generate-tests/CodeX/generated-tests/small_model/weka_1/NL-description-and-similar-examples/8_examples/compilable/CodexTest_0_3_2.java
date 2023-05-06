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


public class CodexTest_0_3_2 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3, 4, 5});
    AlgVector b = new AlgVector(new double[] {1, 2, 3, 4, 5});
    AlgVector c = a.add(b);
    assertEquals(new AlgVector(new double[] {2, 4, 6, 8, 10}), c);
  }
}