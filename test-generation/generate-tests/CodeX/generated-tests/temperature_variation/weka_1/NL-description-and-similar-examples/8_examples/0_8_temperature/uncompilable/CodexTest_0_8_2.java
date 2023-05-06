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


public class CodexTest_0_8_2 { 
    @Test
    public void testCopy() {
        System.out.println("copy");
        AlgMatrix instance = null;
        AlgMatrix expResult = null;
        AlgMatrix result = instance.copy();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
}