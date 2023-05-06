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


public class CodexTest_0_7_23 { 
  @Test
    public void testBasic() {
		DoubleMatrix1D x = new DenseDoubleMatrix1D(new double[] { 0, 1, 2 });
		DoubleMatrix1D y = new DenseDoubleMatrix1D(new double[] { 0, Math.E, Math.E * Math.E });
		assertEquals(1.0, x.aggregate(y, Functions.plus, Functions.square), 1.0e-10);
		assertEquals(10.0, x.aggregate(y, Functions.plus, Functions.chain(Functions.square, Functions.identity)), 1.0e-10);
		assertEquals(1.0, x.aggregate(y, Functions.plus, Functions.chain(Functions.square, Functions.square)), 1.0e-10);
	}
}