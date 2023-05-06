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


public class CodexTest_0_9_85 { 
  @Test
  public void testAdd_OnSameSize() {
    AlgVector a = new AlgVector(new double[] {1, 2, 3});
    AlgVector b = new AlgVector(new double[] {2, 3, 4});
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    assertArrayEquals("Value differs", new double[] {3, 5, 7}, c.getData(), 1e-16);
  }
}