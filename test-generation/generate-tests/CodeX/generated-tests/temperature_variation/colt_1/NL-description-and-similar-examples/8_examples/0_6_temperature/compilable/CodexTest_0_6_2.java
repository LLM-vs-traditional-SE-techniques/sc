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
    public static void test(int N, int M) {
        double[][] a = new double[N][M];
        double[][] b = new double[N][M];
        double[][] c = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = 2*i+j;
                b[i][j] = i+j;
            }
        }
        DoubleMatrix2D A = DoubleFactory2D.dense.make(a);
        DoubleMatrix2D B = DoubleFactory2D.dense.make(b);
        DoubleMatrix2D C = A.assign(B);
        System.out.println(C);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        DoubleMatrix2D D = DoubleFactory2D.dense.make(c);
        System.out.println(D);
        System.out.println(C.equals(D));
    }

}