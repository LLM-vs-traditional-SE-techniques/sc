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


public class CodexTest_0_9_6 { 
  @Test
    public void testSortReal() {
			double[] sorted = new double[]
				{-8.59, -7.53, -6.89, -5.31, -4.01, -3.32, -2.49, 0.61, 1.37, 1.85,
				 2.72, 3.35, 3.7, 3.92, 4.7, 4.84, 5.0, 8.3, 8.9, 9.28};
			double[] unsorted = new double[]
				{2.72, -5.31, 8.9, 3.92, -8.59, 3.7, 9.28, -4.01, -6.89, -7.53,
				 0.61, -2.49, -3.32, 4.84, 1.85, 8.3, 5.0, 1.37, 4.7, 3.35};
			DoubleMatrix1D sortedv = new DenseDoubleMatrix1D(sorted);
		sortedv.assign(unsorted);;
		sortedv.sort();
		for (int i = 0; i < sorted.length; i++)
			assertEquals(sorted[i], sortedv.get(i), 1e-15);
		}
}