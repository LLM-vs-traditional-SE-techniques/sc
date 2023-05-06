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


public class CodexTest_0_7_2 { 
    @Test
    public void testAssignDoubleMatrix1DSource() {
        double[] values = new double[] {1, 2, 3, 4, 5, 6};
        double[] values2 = new double[] {3, 4, 5, 6, 7, 8};
        DenseDoubleMatrix1D denseDoubleMatrix1D = new DenseDoubleMatrix1D(values);
        DenseDoubleMatrix1D denseDoubleMatrix1D2 = new DenseDoubleMatrix1D(values2);
        DoubleMatrix1D result = denseDoubleMatrix1D.assign(denseDoubleMatrix1D2);
        assertEquals(3, result.getQuick(0), 1e-10);
        assertEquals(4, result.getQuick(1), 1e-10);
        assertEquals(5, result.getQuick(2), 1e-10);
        assertEquals(6, result.getQuick(3), 1e-10);
        assertEquals(7, result.getQuick(4), 1e-10);
        assertEquals(8, result.getQuick(5), 1e-10);
    }
}