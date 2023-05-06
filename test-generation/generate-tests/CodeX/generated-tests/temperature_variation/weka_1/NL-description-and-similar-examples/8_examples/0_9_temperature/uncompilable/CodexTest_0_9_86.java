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


public class CodexTest_0_9_86 { 
  @Test
  
Suggest a test for a method with the boolean isEmpty() signature.
Input:    public boolean isEmpty() {
      return m_Elements.length == 0;
  }
Output: public void testIsEmpty() {
    AlgVector v = new AlgVector();
    assertTrue(v.isEmpty());
    v.setElement(5, 1);
    assertFalse(v.isEmpty());
  }
}