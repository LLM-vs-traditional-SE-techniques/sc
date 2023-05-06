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


public class CodexTest_0_9_52 { 
  @Test
    public void testGetSetZeroOfThreeByThree() {
		DoubleMatrix2D matrix = DoubleFactory2D.dense.make(3, 3);
		BenchmarkMatrix matrix0 = new BenchmarkMatrix(matrix);
		matrix0.setQuick(0, 0, 1.0);
		matrix0.setQuick(0, 1, 2.0);
		matrix0.setQuick(0, 2, 3.0);
		matrix0.setQuick(1, 0, 4.0);
		matrix0.setQuick(1, 1, 5.0);
		matrix0.setQuick(1, 2, 6.0);
		matrix0.setQuick(2, 0, 7.0);
		matrix0.setQuick(2, 1, 8.0);
		matrix0.setQuick(2, 2, 9.0);
}