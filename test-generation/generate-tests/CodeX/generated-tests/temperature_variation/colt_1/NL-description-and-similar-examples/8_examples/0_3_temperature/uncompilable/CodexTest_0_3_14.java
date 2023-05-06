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


public class CodexTest_0_3_14 { 
  @Test
    public void testAssignDoubleArray() {
        DoubleMatrix1D m = new DenseDoubleMatrix1D(SIZE);
        double[] expected = new double[SIZE];
        for (int r=0; r<SIZE; r++) {
            expected[r] = Math.random();
            m.setQuick(r,expected[r]);
        }
        DoubleMatrix1D m2 = new DenseDoubleMatrix1D(SIZE);
        m2.assign(expected);
        for (int r=0; r<SIZE; r++) {
            assertEquals(expected[r],m2.getQuick(r),TOL);
        }
    }
}