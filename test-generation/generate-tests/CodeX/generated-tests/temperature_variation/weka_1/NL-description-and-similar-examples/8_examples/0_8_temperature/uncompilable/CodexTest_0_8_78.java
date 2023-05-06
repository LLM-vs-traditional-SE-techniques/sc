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


public class CodexTest_0_8_78 { 
  @Test
   public static void doubleTest9(){
			double[] data={1,2,3,4,5,6,7,8,9,10};
			double[][] arrMatrix = 
			{ 
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
				{3,3,3,3,3,3,3,3,3,3},
				{4,4,4,4,4,4,4,4,4,4},
				{5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
				{6, 6, 6, 6, 6, 6, 6, 6, 6, 6},
				{7,7,7,7,7,7,7,7,7,7},
				{8,8,8,8,8,8,8,8,8,8},
				{9,9,9,9,9,9,9,9,9,9},
				{10,10,10,10,10,10,10,10,10,10}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix1D res = new DenseDoubleMatrix1D(matrix.columns());
}