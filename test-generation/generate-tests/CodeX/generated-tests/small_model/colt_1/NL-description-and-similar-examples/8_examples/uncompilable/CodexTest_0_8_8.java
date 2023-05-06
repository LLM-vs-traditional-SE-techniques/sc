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
  public void testAll() {
    AlgVector<Number> m = new AlgVector<Number>(new int[] {4}, new double[] {0});
    assertEquals(4, m.size());
    m.set(0, 3);
    assertEquals(3, m.get(0).intValue());
    assertEquals(3.0, m.get(0).doubleValue(), 0.0);
    assertEquals(Double.valueOf(3.0), m.get(0));
    m.set(0, 5.5);
    assertEquals(5.5, m.get(0).doubleValue(), 0.0);
    m = new AlgVector<Number>(new int[] {1}, new double[] {3.5});
    assertEquals(1, m.get(0).doubleValue(), 0.0);
    int[] target = {0
}