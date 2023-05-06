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


public class CodexTest_0_4_3 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(3);
        AlgVector v2 = new AlgVector(3);
        v1.set(0, 1);
        v1.set(1, 2);
        v1.set(2, 3);
        v2.set(0, 4);
        v2.set(1, 5);
        v2.set(2, 6);
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(5, v3.get(0), 1e-10);
        Assert.assertEquals(7, v3.get(1), 1e-10);
        Assert.assertEquals(9, v3.get(2), 1e-10);
    }
}