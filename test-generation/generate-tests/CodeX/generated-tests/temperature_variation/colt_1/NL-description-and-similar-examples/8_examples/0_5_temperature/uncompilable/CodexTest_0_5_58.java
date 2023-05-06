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


public class CodexTest_0_5_58 { 
  @Test
    
    
    public void testAssignDoubleArray() {
        double[] assigned = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            assigned[i] = Math.random();
        }
        DoubleMatrix1D A = new DenseDoubleMatrix1D(SIZE);
        A.assign(assigned);
        for (int i = 0; i < SIZE; i++) {
            assertEquals(assigned[i], A.getQuick(i), TOL);
        }
    }
    public void testAssignDoubleArrayIntInt() {
        double[] values = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = Math.random();
        }
        DoubleMatrix1D A = new DenseDoubleMatrix1D(SIZE);
        A.assign(values, 5, 6);
        for (int i = 5; i < 11; i++) {
            assertEquals(values[i], A.getQuick(i), TOL);
        }
    }
    public void testAssignDoubleMatrix1D() {
        DoubleMatrix1D other = new DenseDoubleMatrix1D(SIZE);
        for (int i = 0; i < SIZE; i++) {
            other.setQuick(i, Math.random());
        }
        DoubleMatrix1D view = other.viewPart(5,6);
        DoubleMatrix1D A = new DenseDoubleMatrix1D(SIZE);
        A.assign(view);
        for (int i = 0; i < SIZE; i++) {
            assertEquals(other.getQuick(i), A.getQuick(i), TOL);
        }
    }
    public void testAssignDoubleFunction() {
        DoubleMatrix1D A = new DenseDoubleMatrix1D(SIZE);
        A.assign(DoubleFunctions.acos);
        for (int i = 0; i < SIZE; i++) {
            assertEquals(Math.acos(i), A.getQuick(i), TOL);
        }
    }

}