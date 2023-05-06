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


public class CodexTest_0_6_67 { 
  @Test
    public void testAssignDoubleFunction() {
        DoubleMatrix1D x = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5, 6 });
        x.assign(DoubleFunctions.mult(3));
        assertEquals(x.getQuick(0), 3, TOL);
        assertEquals(x.getQuick(1), 6, TOL);
        assertEquals(x.getQuick(2), 9, TOL);
        assertEquals(x.getQuick(3), 12, TOL);
        assertEquals(x.getQuick(4), 15, TOL);
        assertEquals(x.getQuick(5), 18, TOL);
    }
}