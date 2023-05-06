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


public class CodexTest_0_8_75 { 
  @Test
  public  void testDoubleVectorAssign_DenseDoubleVector_DenseDoubleVector() {
		double[] data = new double[]{5.5, 10.5, 20.5};
		DenseDoubleVector v1 = new DenseDoubleVector(data);
		DenseDoubleVector v2 = new DenseDoubleVector(data.length);
		assertEquals("should set the length", v1.getLength(), v2.getLength());
		v2.assign(v1);
		for (int i = 0; i < v2.getLength(); i++) {
			assertEquals("should set the element", v1.get(i), v2.get(i));
		}
	}
}