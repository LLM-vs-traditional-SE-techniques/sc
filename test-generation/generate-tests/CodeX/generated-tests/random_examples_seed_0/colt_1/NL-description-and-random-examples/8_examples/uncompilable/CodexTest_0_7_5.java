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
    public void testAssignDoubleMatrix1D() {
		double[] values = {3,4,5,6};
		DenseDoubleMatrix1D other = new DenseDoubleMatrix1D(values);
		other.set(0, values[0] + 1);
		matrix.assign(other);
		for (int i = 0; i < values.length; i++) {
			assertEquals(matrix.getQuick(i), values[i] + 1, TOL);
		}
		values = new double[]{3,4,5,6};
		other = new DenseDoubleMatrix1D(values);
		other.set(1, values[1] + 1);
		matrix.assign(other);
		for (int i = 0; i < values.length; i++) {
			assertEquals(matrix.getQuick(i), values[i] + 1, TOL);
		}
		values = new double[]{3,4,5,6};
		other = new DenseDoubleMatrix1D(values);
		other.set(2, values[2] + 1);
		matrix.assign(other);
		for (int i = 0; i < values.length; i++) {
			assertEquals(matrix.getQuick(i), values[i] + 1, TOL);
		}
		values = new double[]{3,4,5,6};
		other = new DenseDoubleMatrix1D(values);
		other.set(3, values[3] + 1);
		matrix.assign(other);
		for (int i = 0; i < values.length; i++) {
			assertEquals(matrix.getQuick(i), values[i] + 1, TOL);
		}
	}
}