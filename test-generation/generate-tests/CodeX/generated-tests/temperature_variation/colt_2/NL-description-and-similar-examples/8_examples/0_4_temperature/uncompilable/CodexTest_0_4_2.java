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


public class CodexTest_0_4_2 { 
  @Test
    public void testLike2D() {
        DoubleMatrix2D a = new DenseDoubleMatrix2D(3, 2);
        a.assign(new double[][] { { 1, 2 }, { 3, 4 }, { 5, 6 } });
        DoubleMatrix2D b = a.like2D(2, 3);
        assertEquals(0, b.getQuick(0, 0), TOL);
        assertEquals(0, b.getQuick(0, 1), TOL);
        assertEquals(0, b.getQuick(0, 2), TOL);
        assertEquals(0, b.getQuick(1, 0), TOL);
        assertEquals(0, b.getQuick(1, 1), TOL);
        assertEquals(0, b.getQuick(1, 2), TOL);
    }
}