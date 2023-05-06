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


public class CodexTest_0_8_6 { 
  @Test
    public void testGetRowMatrix() {
        double[][] A = { { 0, 1, 2 }, { 1, 0, 1 }, { 2, 1, 0 } };
        double[][] B = { { 0, 1, 2, }, { -1, 0, 0 } };
        double[][] C = { { 1, 0, 0, }, { 0, 1, 0 }, { 0, 0, 1 } };
        DoubleMatrix2D m = DoubleFactory2D.dense.compose(A, B, C);
        DoubleMatrix2D[] parts = m.getRowMatrix();
        assertEquals(3, parts.length);
        assertEquals(5, parts[0].columns());
        assertEquals(A[0][0], parts[0].getQuick(0, 0), TOL);
        assertEquals(A[0][1], parts[0].getQuick(0, 1), TOL);
        assertEquals(A[0][2], parts[0].getQuick(0, 2), TOL);
        assertEquals(B[0][0], parts[0].getQuick(0, 3), TOL);
        assertEquals(B[0][1], parts[0].getQuick(0, 4), TOL);
}