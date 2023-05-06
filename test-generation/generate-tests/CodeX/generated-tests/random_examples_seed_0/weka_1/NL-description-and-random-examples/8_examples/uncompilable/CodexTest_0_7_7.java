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


public class CodexTest_0_7_7 { 
  @Test
    public void testAdd() {
        AlgVector a = new AlgVector(3, new double[] {2, 2, 2});
        AlgVector b = new AlgVector(3, new double[] {1, 1, 1});
        b = b.add(a);
        assertEquals(b.get(0), 3);
        assertEquals(b.get(1), 3);
        assertEquals(b.get(2), 3);
    }
}