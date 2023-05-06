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


public class CodexTest_0_8_6 { 
  @Test
    	public static void testElmMult() {
		DenseDoubleMatrix1D a = new DenseDoubleMatrix1D(2);
		a.setQuick(0, 1.0);
		a.setQuick(1, 2.0);
		DenseDoubleMatrix1D b = new DenseDoubleMatrix1D(2);
		b.setQuick(0, 3.0);
		b.setQuick(1, 4.0);
		DenseDoubleMatrix1D r = new DenseDoubleMatrix1D(2);
		r.setQuick(0, 3.0);
		r.setQuick(1, 8.0);
		assertEquals(DoubleMatrix2D.class, a.elmMult(b).getClass());
		assertEquals(r, a.elmMult(b));
	}
}