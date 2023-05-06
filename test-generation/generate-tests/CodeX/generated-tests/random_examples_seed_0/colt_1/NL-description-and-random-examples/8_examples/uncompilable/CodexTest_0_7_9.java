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


public class CodexTest_0_7_9 { 
    @Test
    public void testAssignDoubleMatrix1D() {
        DenseDoubleMatrix1D m = DenseDoubleMatrix1D.random(5);
        DenseDoubleMatrix1D l = DenseDoubleMatrix1D.random(5);
        assertFalse(l.equals(m));
        m.assign(l);
        assertEquals(m, l);
    }
    @Test
    public void testAssignDoubleMatrix1D2() {
        DenseDoubleMatrix1D m = DenseDoubleMatrix1D.random(5);
        DenseDoubleMatrix1D l = DenseDoubleMatrix1D.random(5);
        assertFalse(l.equals(m));
        l.assign(m);
        assertEquals(m, l);
    }
    @Test
    public void testAssignDoubleMatrix1D3() {
        DenseDoubleMatrix1D m = DenseDoubleMatrix1D.random(5);
        DenseDoubleMatrix1D l = DenseDoubleMatrix1D.random(5);
        assertFalse(l.equals(m));
        l.assign(m, Functions.plus);
        assertEquals(m, l);
    }
    @Test
    public void testAssignDoubleMatrix1D4() {
        DenseDoubleMatrix1D m = DenseDoubleMatrix1D.random(5);
        DenseDoubleMatrix1D l = DenseDoubleMatrix1D.random(5);
        assertFalse(l.equals(m));
        l.assign(m, Functions.plus, Functions.minus);
        assertEquals(m, l);
    }
}