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


public class CodexTest_0_7_3 { 
  @Test
  public static void doubleTest29() {
		double[] data1 = {1, 2, 3, 4, 5, 6};
		double[][] arrMatrix1 = 
		{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
		};
		double[] data2 = {1, 2, 3, 4, 5, 6, 7, 8};
		double[][] arrMatrix2 = 
		{ 
				{ 1, 2, 3, 4, 5, 6, 7, 8},
				{ 2, 3, 4, 5, 6, 7, 8, 9}
		};
		DoubleFactory2D f = DoubleFactory2D.dense;
		DoubleMatrix1D vector1 = new DenseDoubleMatrix1D(data1);
		DoubleMatrix1D vector2 = new DenseDoubleMatrix1D(data2);
		DoubleMatrix2D matrix1 = f.make(arrMatrix1);
		DoubleMatrix2D matrix2 = f.make(arrMatrix2);
		DoubleMatrix1D res1 = vector1.like(matrix1.rows());
		DoubleMatrix1D res2 = vector2.like(matrix2.rows());
}