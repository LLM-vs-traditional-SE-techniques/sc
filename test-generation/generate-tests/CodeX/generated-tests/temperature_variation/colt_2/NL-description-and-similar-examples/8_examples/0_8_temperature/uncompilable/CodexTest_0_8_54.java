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


public class CodexTest_0_8_54 { 
  @Test
     public void testLike2D() {
        DenseDoubleMatrix1D m = new DenseDoubleMatrix1D(4);
        double[][] values = new double[][] { {9, 1, 0}, {8, 2, 1}, {7, 0, 2}, {8, 1, 3} };
        DoubleMatrix2D A = new DenseDoubleMatrix2D(values);
        DoubleMatrix2D B = m.like2D(A.rows(), A.columns());
        double[] columnwiseB = new double[m.size()];
        double[] rowwiseB = new double[m.size()];
        DoubleMatrix2D C = A.zMult(B, null);
        C.zMult(m, columnwiseB);
        double colRes = 0;
        for (int i = 0; i < columnwiseB.length; i++) {
            colRes += columnwiseB[i];
        }
        A.zMult(m, rowwiseB);
        double rowRes = 0;
        for (int i = 0; i < rowwiseB.length; i++) {
            rowRes += rowwiseB[i];
        }
        assertEquals(colRes, rowRes, 1e-12);
    }
}