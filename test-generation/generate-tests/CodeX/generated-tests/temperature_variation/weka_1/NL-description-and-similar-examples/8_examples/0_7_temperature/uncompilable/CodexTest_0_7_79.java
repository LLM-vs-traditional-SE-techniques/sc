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


public class CodexTest_0_7_79 { 
    @Test
    public void testAdd() {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = {4, 6};
        AlgVector v1 = new AlgVector(a);
        AlgVector v2 = new AlgVector(b);
        AlgVector v3 = new AlgVector(c);
        assertEquals(v1.add(v2), v3);
    }
}