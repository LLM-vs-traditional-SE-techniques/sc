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
    public void testScaledAdd() {
        double[] data = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
        AlgVector v = new AlgVector(data);
        AlgVector vcopy = v.copy();
        v.scaleAddToSelf(2.0, vcopy);
        double[] expected = { 3.0, 6.0, 9.0, 12.0, 15.0, 18.0 };
        for (int i = 0; i < expected.length; i++) {
             assertEquals(expected[i], v.getElement(i), 1.0e-12);
        }
        assertEquals(1.0e-12, v.distance(new AlgVector(expected)), 1.0e-12);
    }
}