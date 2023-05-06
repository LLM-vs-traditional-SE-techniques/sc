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


public class CodexTest_0_7_8 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(new double[]{1, 2, -3});
        AlgVector v2 = new AlgVector(new double[]{-4, 2, -1});
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(-3, v3.get(0), 1.0e-12);
        Assert.assertEquals(4, v3.get(1), 1.0e-12);
        Assert.assertEquals(-4, v3.get(2), 1.0e-12);
    }
}