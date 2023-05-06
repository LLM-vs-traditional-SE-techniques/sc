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


public class CodexTest_0_5_57 { 
  @Test
  public void testAssign() {
    DoubleMatrix1D matrix = new DenseDoubleMatrix1D(3);
    matrix.setQuick(0, 1);
    matrix.setQuick(1, 2);
    matrix.setQuick(2, 3);
    DoubleMatrix1D matrix2 = new DenseDoubleMatrix1D(3);
    matrix2.setQuick(0, 4);
    matrix2.setQuick(1, 5);
    matrix2.setQuick(2, 6);
    matrix.assign(matrix2);
    assertEquals(matrix.get(0), 4, 0);
    assertEquals(matrix.get(1), 5, 0);
    assertEquals(matrix.get(2), 6, 0);
  }
}