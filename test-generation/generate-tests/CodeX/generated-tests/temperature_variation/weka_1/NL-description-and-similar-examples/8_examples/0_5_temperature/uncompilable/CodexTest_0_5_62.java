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


public class CodexTest_0_5_62 { 
  @Test
  public static void doubleTest25() {
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix2D matrix2 = f.make(arrMatrix);
			DoubleMatrix2D res = matrix.like(matrix.rows(),matrix.columns());
}