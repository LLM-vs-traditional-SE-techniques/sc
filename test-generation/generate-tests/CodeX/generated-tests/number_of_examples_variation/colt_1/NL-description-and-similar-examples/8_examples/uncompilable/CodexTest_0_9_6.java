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


public class CodexTest_0_9_6 { 
  @Test
        public static void maxTest() {
        double[][] data = new double[COUNT][COUNT];
        for (int n = 0; n < COUNT; n++) {
            for (int m = 0; m < COUNT; m++) {
                if(n==m) {
                    double a = (double) n;
                    data[n][m] = Math.exp(a);
                } else {
                    data[n][m] = 0;
                }
            }
        }
        double[] start = new double[COUNT];
        for (int i = 0; i < COUNT; i++) {
            start[i] = i;
        }
        DenseDoubleMatrix1D vec1 = new DenseDoubleMatrix1D(COUNT);
        vec1.assign(start);
        DenseDoubleMatrix2D mat1 = new DenseDoubleMatrix2D(COUNT,COUNT);
        mat1.assign(data);
        DoubleMatrix1D result = mat1.zMult(vec1, null, COUNT / 2, null);
        System.out.println(vec1);
        System.out.println(result);
    }
}