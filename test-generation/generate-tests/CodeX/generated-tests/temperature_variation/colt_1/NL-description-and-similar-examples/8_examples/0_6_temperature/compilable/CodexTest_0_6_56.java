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


public class CodexTest_0_6_56 { 
  @Test
    public static void testDoubleMatrix1D() {
        int size = 100;
        double[] data = new double[size];
        for (int i=0; i<size; i++) data[i] = i*1.0;
        DoubleMatrix1D matrix1D = new DenseDoubleMatrix1D(data);
        DoubleMatrix1D matrix1D2 = new DenseDoubleMatrix1D(size);
        matrix1D2.assign(matrix1D);
        System.out.println(matrix1D2);
        System.out.println(matrix1D);
    }
}