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


public class CodexTest_0_5_8 { 
  @Test
   public static void testAssign2() {
      DoubleFactory2D f = DoubleFactory2D.dense;
      double[][] data = new double[][] { {1,2,3}, {4,5,6}, {7,8,9} };
      DoubleMatrix2D m = f.make(data);
      DoubleMatrix2D m2 = f.make(data);
      DoubleMatrix1D v = DoubleFactory1D.dense.make(new double[] {1,2,3});
      DoubleMatrix1D v2 = DoubleFactory1D.dense.make(new double[] {1,2,3});
      m.assign(v, Functions.mult);
      m2.assign(v2, Functions.mult);
      assertEquals(m, m2);
   }
}