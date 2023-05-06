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


public class CodexTest_0_7_3 { 
  @Test
    public void testAssignDoubleMatrix1D() {
		double[] values = {2, 3, 4};
		AlgMatrix m = new AlgMatrix(new double[][]{values});
		AlgVector v = new AlgVector(values);
		AlgVector w = new AlgVector(new double[3]);
		AlgVector res = w.assign(v);
		assertEquals("Wrong result", v, w);
		assertTrue("Wrong object returned", res == w);
		w = new AlgVector(new double[3]);
		res = w.assign(m.viewColumn(0));
		assertEquals("Wrong result", v, w);
		assertTrue("Wrong object returned", res == w);
		// Test the "no shared cells" case
		w = new AlgVector(new double[3], 1, 3);
		res = w.assign(m.viewColumn(0));
		assertEquals("Wrong result", v, w);
		assertTrue("Wrong object returned", res == w);
		// Test the "shared cells" case
		v = new AlgVector(new double[7], 3, 3);
		w =
}