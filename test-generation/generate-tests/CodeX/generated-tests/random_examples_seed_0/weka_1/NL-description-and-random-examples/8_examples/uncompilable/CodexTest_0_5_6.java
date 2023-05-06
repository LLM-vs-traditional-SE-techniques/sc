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


public class CodexTest_0_5_6 { 
    /**
     * Test of add method, of class AlgVector.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        AlgVector other = new AlgVector(4);
        other.m_Elements[0] = 1;
        other.m_Elements[1] = 2;
        other.m_Elements[2] = 3;
        other.m_Elements[3] = 4;
        AlgVector instance = new AlgVector(4);
        instance.m_Elements[0] = 11;
        instance.m_Elements[1] = 12;
        instance.m_Elements[2] = 13;
        instance.m_Elements[3] = 14;
        AlgVector expResult = new AlgVector(4);
        expResult.m_Elements[0] = 12;
        expResult.m_Elements[1] = 14;
        expResult.m_Elements[2] = 16;
        expResult.m_Elements[3] = 18;
        AlgVector result = instance.add(other);
        assertEquals(expResult, result);
    }

}