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


public class CodexTest_0_5_78 { 
  @Test
  public void testAssign() {
    DoubleMatrix1D x = new DenseDoubleMatrix1D(3);
    DoubleMatrix1D y = new DenseDoubleMatrix1D(3);
    x.assign(y);
    assertEquals(0.0, x.get(0));
    assertEquals(0.0, x.get(1));
    assertEquals(0.0, x.get(2));
    y.set(1, 3);
    x.assign(y);
    assertEquals(0.0, x.get(0));
    assertEquals(3.0, x.get(1));
    assertEquals(0.0, x.get(2));
  }
}