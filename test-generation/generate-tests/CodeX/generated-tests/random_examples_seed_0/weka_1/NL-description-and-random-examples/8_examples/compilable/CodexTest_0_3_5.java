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


public class CodexTest_0_3_5 { 
    @Test
    public void testAdd() {
        AlgVector instance = new AlgVector(new double[]{1, 2});
        AlgVector other = new AlgVector(new double[]{2, 4});
        AlgVector expResult = new AlgVector(new double[]{3, 6});
        AlgVector result = instance.add(other);
        assertEquals(expResult, result);
    }
}