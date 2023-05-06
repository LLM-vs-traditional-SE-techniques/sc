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


public class CodexTest_0_4_5 { 
  @Test
    public void testAdd() {
        AlgVector a = new AlgVector(3);
        AlgVector b = new AlgVector(3);
        AlgVector c = null;
        a.set(0, 1);
        a.set(1, 2);
        a.set(2, 3);
        b.set(0, 4);
        b.set(1, 5);
        b.set(2, 6);
        c = a.add(b);
        assertTrue(c.get(0) == 5);
        assertTrue(c.get(1) == 7);
        assertTrue(c.get(2) == 9);
    }
}