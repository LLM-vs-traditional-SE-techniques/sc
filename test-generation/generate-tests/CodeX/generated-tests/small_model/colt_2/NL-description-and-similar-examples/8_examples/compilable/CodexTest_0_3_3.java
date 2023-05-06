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


public class CodexTest_0_3_3 { 
  @Test
  public void testLike2D() {
    double[][] data = new double[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    DoubleMatrix2D matrix = new DenseDoubleMatrix2D(data);
    assertEquals(2, matrix.rows());
    assertEquals(3, matrix.columns());
    assertEquals(1, matrix.get(0, 0));
    assertEquals(2, matrix.get(0, 1));
    assertEquals(3, matrix.get(0, 2));
    assertEquals(4, matrix.get(1, 0));
    assertEquals(5, matrix.get(1, 1));
    assertEquals(6, matrix.get(1, 2));
  }
}