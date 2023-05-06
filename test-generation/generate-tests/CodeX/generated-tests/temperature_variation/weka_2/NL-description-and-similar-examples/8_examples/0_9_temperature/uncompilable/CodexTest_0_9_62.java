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


public class CodexTest_0_9_62 { 
  @Test
    public static void doubleTest23() {
			double[][] arrMatrix1 = 
			{ 
				{ 3, 2, 2},
				{ 2, 3, -2}
			};
			double[][] arrMatrix2 = 
			{ 
				{ 2, 2},
				{ -2, 2},
				{ 2, -2}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			double[] values = {0,1};
			DoubleMatrix2D Matrix1 = f.make(arrMatrix1);
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(values);
			DoubleMatrix2D Matrix2 = f.make(arrMatrix2);
}