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


public class CodexTest_0_8_2 { 
  @Test
  public void testGetQuick() {
    final int SIZE = 3;
    double[] data = new double[SIZE];
    for (int i = 0; i < data.length; i++) {
      data[i] = i + 1;
    }
    double otherData[][] = {
      {1.1, 2.2, 3.3},
      {4.4, 5.5, 6.6},
      {7.7, 8.8, 9.9}
    };
    DoubleMatrix1D A = new DenseDoubleMatrix1D(data);
    DoubleMatrix2D B = new DenseDoubleMatrix2D(otherData);
    for (int i = 0; i < SIZE; i++) {
      assertEquals(i + 1, A.getQuick(i), EPS);
    }
			
  }
 */
}