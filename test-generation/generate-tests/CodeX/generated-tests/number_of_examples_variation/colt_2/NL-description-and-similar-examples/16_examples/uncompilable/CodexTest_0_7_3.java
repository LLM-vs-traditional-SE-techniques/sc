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


public class CodexTest_0_7_3 { 
  @Test
    public static void doubleTest6() {
      double[][] arrMatrix = { 
        { 1, 2, 3, 4, 5, 6},
        { 2, 3, 4, 5, 6, 7},
        { 3, 4, 5, 6, 7, 8}
      };
      DoubleFactory2D f = DoubleFactory2D.dense;
      DoubleMatrix2D matrix = f.make(arrMatrix);
      DoubleMatrix2D res = matrix.like2D(matrix.rows(), matrix.columns());
      res.assign(matrix);
      int numRows = matrix.rows();
      int numCols = matrix.columns();
      double[][] arrRes = new double[numRows][numCols];
      for (int r = 0; r < numRows; r++) {
        for (int c = 0; c < numCols; c++) {
          arrRes[r][c] = 1;
        }
      }
      System.out.println(res);
    }
}