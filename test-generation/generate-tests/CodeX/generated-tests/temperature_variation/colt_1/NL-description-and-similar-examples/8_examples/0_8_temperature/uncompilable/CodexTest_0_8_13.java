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


public class CodexTest_0_8_13 { 
  @Test
    public static void doubleTest25() {
		double[] data={1,2,3};
		double[] data1={1,2,3};
		double[] data2={1,2,3};
		double[][] arrMatrix = 
		{ 
			{ 1, 2, 3},
			{ 2, 3, 4},
			{ 3, 4, 5}
		};
		DoubleFactory2D f = DoubleFactory2D.dense;
		DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
		DoubleMatrix1D vector1 = new DenseDoubleMatrix1D(data1);
		DoubleMatrix2D matrix = f.make(arrMatrix);
		DoubleMatrix1D res = vector.like(matrix.rows());
		DoubleMatrix1D res1 = vector1.like(matrix.rows());
}