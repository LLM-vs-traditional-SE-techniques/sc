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


public class CodexTest_0_0_3 { 
    @Test
    public void testAdd() {
        AlgVector a = new AlgVector(new double[]{1, 2, 3});
        AlgVector b = new AlgVector(new double[]{4, 5, 6});
        AlgVector c = a.add(b);
        assertEquals(5, c.getElement(0));
        assertEquals(7, c.getElement(1));
        assertEquals(9, c.getElement(2));
    }
}