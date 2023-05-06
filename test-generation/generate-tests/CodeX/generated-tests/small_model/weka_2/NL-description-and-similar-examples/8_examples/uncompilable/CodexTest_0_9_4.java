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


public class CodexTest_0_9_4 { 
  @Test
    public void testNumericAttribute() 
        throws Exception {
        Instance newInst = null;
        double[] data = { 0.0, 1.0, 2.0, 4.0, 6.0, 8.0, 9.0, 
	                10.0};
        double[][] arrMatrix = { data };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix1D vector = f.make(arrMatrix);
       
}