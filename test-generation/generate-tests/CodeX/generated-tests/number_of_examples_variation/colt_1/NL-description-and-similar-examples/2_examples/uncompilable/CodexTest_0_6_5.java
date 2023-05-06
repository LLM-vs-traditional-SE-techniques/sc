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


public class CodexTest_0_6_5 { 
  @Test
   public void testAssignDoubleMatrix1D() {
        double[] values = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		DoubleMatrix1D A = new DenseDoubleMatrix1D(values);
		DoubleMatrix1D B = new DenseDoubleMatrix1D(values);
		B.assign(A);
		assertEquals(A.get(0), B.get(0), TOL);
		assertEquals(A.get(1), B.get(1), TOL);
		assertEquals(A.get(2), B.get(2), TOL);
		assertEquals(A.get(3), B.get(3), TOL);
		assertEquals(A.get(4), B.get(4), TOL);
		assertEquals(A.get(5), B.get(5), TOL);
		assertEquals(A.get(6), B.get(6), TOL);
		assertEquals(A.get(7), B.get(7), TOL);
		assertEquals(A.get(8), B.get(8), TOL);
		assertEquals(A.get(9), B.
}