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


public class CodexTest_0_9_58 { 
  @Test
    public void testLike4D() {
		DoubleFactory4D factory4D = DoubleFactory4D.dense;
		DoubleMatrix4D matrix = factory4D.make(2, 2, 2, 2);
		DoubleMatrix2D matrix2D = matrix.viewDice().like2D(3, 3);
		assertTrue(matrix2D.equals(new DenseDoubleMatrix2D(3, 3)));
		int m = 7; int n = 5;
		matrix2D = matrix.viewDice().like2D(m, n);
		assertTrue(matrix2D.equals(new DenseDoubleMatrix2D(m, n)));
	}
Input: public void testLike4D() {
		DoubleFactory4D factory4D = DoubleFactory4D.dense;
		DoubleMatrix4D matrix = factory4D.make(2, 2, 2, 2);
		DoubleMatrix2D matrix2D = matrix.viewDice().like2D(3, 3);
		assertTrue(matrix2D.equals(new DenseDoubleMatrix2D(3, 3)));
		int m = 7; int n = 5;
		matrix2D = matr
}