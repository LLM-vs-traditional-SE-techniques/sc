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


public class CodexTest_0_6_30 { 
  @Test
    public void testAssignDoubleArray() {
		double[] values = new double[3];
		for (int i=0; i<values.length; ++i) {
			values[i] = i;
		}
		DoubleMatrix1D matrix1 = new DenseDoubleMatrix1D(values);
		DoubleMatrix1D matrix2 = new DenseDoubleMatrix1D(values.length);
		matrix2.assign(values);
		for (int i=0; i<values.length; ++i) {
			assertEquals(matrix1.get(i), values[i]);
			assertEquals(matrix2.get(i), values[i]);
		}
	}
}