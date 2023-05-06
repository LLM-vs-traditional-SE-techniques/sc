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


public class CodexTest_0_5_48 { 
  @Test
    public void testZMult() {
		DoubleMatrix2D m = DoubleFactory2D.dense.make(2, 3);
		DoubleMatrix2D n = DoubleFactory2D.dense.make(3, 2);
		m.assign(1);
		n.assign(1);
		DoubleMatrix2D p = m.like2D(2, 2);
		m.zMult(n, p);
		assertEquals(3.0, p.getQuick(0, 0), 1e-14);
		assertEquals(3.0, p.getQuick(0, 1), 1e-14);
		assertEquals(3.0, p.getQuick(1, 0), 1e-14);
		assertEquals(3.0, p.getQuick(1, 1), 1e-14);
	}
}