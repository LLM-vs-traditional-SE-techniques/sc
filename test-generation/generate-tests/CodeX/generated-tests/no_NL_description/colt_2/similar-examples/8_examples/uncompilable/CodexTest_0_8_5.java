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


public class CodexTest_0_8_5 { 
  @Test
    public void testEigenvalueDecomposition() {
      DoubleMatrix2D matrix = DoubleFactory2D.dense.make(new double[][]
        {{0,1},
         {1,0}});
      EigenvalueDecomposition evd = new EigenvalueDecomposition(matrix);
      DoubleMatrix2D D = evd.getD();
      DoubleMatrix2D V = evd.getV();
      DoubleMatrix2D A = V.zMult(D, V.like(D.rows(), D.columns()), 1.0, 0.0, true, false);
      for (int i = 0; i < matrix.rows(); i++) {
        for (int j = 0; j < matrix.columns(); j++) {
          double diff = FastMath.abs(matrix.getQuick(i, j) - A.getQuick(i, j));
          assertTrue("matrix(" + i + "," + j + ")=" + matrix.getQuick(i, j) +
                     " A(" + i + "," + j + ")=" + A.getQuick(i, j) +
                     " diff=" + diff, diff < 1.0e-9);
        }
      }
    }
}