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


public class CodexTest_0_3_36 { 
  @Test
    public void testAssign() {
        DoubleMatrix1D m = new DenseDoubleMatrix1D(SIZE);
        DoubleMatrix1D n = new DenseDoubleMatrix1D(SIZE);
        for (int i = 0; i < SIZE; ++i) {
            m.setQuick(i, i + 1);
            n.setQuick(i, -i);
        }
        DoubleMatrix1D l = m.like();
        l.assign(m);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i + 1, l.getQuick(i), TOL);
        }
        l.assign(n);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(-i, l.getQuick(i), TOL);
        }
        l.assign(m);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i + 1, l.getQuick(i), TOL);
        }
        l.assign(n, Functions.plus);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(0, l.getQuick(i), TOL);
        }
        l.assign(m, Functions.plus);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(2 * (i + 1), l.getQuick(i), TOL);
        }
        l.assign(n, Functions.mult);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(0, l.getQuick(i), TOL);
        }
        l.assign(m, Functions.mult);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals((i + 1) * (i + 1), l.getQuick(i), TOL);
        }
        l.assign(n, Functions.div);
        for (int i = 0; i < SIZE; ++i
}