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


public class CodexTest_0_4_46 { 
  @Test
    public void testAssign() {
        DoubleMatrix1D m = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 });
        DoubleMatrix1D n = new DenseDoubleMatrix1D(new double[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 });
        m.assign(n);
        assertEquals(11, m.get(0), TOL);
        assertEquals(12, m.get(1), TOL);
        assertEquals(13, m.get(2), TOL);
        assertEquals(14, m.get(3), TOL);
        assertEquals(15, m.get(4), TOL);
        assertEquals(16, m.get(5), TOL);
        assertEquals(17, m.get(6), TOL);
        assertEquals(18, m.get(7), TOL);
        assertEquals(19, m.get(8), TOL);
        assertEquals(20, m.get(9), TOL);
        assertEquals(21, m.get(10), TOL);
        assertEquals(22, m.get(11), TOL);
    }
}