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


public class CodexTest_0_7_68 { 
  @Test
    public void testAdd() {
        double[] a = {1, 2, 3};
        double[] b = {4, 5, 6};
        AlgVector v1 = new AlgVector(a);
        AlgVector v2 = new AlgVector(b);
        AlgVector v3 = v1.add(v2);
        assertEquals(5, v3.getElement(0), 0);
        assertEquals(7, v3.getElement(1), 0);
        assertEquals(9, v3.getElement(2), 0);
    }
}