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


public class CodexTest_0_4_8 { 
    @Test
    public void testAdd() {
        AlgVector a = new AlgVector(1, 2, 3);
        AlgVector b = new AlgVector(4, 5, 6);
        AlgVector c = a.add(b);
        assertEquals(5, c.getComponent(0), 1e-10);
        assertEquals(7, c.getComponent(1), 1e-10);
        assertEquals(9, c.getComponent(2), 1e-10);
    }
}