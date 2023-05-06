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


public class CodexTest_0_6_4 { 
  	@Test
	public void testAssign() {
		double[] data = { 1, 2, 3, 4, 5, 6 };
		DoubleMatrix1D matrix = new DenseDoubleMatrix1D(data);
		DoubleMatrix1D matrix2 = new DenseDoubleMatrix1D(data);
		matrix.assign(matrix2);
		assertEquals(matrix2.get(0), matrix.get(0), 1e-12);
		assertEquals(matrix2.get(1), matrix.get(1), 1e-12);
		assertEquals(matrix2.get(2), matrix.get(2), 1e-12);
		assertEquals(matrix2.get(3), matrix.get(3), 1e-12);
		assertEquals(matrix2.get(4), matrix.get(4), 1e-12);
		assertEquals(matrix2.get(5), matrix.get(5), 1e-12);
	}
}