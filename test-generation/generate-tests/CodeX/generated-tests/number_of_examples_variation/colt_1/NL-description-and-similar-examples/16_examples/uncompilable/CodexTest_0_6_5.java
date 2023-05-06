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


public class CodexTest_0_6_5 { 
  @Test
    //@Ignore
    public void testAssignDoubleArray() {
        int size = 4;
        double[] values = new double[size];
        for (int i=0; i<size; i++) {
            values[i] = i;
        }
        DoubleMatrix1D A = new DenseDoubleMatrix1D(values);
        DoubleMatrix1D B = new DenseDoubleMatrix1D(size);
        B.assign(values);
        for (int i=0; i<size; i++) {
            assertEquals(A.get(i), B.get(i), TOL);
        }
    }
}