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


public class CodexTest_0_8_45 { 
  @Test
  public void test_Assign() {
    // TEST FIRST WITH DENSE MATRIXES
    boolean wrongResult = false;
    // test A = A
    mtxA = new DenseDoubleMatrix2D(NROWS, NCOLUMNS);
    mtxA.assign(mtxA);
    for (int ii = 0; ii < NROWS; ii++) {
      for (int jj = 0; jj < NCOLUMNS; jj++) {
        if (mtxA.get(ii, jj) != 0) {
          wrongResult = true;
        }
      }
    }
    if (wrongResult) {
      fail("wrong result with dense double matrix");
    }
    // test A = B
    mtxA = new DenseDoubleMatrix2D(NROWS, NCOLUMNS);
    mtxB = new DenseDoubleMatrix2D(NROWS, NCOLUMNS);
    mtxA.assign(mtxB);
    for (int ii = 0; ii < NROWS; ii++) {
      for (int jj = 0; jj < NCOLUMNS; jj++) {
        if (mtxA.get(ii, jj) != 0) {
          wrongResult = true;
        }
      }
    }
    if (wrongResult) {
      fail("wrong result with dense double matrix");
    }
    // test A = B
    mtxA = new DenseDoubleMatrix2D(NROWS, NCOLUMNS);
    mtxB = new DenseDoubleMatrix2D(NROWS, NCOLUMNS);
    mtxB.assign(new double[]{11., 12., 13., //
        21., 22., 23., //
        31., 32., 33., //
        41., 42., 43.});
    mtxA.assign(mtxB);
    for (int ii = 0; ii < NROWS; ii++) {
      for (int jj = 0; jj < NCOLUMNS; jj++) {
        if (mtxA.get(ii, jj) != mtxB.get(ii
}