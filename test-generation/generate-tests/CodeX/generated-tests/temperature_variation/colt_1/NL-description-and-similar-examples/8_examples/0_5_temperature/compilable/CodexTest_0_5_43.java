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


public class CodexTest_0_5_43 { 
  @Test
  public void testSparseDoubleMatrix2D() {
    double[][] values = {
      {1, 0, 0},
      {0, 2, 0},
      {0, 0, 3}
    };
    DoubleMatrix2D A = new SparseDoubleMatrix2D(values);
    DoubleMatrix2D B = A.copy();
    assertEquals(A, B);
    assertTrue(B instanceof SparseDoubleMatrix2D);
    DoubleMatrix2D C = new SparseDoubleMatrix2D(values);
    assertEquals(A, C);
    assertTrue(C instanceof SparseDoubleMatrix2D);
    DoubleMatrix2D D = new SparseDoubleMatrix2D(3, 3);
    D.assign(A);
    assertEquals(A, D);
    assertTrue(D instanceof SparseDoubleMatrix2D);
    DoubleMatrix2D E = new SparseDoubleMatrix2D(3, 3);
    E.assign(0);
    E.assign(A);
    assertEquals(A, E);
    assertTrue(E instanceof SparseDoubleMatrix2D);
    DoubleMatrix2D F = new SparseDoubleMatrix2D(3, 3);
    F.assign(0);
    F.assign(A);
    assertEquals(A, F);
    assertTrue(F instanceof SparseDoubleMatrix2D);
  }
}