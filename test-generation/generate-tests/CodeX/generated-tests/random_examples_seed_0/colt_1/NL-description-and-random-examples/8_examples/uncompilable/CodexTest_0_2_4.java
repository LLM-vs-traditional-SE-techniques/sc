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


public class CodexTest_0_2_4 { 
    @Test
    public void testAssignDoubleMatrix1D() {
        DoubleMatrix1D source = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5 });
        DoubleMatrix1D target = new DenseDoubleMatrix1D(5);
        target.assign(source);
        assertEquals(1, target.getQuick(0), TOL);
        assertEquals(2, target.getQuick(1), TOL);
        assertEquals(3, target.getQuick(2), TOL);
        assertEquals(4, target.getQuick(3), TOL);
        assertEquals(5, target.getQuick(4), TOL);
    }
}