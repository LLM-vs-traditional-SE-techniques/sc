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


public class CodexTest_0_8_11 { 
    
    
    @Test
    public void testAssignDoubleArray() {
        DenseDoubleMatrix1D m = new DenseDoubleMatrix1D(SIZE);
        m.assign(new double[] { 0, 1, 2, 3, 4 });
        assertEquals(0, m.get(0), TOL);
        assertEquals(1, m.get(1), TOL);
        assertEquals(2, m.get(2), TOL);
        assertEquals(3, m.get(3), TOL);
        assertEquals(4, m.get(4), TOL);
    }
    
    
}