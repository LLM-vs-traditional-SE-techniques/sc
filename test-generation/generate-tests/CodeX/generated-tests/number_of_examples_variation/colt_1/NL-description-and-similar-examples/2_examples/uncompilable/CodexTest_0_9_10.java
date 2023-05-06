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


public class CodexTest_0_9_10 { 
  @Test
    public void testDoubleAssignVector() {
		DoubleMatrix2D A = new DenseDoubleMatrix2D(new double[][] {
			{ 1.0, 2.0, 3.0 },
			{ 4.0, 5.0, 6.0 },
			{ 7.0, 8.0, 9.0 },
		});
		DoubleMatrix1D x = new DenseDoubleMatrix1D(new double[] { 1.0, 2.0, 3.0 });
		DoubleMatrix2D B = A.assign(A);
		assertEquals("A does not change", A, B);
		DoubleMatrix2D C1 = A.assign(B);
		assertEquals("A does not change", A, C1);
		DoubleMatrix2D C2 = B.assign(A);
		assertEquals("A does not change", A, C2);
		DoubleMatrix2D D1 = A.assign(A.vectorize());
		assertEquals("A does not change", new DenseDoubleMatrix2D(A.vectorize().toArray()), D1);
		DoubleMatrix2D D2 = A.vectorize().assign(A);
		assertEquals("
}