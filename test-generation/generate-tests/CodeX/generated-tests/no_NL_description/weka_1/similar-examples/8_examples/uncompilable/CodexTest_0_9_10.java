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
  ;/**
-  * Tests the addition of two vectors.
+  * Tests the addition of two vectors with a given size.
   */
  public void testAddTwoVectorsOfGivenSize() {
    AlgVector v1 = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v1.setElement(0, 2.0);
    v1.setElement(1, 3.0);
    v2.setElement(0, 3.2);
    v2.setElement(1, 1.8);
    AlgVector expected = new AlgVector(2);
    expected.setElement(0, 5.2);
    expected.setElement(1, 4.8);
    assertEquals("Unexpected result.", expected, v1.add(v2));
  }
}