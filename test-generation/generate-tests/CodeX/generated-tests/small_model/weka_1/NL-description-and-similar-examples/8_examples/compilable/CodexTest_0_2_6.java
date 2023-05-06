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


public class CodexTest_0_2_6 { 
    @Test
    public void testAdd() {
        AlgVector a = new AlgVector(new double[]{1, 2, 3});
        AlgVector b = new AlgVector(new double[]{1, 2, 3});
        AlgVector c = new AlgVector(new double[]{2, 4, 6});
        AlgVector d = a.add(b);
        assertEquals(c, d);
    }
}