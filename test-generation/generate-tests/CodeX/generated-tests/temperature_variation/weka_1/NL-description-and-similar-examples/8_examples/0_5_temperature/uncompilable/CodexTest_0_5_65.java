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


public class CodexTest_0_5_65 { 
  @Test
  public static void doubleTest37() {
			double[] data={1,2,3,4,5,6};
			double[] data2={7,8,9,10,11,12};
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			DoubleMatrix1D vector2 = new DenseDoubleMatrix1D(data2);
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix1D res = vector.like(matrix.rows());
			DoubleMatrix1D res2 = vector2.like(matrix.rows());
						matrix.zMult(vector,res);
						matrix.zMult(vector2,res2);
						res.assign(res2,Functions.plus);
					System.out.println(res);
		}
```
}