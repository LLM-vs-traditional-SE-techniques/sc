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


public class CodexTest_0_7_53 { 
  @Test
  public void testGetFirstColumn() {
    DoubleMatrix2D matrix = DoubleFactory2D.dense.make(3, 2);
    matrix.set(0, 0, 1.0);
    matrix.set(1, 0, 2.0);
    matrix.set(2, 0, 3.0);
    matrix.set(0, 1, 4.0);
    matrix.set(1, 1, 5.0);
    matrix.set(2, 1, 6.0);
    DoubleMatrix1D col = matrix.viewColumn(0);
    assertEquals(3, col.size());
    assertEquals(1.0, col.get(0), 0.0);
    assertEquals(2.0, col.get(1), 0.0);
    assertEquals(3.0, col.get(2), 0.0);
  }
}