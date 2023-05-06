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


public class CodexTest_0_7_1 { 
  @Test
  public static void testSetQuick() {
    int size = 100000;
    DoubleMatrix1D dense = new DenseDoubleMatrix1D(size);
    DoubleMatrix1D sparse = new SparseDoubleMatrix1D(size);
    for (int i=size; --i >= 0;) {
      double value = Math.random();
      dense.setQuick(i,value);
      sparse.setQuick(i,value);
    }
    for (int i=size; --i >= 0;) {
      double value = Math.random();
      dense.setQuick(i,value);
      sparse.setQuick(i,value);
    }
    assertTrue(dense.equals(sparse));
    assertTrue(sparse.equals(dense));
  }

}