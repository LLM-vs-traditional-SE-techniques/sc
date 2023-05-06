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


public class CodexTest_0_7_3 { 
  @Test
    public static void testConstructors() {
        System.out.println("Constructors");
        DoubleMatrix1D m = new DenseDoubleMatrix1D(SIZE);
        assertEquals(SIZE, m.size());
        assertEquals(0, m.getQuick(0), TOL);
        assertEquals(1, m.getQuick(1), TOL);
        assertEquals(2, m.getQuick(2), TOL);
        m = new DenseDoubleMatrix1D(SIZE, 2);
        assertEquals(SIZE, m.size());
        assertEquals(2, m.getQuick(0), TOL);
        assertEquals(2, m.getQuick(1), TOL);
        assertEquals(2, m.getQuick(2), TOL);
        m = new DenseDoubleMatrix1D(SIZE, new double[] { 2, 3, 4 });
        assertEquals(SIZE, m.size());
        assertEquals(2, m.getQuick(0), TOL);
        assertEquals(3, m.getQuick(1), TOL);
        assertEquals(4, m.getQuick(2), TOL);
        double[] values = new double[] { 2, 3, 4 };
        m = new DenseDoubleMatrix1D(values);
        assertEquals(values.length, m.size());
        assertEquals(2, m.getQuick(0), TOL);
        assertEquals(3, m.getQuick(1), TOL);
        assertEquals(4, m.getQuick(2), TOL);
        DoubleMatrix1D m2 = new DenseDoubleMatrix1D(m);
        assertEquals(m.size(), m2.size());
        assertEquals(2, m2.getQuick(0), TOL);
        assertEquals(3, m2.getQuick(1), TOL);
        assertEquals(4, m2.getQuick(2), TOL);
    }
}