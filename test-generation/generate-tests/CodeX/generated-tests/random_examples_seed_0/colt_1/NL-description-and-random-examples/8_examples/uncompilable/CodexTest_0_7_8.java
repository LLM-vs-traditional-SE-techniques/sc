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


public class CodexTest_0_7_8 { 
    @Test
	public void testAssignDenseDoubleMatrix1D() {
		DenseDoubleMatrix1D a = new DenseDoubleMatrix1D(3).assign(new double[]{1.1,2.2,3.3});
		DenseDoubleMatrix1D b = new DenseDoubleMatrix1D(3);
		b.assign(a);
		assertArrayEquals(a.elements(), b.elements(), 0.0);
	}
Input: public void testAssignDenseDoubleMatrix1D() {
		DenseDoubleMatrix1D a = new DenseDoubleMatrix1D(3).assign(new double[]{1.1,2.2,3.3});
		DenseDoubleMatrix1D b = new DenseDoubleMatrix1D(3);
		b.assign(a);
		assertArrayEquals(a.elements(), b.elements(), 0.0);
	}
Output:
    @Test(expected=IndexOutOfBoundsException.class)
	public void testAssignDenseDoubleMatrix1DException() {
		new DenseDoubleMatrix1D(3).assign(new double[]{1.1,2.2,3.3,4.4});
	}
Input: @Test(expected=IndexOutOfBoundsException.class)
	public void testAssignDenseDoubleMatrix1DException() {
		new DenseDoubleMatrix1D(3).assign(new double[]{1.1,2.2,3.3,4.4});
	}
Output:
    @Test
	public void testAssignDenseDoubleMatrix1D() {
		DenseDoubleMatrix1D a = new DenseDoubleMatrix1D(3).assign(new double[]{1.1,2.2,3.3});
		DenseDoubleMatrix1D b = new DenseDoubleMatrix1D(3);
		b.assign(a);
		assertArrayEquals(a.elements(), b.elements(), 0.0);
	}
Input: @Test
	public void test
}