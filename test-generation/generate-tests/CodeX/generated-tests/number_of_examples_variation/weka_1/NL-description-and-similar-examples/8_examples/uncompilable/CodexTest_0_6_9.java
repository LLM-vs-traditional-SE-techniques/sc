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


public class CodexTest_0_6_9 { 
  @Test
  public void testSubtraction() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3, 4});
    AlgVector b = new AlgVector(new double[] {2, -3, -4, 5});
    assertEquals("(1, 2, 3, 4) - (2, -3, -4, 5) != (-1, 5, 7, -1)",
		 new AlgVector(new double[] {-1, 5, 7, -1}), a.subtract(b));
  }
}