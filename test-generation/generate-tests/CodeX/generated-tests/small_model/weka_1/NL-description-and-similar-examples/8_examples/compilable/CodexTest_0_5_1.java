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


public class CodexTest_0_5_1 { 
    @Test
    public void testAdd() {
        AlgVector a = new AlgVector(new double[] {1, 2, 3, 4});
        AlgVector b = new AlgVector(new double[] {1, 2, 3, 4});
        AlgVector c = a.add(b);
        assertEquals(2, c.getElement(0), 0);
        assertEquals(4, c.getElement(1), 0);
        assertEquals(6, c.getElement(2), 0);
        assertEquals(8, c.getElement(3), 0);
    }
}