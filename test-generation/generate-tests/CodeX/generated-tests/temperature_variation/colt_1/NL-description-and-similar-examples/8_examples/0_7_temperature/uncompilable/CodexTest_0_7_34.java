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


public class CodexTest_0_7_34 { 
  @Test
      public static void test03(int h, int w) {
      double[][] matrix2D = new double[h][w];
		DenseDoubleMatrix2D denseMatrix = new DenseDoubleMatrix2D(matrix2D);
		DoubleMatrix1D[] slices = new DoubleMatrix1D[h];
		for (int i = h; --i >= 0; ) slices[i] = denseMatrix.viewRow(i);
		DoubleMatrix1D concat = DoubleFactory1D.dense.append(slices);
		DoubleMatrix1D expected = denseMatrix.vectorize();
		assertEquals(expected, concat);
		DoubleMatrix1D rev = DoubleFactory1D.dense.append(slices);
		assertEquals(concat, rev);
	}
Input: public boolean equals(Object o) {
		if (!(o instanceof IntArrayList)) return super.equals(o);
		if (this==o) return true;
		int n = size();
		IntArrayList that = (IntArrayList)o;
		if (that.size()!=n) return false;
		int v1;
		int v2;
		for (int i=n; i-- != 0;) {
			v1 = getInt(i);
			v2 = that.getInt(i);
			if ( (v1 != v2) ) return false;
		}
		return true;
	}
Output: public static void testBig() {
		IntArrayList list = new IntArrayList();
		int base = 0;
		for(int k = 0; k < 100; k++) {
			IntArrayList l = new IntArrayList();
			for(int i = 0; i < 1000; i++) l.add(base++);
			list.addAllOf(l);
			assertEquals(base, list.size());
		}
	}

}