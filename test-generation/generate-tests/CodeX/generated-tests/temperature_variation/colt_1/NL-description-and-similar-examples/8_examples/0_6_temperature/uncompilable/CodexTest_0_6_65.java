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


public class CodexTest_0_6_65 { 
  @Test
  public void testAssignDoubleFunction() {
    double[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    DoubleMatrix2D A = new DenseDoubleMatrix2D(4, 3, values);
    DoubleMatrix1D x = new DenseDoubleMatrix1D(3);
    DoubleMatrix1D y = new DenseDoubleMatrix1D(4);
    DoubleMatrix1D z = new DenseDoubleMatrix1D(4);
    A.viewColumn(2).assign(x);
    A.viewColumn(1).assign(y, DoubleFunctions.plus);
    A.viewColumn(0).assign(z, DoubleFunctions.mult);
    for (int i = 0; i < A.rows(); i++) {
      assertEquals(x.get(2), A.get(i, 2), TOL);
      assertEquals(y.get(i) + z.get(i), A.get(i, 1), TOL);
      assertEquals(z.get(i), A.get(i, 0), TOL);
    }
  }
}