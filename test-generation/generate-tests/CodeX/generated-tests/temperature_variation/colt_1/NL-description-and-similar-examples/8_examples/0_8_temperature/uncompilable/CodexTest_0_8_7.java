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


public class CodexTest_0_8_7 { 
  @Test
  public void testAssignPow() {
		double[] values = {2, 4, 6};
		DoubleFactory2D f = DoubleFactory2D.dense;
		DoubleMatrix1D vector = f.make(values);
		DoubleMatrix1D vector2 = f.make(values);
		vector2.assign(Functions.pow(2));
		assertEquals(vector.getQuick(0), vector2.getQuick(0), 0);
		assertEquals(vector.getQuick(1), vector2.getQuick(1), 0);
		assertEquals(vector.getQuick(2), vector2.getQuick(2), 0);
		vector.assign(vector2, Functions.pow(2));
		assertEquals(vector.getQuick(0), vector2.getQuick(0), 0);
		assertEquals(vector.getQuick(1), vector2.getQuick(1), 0);
		assertEquals(vector.getQuick(2), vector2.getQuick(2), 0);
		vector2.assign(Functions.pow(2));
		vector.assign(vector2, Functions.pow(2));
		assertEquals(vector.getQuick(0), vector2.getQuick(0), 0);
		assertEquals(vector.getQuick(1), vector2.getQuick(1), 0);
		assertEquals(vector.getQuick(2), vector2.getQuick(2), 0);
		vector.assign(Functions.tan(2));
		vector.assign(Functions.pow(vector));
	}
}