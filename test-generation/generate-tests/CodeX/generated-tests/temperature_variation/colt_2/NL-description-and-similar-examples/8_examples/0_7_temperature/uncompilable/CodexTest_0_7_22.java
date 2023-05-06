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


public class CodexTest_0_7_22 { 
  @Test
    public void testLike2DIntInt() {
		DoubleFactory2D f = DoubleFactory2D.dense;
		int rows = 2;
		int columns = 3;
		double[][] data = { { 1, 2, 3 }, { 4, 5, 6 } };
		DoubleMatrix2D expected = f.make(data);
		DoubleMatrix2D actual = expected.like2D(rows, columns);
		assertEquals(expected.rows(), actual.rows());
		assertEquals(expected.columns(), actual.columns());
	}

}