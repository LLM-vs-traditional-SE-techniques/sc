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


public class CodexTest_0_4_3 { 
  @Test
  public void testAssign() {
    DoubleMatrix1D a = new DenseDoubleMatrix1D(new double[] {1, 2, 3, 4, 5});
    DoubleMatrix1D b = new DenseDoubleMatrix1D(new double[] {10, 20, 30, 40, 50});
    DoubleMatrix1D c = new DenseDoubleMatrix1D(new double[] {100, 200, 300, 400, 500});
    a.assign(b);
    assertEquals("a=b", b, a);
    a.assign(c);
    assertEquals("a=c", c, a);
  }
}