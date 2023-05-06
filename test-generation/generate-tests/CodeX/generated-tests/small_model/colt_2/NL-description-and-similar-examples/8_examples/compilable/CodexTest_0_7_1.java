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
    public static void doubleTest3() {
        final double[][] arrMatrix = 
        { 
            { 1, 2, 3, 4, 5, 6},
            { 2, 3, 4, 5, 6, 7}
        };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix2D matrix = f.make(arrMatrix);
        assertEquals(arrMatrix.length, matrix.rows());
        assertEquals(arrMatrix[0].length, matrix.columns());
        for (int row = 0; row < arrMatrix.length; row++) {
          for (int column = 0; column < arrMatrix[0].length; column++) {
            assertEquals(arrMatrix[row][column], matrix.get(row, column), 1e-12);
          }
        }
      }
}