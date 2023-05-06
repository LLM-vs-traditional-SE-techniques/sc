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


public class CodexTest_0_8_68 { 
      /**
     * Tests the addition of two vectors.
     */
    @Test public void testAddVectors() {
        double testDataA[] = {1, 2, 3, 4, 5};
        double testDataB[] = {1, 2, 3, 4, 5};
        double resultData[] = {2, 4, 6, 8, 10};
		double resultData2[] = {2.1, 4.1, 6.1, 8.1, 10.1};
        AlgVector a = new AlgVector(testDataA);
        AlgVector b = new AlgVector(testDataB);
		AlgVector c = new AlgVector(resultData);
		AlgVector d = new AlgVector(resultData2);
        AlgVector e = a.add(b);
        assertTrue("a+b=e", e.equals(c));
        AlgVector f = b.add(a);
        assertTrue("b+a=f", f.equals(c));
        AlgVector g = a.add(a);
        assertTrue("a+a=g", g.equals(c));
        AlgVector h = a.add(d);
        assertFalse("a+c=h", h.equals(c));
    }
}