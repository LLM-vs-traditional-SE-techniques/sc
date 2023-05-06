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


public class CodexTest_0_7_5 { 
  @Test
  public static void doubleTest30() {
		double[] data={1,2,3,4,5,6};
		double[][] arrMatrix = 
		{ 
			{ 1, 2, 3, 4, 5, 6},
			{ 2, 3, 4, 5, 6, 7}
		};
		DoubleFactory2D f = DoubleFactory2D.dense;
		DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
		DoubleMatrix2D matrix = f.make(arrMatrix);
		DoubleMatrix1D res = vector.like(matrix.rows());
}