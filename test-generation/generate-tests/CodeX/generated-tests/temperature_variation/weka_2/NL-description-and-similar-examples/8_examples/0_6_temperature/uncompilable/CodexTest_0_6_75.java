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


public class CodexTest_0_6_75 { 
  @Test
    public void testRandomize() {
        double[] testArray = {0, 0.5, 1, 1.5, 2};
        double[] resultArray = {2, 1.5, 1, 0.5, 0};
        DenseDoubleMatrix1D test = new DenseDoubleMatrix1D(testArray);
        DenseDoubleMatrix1D result = new DenseDoubleMatrix1D(resultArray);
        test.assign(Functions.random);
        assertEquals("test randomize", result, test);
    }
}