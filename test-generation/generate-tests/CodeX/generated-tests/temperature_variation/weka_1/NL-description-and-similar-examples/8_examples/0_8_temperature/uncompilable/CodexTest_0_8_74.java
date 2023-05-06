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


public class CodexTest_0_8_74 { 
  @Test
  
  public static void doubleTest29() {
			double[] data={1,2,3,4,5,6};
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			DoubleFactory1D f1 = DoubleFactory1D.dense;
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D vector = f1.make(data);
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix1D res = vector.like(matrix.rows());
}