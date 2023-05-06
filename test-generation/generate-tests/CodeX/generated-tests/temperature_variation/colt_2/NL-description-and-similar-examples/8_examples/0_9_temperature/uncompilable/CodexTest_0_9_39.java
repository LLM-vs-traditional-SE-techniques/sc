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


public class CodexTest_0_9_39 { 
  @Test
    public static void testLike2D() {
								 
      double[][] values = new double[][] { { 1, 2 }, { 3, 4 } };
      DoubleMatrix2D m = new DenseDoubleMatrix2D(values);
      DoubleMatrix2D n = m.like2D(2,2);
      n.assign(m);
      Get set tests (among others)
      m.set(0, 1, 3);
      assertEquals(3, m.get(0,1));
      m.set(1, 0, 4);
      assertEquals(4, m.get(0,1));
    }
}