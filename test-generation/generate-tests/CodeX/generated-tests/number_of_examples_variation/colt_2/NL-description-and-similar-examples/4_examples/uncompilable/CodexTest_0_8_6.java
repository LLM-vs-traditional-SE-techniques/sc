import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
  public static void doubleTest27() {
			double[][] arrMatrix1 = 
			{ 
				{ 1, 2, 3, 4, 5, 6}
			};
			double[] data={1,2,3,4,5,6};
			DoubleFactory2D f = DoubleFactory2D.dense;
			DoubleFactory1D f1 = DoubleFactory1D.dense;
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			DoubleMatrix2D matrix1 = f.make(arrMatrix1);
			DoubleMatrix2D matrix2 = vector.like2D(matrix1.rows(),vector.size());
			matrix1.zMult(vector,matrix2);
			System.out.println(matrix2);
		}
Input: public static boolean isNullOrEmpty(String value)
		{
			return (value == null) || (value.length() == 0);
		}
Output: public void isNullOrEmptyTest() {
}