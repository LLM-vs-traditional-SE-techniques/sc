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


public class CodexTest_0_4_5 { 
  @Test
  public void testAssign() {
    double[] data = {1,2,3,4,5,6,7,8,9,10};
    DoubleMatrix1D matrix = new DenseDoubleMatrix1D(data);
    assertEquals(10, matrix.size());
    assertEquals(1, matrix.get(0));
    assertEquals(10, matrix.get(9));
    matrix.assign(new DoubleFunction() {
      public double apply(double d) {
        return d + 1;
      }
    });
    assertEquals(11, matrix.get(0));
    assertEquals(11, matrix.get(9));
  }
}