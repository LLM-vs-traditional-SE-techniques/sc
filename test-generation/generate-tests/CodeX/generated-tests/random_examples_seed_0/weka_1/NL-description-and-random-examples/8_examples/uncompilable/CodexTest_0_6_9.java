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


public class CodexTest_0_6_9 { 
    /**
     * Test of add method, of class AlgVector.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AlgVector other = new AlgVector(new double[]{7, 8, 9});
        AlgVector instance = new AlgVector(new double[]{1, 2, 3});
        AlgVector expResult = new AlgVector(new double[]{8, 10, 12});
        AlgVector result = instance.add(other);
        assertArrayEquals(expResult.m_Elements, result.m_Elements, 0.0);
    }
}