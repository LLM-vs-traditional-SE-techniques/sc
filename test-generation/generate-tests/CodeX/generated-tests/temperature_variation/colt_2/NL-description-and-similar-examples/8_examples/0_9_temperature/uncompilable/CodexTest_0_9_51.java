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


public class CodexTest_0_9_51 { 
  @Test
    public void testElementSums() {
		double[][] d = 
		{
			{ 2, 5, 3},
			{ 7, 1, 9}	
		};
        DoubleMatrix2D D = DenseDoubleAlgebra.DEFAULT.make(d);		
        double[] columnSums = D.zSum(0,2);
        double[] rowSums = D.zSum(1,2);
        double[] expectedColumnSums = {9, 6, 12};
        double[] expectedRowSums = {10, 17};
        assertEquals(2, columnSums.length);
        assertEquals(2, rowSums.length);		
        assertTrue(Arrays.equals(expectedColumnSums, columnSums));
        assertTrue(Arrays.equals(expectedRowSums, rowSums));
    }
}