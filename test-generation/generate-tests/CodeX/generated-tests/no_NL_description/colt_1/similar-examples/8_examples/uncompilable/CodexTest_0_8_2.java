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


public class CodexTest_0_8_2 { 
  @Test
    public void testAssign() {
		DoubleMatrix2D m = factory5x5.make(new double[][] {
			{ 1,   2,  3,  4,  5 },
			{ -1, -2,  3,  4,  5 },
			{ 1,  -2, -3,  4,  5 },
			{ 1,   2, -3, -4,  5 },
			{ 1,   2,  3, -4, -5 }
		});
		DoubleMatrix1D v = new DenseDoubleMatrix1D(new double[] { 0, 1, 2, 3, 4 });
		assertEquals(m.copy().assign(v, DoubleFunctions.plus).toString(), "[1 3 5 7 9]");
		assertEquals(m.copy().assign(v, DoubleFunctions.minus).toString(), "[1 1 1 1 1]");
		assertEquals(m.copy().assign(v, DoubleFunctions.mult).toString(), "[0 2 6 12 20]");
		assertEquals(m.copy().assign(v, DoubleFunctions.div).toString(), "[0 2 1 1 1]");
		assertEquals(m.copy().assign(v, DoubleFunctions.chain(DoubleFunctions.exp,DoubleFunctions.inv)).toString(), "[1 0.5 0.25 0.16666666 0.125]");
		assertEquals(m.copy().assign(v, DoubleFunctions.chain(DoubleFunctions.exp,DoubleFunctions.chain(DoubleFunctions.sin,DoubleFunctions.inv))).toString(), "[0.5403023058681398 0.8414709848078965 0.9092974268256817 0.1411200080598672 -0.7568024953079282]");
		assertEquals(v.copy().assign(0, DoubleFunctions.minus).toString(), "[-0 -1 -2 -3 -4]");
		assertEquals(v.copy().assign(Double
}