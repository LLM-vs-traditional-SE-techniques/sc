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


public class CodexTest_0_5_7 { 
  @Test
  public void testLike2D() {
    double[][] arrMatrix = 
    { 
      { 1, 2, 3, 4, 5, 6},
      { 2, 3, 4, 5, 6, 7}
    };
    DoubleFactory2D f = DoubleFactory2D.dense;
    DoubleMatrix2D matrix = f.make(arrMatrix);
    assertEquals(2, matrix.rows());
    assertEquals(6, matrix.columns());
    DoubleMatrix2D matrix2 = matrix.like2D(2, 3);
    assertEquals(2, matrix2.rows());
    assertEquals(3, matrix2.columns());
  }
}