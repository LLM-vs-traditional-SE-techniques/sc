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


public class CodexTest_0_8_9 { 
  @Test
    public void testAdd() {
        SparseDoubleMatrix2D A = new SparseDoubleMatrix2D(2,2);
        SparseDoubleMatrix2D B = new SparseDoubleMatrix2D(2,2);
        DoubleMatrix2D C = A.assign(B);
        assertEquals(A.getQuick(0,0),0,0);
        assertEquals(A.getQuick(0,1),0,0);
        assertEquals(A.getQuick(1,0),0,0);
        assertEquals(A.getQuick(1,1),0,0);
        C.assign(new SparseDoubleMatrix2D(2,2,new double[] {11,12,21,22},new int[] {0,1},new int[] {0,0}));
        assertEquals(C.getQuick(0,0),11,0);
        assertEquals(C.getQuick(0,1),12,0);
        assertEquals(C.getQuick(1,0),21,0);
        assertEquals(C.getQuick(1,1),22,0);
        A = new SparseDoubleMatrix2D(new double[][] {{-1,+2},{0,0}});
        B = new SparseDoubleMatrix2D(new double[][] {{+2,-1},{0,0}});
        C = A.assign(B);
        assertEquals(A.getQuick(0,0),-1,0);
        assertEquals(A.getQuick(0,1),2,0);
        assertEquals(A.getQuick(1,0),0,0);
        assertEquals(A.getQuick(1,1),0,0);
        C.assign(new SparseDoubleMatrix2D(new double[][] {{1,2},{3,4}}));
        assertEquals(C.getQuick(0,0),1,0);
        assertEquals(C.getQuick(0,1),2,0);
        assertEquals(C.getQuick(1,0),3,0
}