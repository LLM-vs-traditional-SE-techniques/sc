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


public class CodexTest_0_9_10 { 
  @Test
    -- Test for the method DoubleMatrix2D cern.colt.matrix.doublealgo.Sorting.sort(DoubleMatrix2D, IntComparator) 
	public void testSortDoubleMatrix2DIntComparator2() {
    	int rows = 0, columns = 0;
    	DoubleMatrix2D a = cern.colt.matrix.doublealgo.Sorting.make(rows, columns, 0);
    	IntComparator compare = null;
    	DoubleMatrix2D b = cern.colt.matrix.doublealgo.Sorting.sort(a,compare);
    	assertEquals( rows*columns, b.cardinality());
    }
}