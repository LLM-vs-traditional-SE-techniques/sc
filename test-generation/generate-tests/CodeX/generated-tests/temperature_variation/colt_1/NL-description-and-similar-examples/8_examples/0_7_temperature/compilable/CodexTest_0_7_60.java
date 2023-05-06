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


public class CodexTest_0_7_60 { 
  @Test
  public static void testAssignDoubleMatrix1D() {
			double[] data1 = {1, 2, 3};
			double[] data2 = {4, 5, 6};
			DoubleMatrix1D v1 = new DenseDoubleMatrix1D(data1);
			assertEquals("v1.size() != 3", 3, v1.size());
			DoubleMatrix1D v2 = new DenseDoubleMatrix1D(data2);
			assertEquals("v2.size() != 3", 3, v2.size());
			v1.assign(v2);
			for (int i = 0; i < v1.size(); i++)
				assertEquals(data2[i], v1.get(i), 1e-10);
		}
}