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


public class CodexTest_0_7_74 { 
  @Test
   public void testAssign() {
		DoubleMatrix1D row = F.viewRow(A, 0);
		row.assign(B);
		assertEquals("row", F.viewRow(DoubleFactory2D.dense.make(new double[][] { { 4, 5, 6 } }), 0), row);
		DoubleMatrix1D col = F.viewColumn(A, 1);
		col.assign(B);
		assertEquals("col", F.viewColumn(DoubleFactory2D.dense
				.make(new double[][] { { 0, 5, 0 }, { 1, 6, 0 }, { 2, 7, 0 } }), 1), col);
	}

}