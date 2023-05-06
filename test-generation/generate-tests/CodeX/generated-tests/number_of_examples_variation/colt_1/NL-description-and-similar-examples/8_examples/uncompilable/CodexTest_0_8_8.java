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


public class CodexTest_0_8_8 { 
  @Test
   public void testConstructors() {
		double[] vector = new double[]{1, 2, 3, 4, 5, 6};
		// test constructor and get(int)
		DoubleMatrix1D m = new DenseDoubleMatrix1D(vector);
		for (int i = 0; i < m.size(); i++) {
			assertEquals(vector[i], m.get(i), TOL);
		}
		// test constructor, get(int) and set(int, double)
		m = new DenseDoubleMatrix1D(vector, 1, 3);
		for (int i = 1; i < 4; i++) {
			assertEquals(vector[i], m.get(i - 1), TOL);
		}
		m.set(1, 2.0);
		assertEquals(2.0, m.get(1), TOL);
		// test constructor and viewRow(int)
		DoubleMatrix2D m2 = new DenseDoubleMatrix2D(vector, 3, 2);
		m = m2.viewRow(1);
		for (int i = 3; i < 5; i++) {
			assertEquals(vector[i], m.get(i - 3), TOL);
		}
	}

}