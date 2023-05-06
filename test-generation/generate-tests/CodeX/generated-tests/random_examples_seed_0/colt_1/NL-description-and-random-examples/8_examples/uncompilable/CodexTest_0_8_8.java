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


public class CodexTest_0_8_8 { 
  @Test
  //this test contains if statement
  public void testAssignDoubleMatrix1D3() {
        DenseDoubleMatrix1D dense = new DenseDoubleMatrix1D(SIZE);
        DoubleMatrix1D other = dense.viewPart(0, SIZE - 1);
        DoubleMatrix1D copy = new DenseDoubleMatrix1D(SIZE);
        for (int i = 0; i < SIZE; i++) {
            dense.setQuick(i, i + 1);
            copy.setQuick(i, i + 1);
        }
        other.assign(dense);
        for (int i = 0; i < SIZE - 1; i++) {
            assertEquals(2 * (i + 1), other.getQuick(i), TOL);
        }
        other.assign(dense.viewPart(0, SIZE - 2).viewColumnFlip());
        for (int i = 0; i < SIZE - 1; i++) {
            assertEquals(2 * (SIZE - i), other.getQuick(i), TOL);
        }
}