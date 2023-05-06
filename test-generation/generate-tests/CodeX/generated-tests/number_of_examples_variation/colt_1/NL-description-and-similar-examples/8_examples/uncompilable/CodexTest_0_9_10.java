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


public class CodexTest_0_9_10 { 
    @Test
    public void testAssign2() {
        final DoubleMatrix1D m1 = new DenseDoubleMatrix1D(new double[] {1,0,3});
        final DoubleMatrix1D m2 = m1.like(4);
        m2.assign(2.0);
        assertEquals(2.0, m2.get(0), 0);
        assertEquals(2.0, m2.get(1), 0);
        assertEquals(2.0, m2.get(2), 0);
        assertEquals(2.0, m2.get(3), 0);
        m1.assign(m2);
        assertEquals(2.0, m1.get(0), 0);
        assertEquals(2.0, m1.get(1), 0);
        assertEquals(2.0, m1.get(2), 0);
}