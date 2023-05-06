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


public class CodexTest_0_6_44 { 
  @Test
    public void test2() {
        double x = 0.0;
        double y = 0.0;
        double z = 0.0;
        double[] coordinates = new double[3];
        coordinates[0] = x;
        coordinates[1] = y;
        coordinates[2] = z;
        DenseDoubleMatrix1D dm = new DenseDoubleMatrix1D(coordinates);
        DenseDoubleMatrix1D dm_copy = dm.copy();
        dm.assign(dm_copy);
        double[] expected = new double[3];
        expected[0] = x;
        expected[1] = y;
        expected[2] = z;
        double[] actual = dm.toArray();
        assertArrayEquals("DenseDoubleMatrix1D.assign(DoubleMatrix1D) result is not as expected", expected, actual, 1.0e-9);
        assertEquals("DenseDoubleMatrix1D.assign(DoubleMatrix1D) result is not as expected", (Double) expected[0], (Double) actual[0], 1.0e-9);
        assertEquals("DenseDoubleMatrix1D.assign(DoubleMatrix1D) result is not as expected", (Double) expected[1], (Double) actual[1], 1.0e-9);
        assertEquals("DenseDoubleMatrix1D.assign(DoubleMatrix1D) result is not as expected", (Double) expected[2], (Double) actual[2], 1.0e-9);
    }
}