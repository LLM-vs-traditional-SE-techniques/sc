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


public class CodexTest_0_8_13 { 
  @Test
    public void testGetMatrix() {
        int n = A.length;
        double[][] C = A[0].getMatrix(t);
        Assert.assertEquals(t[0], C.length);
        Assert.assertEquals(t[1], C[0].length);
        for (int i = 0; i < t[0]; i++) {
            for (int j = 0; j < t[1]; j++) {
                Assert.assertEquals(A[i].getEntry(j), C[i][j], 1.0e-10);
            }
        }
        double[][] D = A[0].getMatrix();
        Assert.assertEquals(n, D.length);
        Assert.assertEquals(n, D[0].length);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Assert.assertEquals(A[i].getEntry(j), D[i][j], 1.0e-10);
            }
        }
    }
}