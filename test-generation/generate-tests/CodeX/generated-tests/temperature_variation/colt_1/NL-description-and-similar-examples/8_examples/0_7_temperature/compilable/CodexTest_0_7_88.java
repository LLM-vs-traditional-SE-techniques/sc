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


public class CodexTest_0_7_88 { 
    @Test
	public void testAssignDoubleArrayArray() {
		double[] data = {1.0, 2.0, 3.0, 4.0};
		DoubleMatrix1D v = new DenseDoubleMatrix1D(data);
		double[] d = new double[2];
		d[0] = 5.0;
		d[1] = 6.0;
		DoubleMatrix1D w = new DenseDoubleMatrix1D(d);
		v.assign(w);
		assertEquals(5.0, v.get(1), 0.0);
		assertEquals(6.0, v.get(2), 0.0);
	}
}