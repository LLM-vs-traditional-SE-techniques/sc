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


public class CodexTest_0_8_40 { 
  @Test
    public void testAddVectors() {
        double[] e1 = {0, 1, 2};
        double[] e2 = {2, 3, 4};
        AlgVector v1 = new AlgVector(e1);
        AlgVector v2 = new AlgVector(e2);
        AlgVector sum = v1.add(v2);
        assertEquals(3, sum.getElement(0), 0.001);
        assertEquals(4, sum.getElement(1), 0.001);
        assertEquals(6, sum.getElement(2), 0.001);
    }
}