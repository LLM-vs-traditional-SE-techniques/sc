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


public class CodexTest_0_6_18 { 
  @Test
    /**
     * @testng.test groups = "unit"
     */
	public void testAssign() {
		DoubleFactory1D factory = DoubleFactory1D.dense;
		DoubleMatrix1D v1 = factory.make(new double[] { 1, 2, 3, 4 });
		DoubleMatrix1D v2 = factory.make(new double[] { 4, 3, 2, 1 });
		DoubleMatrix1D v3 = factory.make(new double[] { 1, 1, 1, 1 });
		v3.assign(v2);
		assertEquals(v3.get(0), 4, 0);
		assertEquals(v3.get(1), 3, 0);
		assertEquals(v3.get(2), 2, 0);
		assertEquals(v3.get(3), 1, 0);
		v1.assign(v2, Functions.plus);
		assertEquals(v1.get(0), 5, 0);
		assertEquals(v1.get(1), 5, 0);
		assertEquals(v1.get(2), 5, 0);
		assertEquals(v1.get(3), 5, 0);
		v1.assign(v2, Functions.div);
		assertEquals(v1.get(0), 0.25, 0);
		assertEquals(v1.get(1), 0.6666666666666666, 0);
		assertEquals(v1.get(2), 1.5, 0);
		assertEquals(v1.get(3), 4, 0);
	}

}