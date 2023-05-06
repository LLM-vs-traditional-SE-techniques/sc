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


public class CodexTest_0_9_1 { 
  @Test
    [Test public void testRelax() {
			double[] data = {1.3,2.1,3.2,4.5,5.0,6.4,7.4,8.1,8.2};
			DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
			double[][] arrMatrix = 
		{ 
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9},
			{ 2, 3, 4, 5, 6, 7, 8, 9, 1},
			{ 3, 4, 5, 6, 7, 8, 9, 1, 2},
			{ 4, 5, 6, 7, 8, 9, 1, 2, 3},
			{ 5, 6, 7, 8, 9, 1, 2, 3, 4},
			{ 6, 7, 8, 9, 1, 2, 3, 4, 5},
			{ 7, 8, 9, 1, 2, 3, 4, 5, 6},
			{ 8, 9, 1, 2, 3, 4, 5, 6, 7},
			{ 9, 1, 2, 3, 4, 5, 6, 7, 8},

}