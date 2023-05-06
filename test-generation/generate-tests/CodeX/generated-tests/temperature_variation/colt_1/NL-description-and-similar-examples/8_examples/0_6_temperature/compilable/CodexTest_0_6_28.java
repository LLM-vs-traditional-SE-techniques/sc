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


public class CodexTest_0_6_28 { 
  @Test
  public void testAssign() {
      DoubleMatrix1D x = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5, 6 });
      DoubleMatrix1D y = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5, 6 });
      DoubleMatrix1D z = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5, 6 });
      x = x.viewPart(2, 3).assign(new DenseDoubleMatrix1D(new double[] { 0, 1, 1 }));
      DoubleMatrix1D expected = new DenseDoubleMatrix1D(new double[] { 1, 2, 0, 1, 1, 6 });
      assertEquals(expected, x);
      y = y.viewPart(2, 3).assign(new DenseDoubleMatrix1D(new double[] { 0, 1, 1, 1, 1 }));
      expected = new DenseDoubleMatrix1D(new double[] { 1, 2, 0, 1, 1, 6 });
      assertEquals(expected, y);
      z = z.viewPart(2, 3).assign(new DenseDoubleMatrix1D(new double[] { 0, 1, 1, 1, 1, 1, 1, 1 }));
      expected = new DenseDoubleMatrix1D(new double[] { 1, 2, 0, 1, 1, 6 });
      assertEquals(expected, z);
  }
}