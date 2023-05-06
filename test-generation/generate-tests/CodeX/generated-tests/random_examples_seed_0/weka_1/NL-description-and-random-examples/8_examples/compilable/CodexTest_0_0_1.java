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


public class CodexTest_0_0_1 { 
  @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(new double[] {1, 2, 3});
        AlgVector v2 = new AlgVector(new double[] {4, 5, 6});
        AlgVector v3 = v1.add(v2);
        Assert.assertEquals(5, v3.getElement(0), 1.0e-12);
        Assert.assertEquals(7, v3.getElement(1), 1.0e-12);
        Assert.assertEquals(9, v3.getElement(2), 1.0e-12);
    }
}