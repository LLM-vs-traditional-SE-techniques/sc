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


public class CodexTest_0_6_3 { 
    @Test
    public void testAdd() {
        double[] data = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        AlgVector v1 = new AlgVector(data);
        AlgVector v2 = new AlgVector(data);
        AlgVector v3 = v1.add(v2);
        assertEquals(7.0, v3.getElement(0), 0.0000000001);
        assertEquals(8.0, v3.getElement(1), 0.0000000001);
        assertEquals(9.0, v3.getElement(2), 0.0000000001);
        assertEquals(10.0, v3.getElement(3), 0.0000000001);
        assertEquals(11.0, v3.getElement(4), 0.0000000001);
        assertEquals(12.0, v3.getElement(5), 0.0000000001);
    }
}