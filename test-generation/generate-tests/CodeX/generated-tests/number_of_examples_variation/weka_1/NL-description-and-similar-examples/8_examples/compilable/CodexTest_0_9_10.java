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


public class CodexTest_0_9_10 { 
  @Test
  public void testAddMethod() {
    AlgVector a = new AlgVector(new double[]{0, 2, 4});
    AlgVector b = new AlgVector(new double[]{2, 0, 2});
    AlgVector c = new AlgVector(new double[]{2., 2., 6.});
    assertEquals("Wrong addition result", c, a.add(b));
  }
}