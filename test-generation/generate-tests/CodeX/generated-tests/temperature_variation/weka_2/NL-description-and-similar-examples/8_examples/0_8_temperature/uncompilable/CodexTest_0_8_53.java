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


public class CodexTest_0_8_53 { 
  @Test
    public void testNormalizeWeight() {
        AlgVector v = new AlgVector(new double [] {1,2,-3,4,-5,6});
        double sum = 0;
        for (int i = 0; i < v.numElements(); i++) {
            sum += v.getElement(i);
        }
        v.normalizeWeight();
        sum = sum < 0 ? -sum : sum;
        assertEquals("Sum of the elements should be 1", 1, sum, 1e-5);
    }
}