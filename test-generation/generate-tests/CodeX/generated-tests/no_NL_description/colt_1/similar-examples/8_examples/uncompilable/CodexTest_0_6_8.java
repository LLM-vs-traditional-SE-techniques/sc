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


public class CodexTest_0_6_8 { 
  @Test
  public void testAssign() {
		DoubleMatrix1D m = new DenseDoubleMatrix1D(SIZE);
		m.assign(0);
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, m.getQuick(i), TOL);
		}
		m.assign(Functions.plus(m));
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, m.getQuick(i), TOL);
		}
		m.assign(Functions.chain(Functions.mult(2), Functions.plus(3)));
		for (int i = 0; i < SIZE; i++) {
			assertEquals(3, m.getQuick(i), TOL);
		}
		m.assign(new DoubleMatrix1DProcedure() {
			public boolean apply(double element) {
				return element < 3;
			}
		});
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, m.getQuick(i), TOL);
		}
		m.assign(Functions.chain(Functions.mult(SIZE), Functions.plus(1)));
		for (int i = 0; i < SIZE; i++) {
			assertEquals(i + 1, m.getQuick(i), TOL);
		}
		DoubleMatrix1D n = m.viewFlip();
		n.assign(Functions.chain(Functions.mult(2), Functions.plus(3)));
		for (int i = 0; i < SIZE; i++) {
			assertEquals(2 * (SIZE - i) + 3, m.getQuick(i), TOL);
		}
		DoubleMatrix1D o = m.viewPart(5, 10);
		o.assign(Functions.chain(Functions.mult(3), Functions.plus
}