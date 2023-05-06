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
   public void testAddEmpty() {
    AlgVector ve1 = new AlgVector();
    AlgVector result = ve1.add(ve1);
    assertTrue("Result vector is not empty", result.numElements() == 0);
  }
}