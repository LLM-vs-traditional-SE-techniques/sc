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
  public static void testTimes() {
    double[] data = {1, 2, 3, 4};
    double[][] data2 = {{1, 2, 3, 4}};
    DoubleFactory2D factory2D = DoubleFactory2D.dense;
    DoubleMatrix1D v = new DenseDoubleMatrix1D(data);
    DoubleMatrix2D A = factory2D.make(data2);
}