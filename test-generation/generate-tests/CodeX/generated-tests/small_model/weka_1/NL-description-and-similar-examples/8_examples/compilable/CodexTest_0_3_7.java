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


public class CodexTest_0_3_7 { 
  @Test
  public void testAdd_whenAddingTwoVectors() {
    AlgVector v1 = new AlgVector(new double[] {1, 2, 3});
    AlgVector v2 = new AlgVector(new double[] {1, 2, 3});
    AlgVector v3 = v1.add(v2);
    assertEquals(2, v3.numElements());
    assertEquals(2, v3.getElement(0));
    assertEquals(4, v3.getElement(1));
  }
}