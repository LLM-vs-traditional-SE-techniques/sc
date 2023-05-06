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


public class CodexTest_0_9_2 { 
  @Test
  public void testSubtractScalar() {
        AlgVector v = new AlgVector(5);
        v.setElement(0, 1);
        v.setElement(1, 2);
        v.setElement(2, 3);
        v.setElement(3, 4);
        v.setElement(4, 5);
        assertEquals("subtract scalar",new AlgVector(new double[] {-1, -1, -1, -1, -1}), v.subtract(-2));
    }
}