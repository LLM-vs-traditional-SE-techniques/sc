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


public class CodexTest_0_8_7 { 
  @Test
  public static void doubleTest28() {
		double[] data1 = {1,2,3,4,5,6};
		double[][] data2 = 
		{ 
			{ 1, 2, 3, 4, 5, 6},
			{ 2, 3, 4, 5, 6, 7}
		};
		DoubleFactory2D f2 = DoubleFactory2D.dense;
		DoubleMatrix1D vector = new DenseDoubleMatrix1D(data1);
		DoubleMatrix2D matrix1 = f2.make(data2);
		DoubleMatrix2D matrix2 = vector.like2D(matrix1.rows(), vector.size());
}