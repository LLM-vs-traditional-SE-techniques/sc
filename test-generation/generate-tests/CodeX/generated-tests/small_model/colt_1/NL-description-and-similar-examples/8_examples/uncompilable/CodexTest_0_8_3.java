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


public class CodexTest_0_8_3 { 
  @Test
  public static void testCollect() {
			double[] data1 = {1, 4, 9, 16, 25, 36};
		double[] data2 = {2, 5, 10, 17, 26, 37};
			double[] data3 = {3, 6, 11, 18, 27, 38};
			DoubleFactory2D f = DoubleFactory2D.dense;
			int rows = 6;
			// create the matrix
		DoubleMatrix2D matrix1 = f.make(rows, 3, data1);
		DoubleMatrix2D matrix2 = f.make(rows, 3, data2);
		DoubleMatrix2D matrix3 = f.make(rows, 3, data3);
			DoubleMatrix2D matrix = DoubleFactory2D.sparse.rows(2*rows);
		matrix.assign(matrix1, Functions.plus);
}