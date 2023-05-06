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


public class CodexTest_0_6_88 { 
  @Test
        public void testSet_Get_4x4() {
        double[][] data = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        Matrix A = new DenseMatrix(data);
        A.set(0, 0, 100);
        A.set(0, 1, 200);
        A.set(0, 2, 300);
        A.set(0, 3, 400);
        A.set(1, 0, 500);
        A.set(1, 1, 600);
        A.set(1, 2, 700);
        A.set(1, 3, 800);
        A.set(2, 0, 900);
        A.set(2, 1, 1000);
        A.set(2, 2, 1100);
        A.set(2, 3, 1200);
        A.set(3, 0, 1300);
        A.set(3, 1, 1400);
        A.set(3, 2, 1500);
        A.set(3, 3, 1600);
        assertEquals(100, A.get(0, 0), TOL);
        assertEquals(200, A.get(0, 1), TOL);
        assertEquals(300, A.get(0, 2), TOL);
        assertEquals(400, A.get(0, 3), TOL);
        assertEquals(500, A.get(1, 0), TOL);
        assertEquals(600, A.get(1, 1), TOL);
        assertEquals(700, A.get(1, 2), TOL);
        assertEquals(800, A.get(1, 3), TOL);
        assertEquals(900, A.get(2, 0), TOL);
        assertEquals(1000, A.get(2, 1), TOL);
        assertEquals(1100, A.get(2, 2), TOL);
        assertEquals(1200, A.get(2, 3), TOL);
        assertEquals(1300,
}