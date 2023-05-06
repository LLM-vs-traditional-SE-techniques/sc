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


public class CodexTest_0_8_1 { 
      @Test
      public void testAddPositiveNumbers() {
        AlgVector v1 = new AlgVector(0, 2, 0);
        AlgVector v2 = new AlgVector(0, 2, 0);
        AlgVector v3 = v1.add(v2);
        assertEquals(AlgVector.ZERO, v3, 0.0);
      }
}