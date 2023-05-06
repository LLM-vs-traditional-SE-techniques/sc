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


public class CodexTest_0_6_4 { 
  @Test
    public static void doubleTest9() {
        int r = 3;
        int c = 3;
        DoubleMatrix2D A = new DenseDoubleMatrix2D(r,c);
        DoubleMatrix2D B = new DenseDoubleMatrix2D(r,c);
        DoubleMatrix2D C = A.like2D(r, c);
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                A.setQuick(i, j, i * c + j);
                B.setQuick(i, j, i * c + j);
                C.setQuick(i, j, i * c + j);
            }
        }
        DoubleMatrix2D D = A.like2D(c, r);
        for (int i = 0; i < c; ++i) {
            for (int j = 0; j < r; ++j) {
                D.setQuick(i, j, i * r + j);
            }
        }
        DoubleMatrix2D E = A.like2D(0, c);
        DoubleMatrix2D F = A.like2D(r, 0);
        DoubleMatrix2D G = A.like2D(0, 0);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
    }
}