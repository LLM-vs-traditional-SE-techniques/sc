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


public class CodexTest_0_5_5 { 
  @Test
     public void testAdd() {
        AlgVector v1 = new AlgVector(1);
        AlgVector v2 = new AlgVector(2);
        AlgVector v3 = new AlgVector(2);
        AlgVector v4 = new AlgVector(2);
        v3.setElement(0, 1);
        v3.setElement(1, 2);
        v4.setElement(0, -1);
        v4.setElement(1, -2);
        v1.add(v2);
        Assert.assertEquals(3, v1.getElement(0), 1.0e-12);
        Assert.assertEquals(4, v1.getElement(1), 1.0e-12);
        v1.setElement(0, 1);
        v1.setElement(1, 2);
        v1.add(v4);
        Assert.assertEquals(0, v1.getElement(0), 1.0e-12);
        Assert.assertEquals(0, v1.getElement(1), 1.0e-12);
        v1.setElement(0, 1);
        v1.setElement(1, 2);
        v2.setElement(0, -1);
        v2.setElement(1, -2);
        v1.add(v2);
        Assert.assertEquals(0, v1.getElement(0), 1.0e-12);
        Assert.assertEquals(0, v1.getElement(1), 1.0e-12);
    }
}