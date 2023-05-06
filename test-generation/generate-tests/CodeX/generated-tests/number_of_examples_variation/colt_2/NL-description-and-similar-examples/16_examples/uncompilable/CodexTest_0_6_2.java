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


public class CodexTest_0_6_2 { 
  @Test
    public void testLike2D() {
        double[][] values = { {1, 2}, {3, 4}};
        DoubleMatrix2D A = new DenseDoubleMatrix2D(values);
        DoubleMatrix2D B = A.like2D(A.rows(), A.columns());
        B.assign(A);
        double[][] b = B.toArray();
        assertEquals(b[0][0], 1, 1e-9);
        assertEquals(b[0][1], 2, 1e-9);
        assertEquals(b[1][0], 3, 1e-9);
        assertEquals(b[1][1], 4, 1e-9);
    }
}