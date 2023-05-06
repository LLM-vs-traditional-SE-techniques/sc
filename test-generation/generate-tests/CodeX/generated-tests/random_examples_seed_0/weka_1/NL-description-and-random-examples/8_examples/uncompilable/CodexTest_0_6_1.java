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


public class CodexTest_0_6_1 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(new double[] {1,2,3,4});
        AlgVector v2 = new AlgVector(new double[] {-1,-2,-3,-4});
        AlgVector v3 = v1.add(v2);
        assertEquals(v3.get(0),0,0.0);
        assertEquals(v3.get(1),0,0.0);
        assertEquals(v3.get(2),0,0.0);
        assertEquals(v3.get(3),0,0.0);
    }
}