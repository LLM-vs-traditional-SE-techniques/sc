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


public class CodexTest_0_4_9 { 
    @Test
    public void testAdd() {
        AlgVector instance = new AlgVector(new double[]{0, 0, 0});
        AlgVector other = new AlgVector(new double[]{0, 0, 0});
        AlgVector expResult = new AlgVector(new double[]{0, 0, 0});
        AlgVector result = instance.add(other);
        assertEquals(expResult, result);
    }
}