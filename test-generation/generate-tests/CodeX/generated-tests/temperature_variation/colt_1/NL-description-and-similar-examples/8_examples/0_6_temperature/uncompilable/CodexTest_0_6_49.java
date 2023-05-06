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


public class CodexTest_0_6_49 { 
  @Test
    public void testAssign() {
        int size = 5;
        DoubleMatrix1D m1 = new DenseDoubleMatrix1D(size);
        DoubleMatrix1D m2 = m1.assign(new DenseDoubleMatrix1D(new double[] {1,2,3,4,5}));
        assertEquals(m1, m2);
        assertEquals(1, m1.getQuick(0), 1e-14);
        assertEquals(2, m1.getQuick(1), 1e-14);
        assertEquals(3, m1.getQuick(2), 1e-14);
        assertEquals(4, m1.getQuick(3), 1e-14);
        assertEquals(5, m1.getQuick(4), 1e-14);
}