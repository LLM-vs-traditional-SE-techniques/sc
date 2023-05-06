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


public class CodexTest_0_6_8 { 
  @Test
  public void testClone() {
    AlgVector original = new AlgVector(2);
    original.setElement(0, 1.0);
    original.setElement(1, 2.0);
    AlgVector clone = (AlgVector) original.clone();
    assertEquals(original, clone);
    assertFalse(original == clone);
    original.setElement(1, 3.0);
    assertEquals(2.0, clone.getElement(1));
  }
}