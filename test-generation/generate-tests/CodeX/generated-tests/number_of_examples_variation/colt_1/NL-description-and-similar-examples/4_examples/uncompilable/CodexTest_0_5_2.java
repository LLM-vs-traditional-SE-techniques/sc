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


public class CodexTest_0_5_2 { 
  @Test
  public void testAssign() {
    double[] data = {1.0, 2.0, 3.0};
    double[] data2 = {4.0, 5.0, 6.0};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = new AlgVector(data2);
    v1.assign(v2);
    assertEquals(v1.getElement(0), 4.0, 1e-10);
    assertEquals(v1.getElement(1), 5.0, 1e-10);
    assertEquals(v1.getElement(2), 6.0, 1e-10);
  }
}