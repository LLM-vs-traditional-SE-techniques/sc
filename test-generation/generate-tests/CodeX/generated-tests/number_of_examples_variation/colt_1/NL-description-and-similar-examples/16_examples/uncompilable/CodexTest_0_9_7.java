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


public class CodexTest_0_9_7 { 
  @Test
    public void testIsDiagonal() {
        double[][] dmData = new double[][]{
            {1,0,0,0},
            {0,1,0,0},
            {0,0,1,0},
            {0,0,0,1}};
        double[][] denseData = new double[][]{
            {1,2,3,4},
            {0,5,6,0},
            {0,0,7,0},
            {0,0,0,8}};
        
        DenseDoubleMatrix2D ddm = DenseDoubleMatrix2D.wrap(dmData);
        DenseDoubleMatrix2D dd  = DenseDoubleMatrix2D.wrap(denseData);
		assertEquals(true, ddm.isDiagonal());
		assertEquals(false, dd.isDiagonal());
	}
}