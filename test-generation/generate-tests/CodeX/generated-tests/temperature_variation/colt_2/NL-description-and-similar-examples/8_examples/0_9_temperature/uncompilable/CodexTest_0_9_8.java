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


public class CodexTest_0_9_8 { 
  @Test
    public void testConstructors() {
        DenseDoubleMatrix2D a = new DenseDoubleMatrix2D(SparseRCDoubleMatrix2DTest.test3by3);
        assertEquals(3, a.rows());
        assertEquals(3, a.columns());
        DenseDoubleMatrix2D b = new DenseDoubleMatrix2D(a.toArray());
        assertEquals(a, b);
        DenseDoubleMatrix2D c = new DenseDoubleMatrix2D(3,3);
        assertEquals(3, c.rows());
        assertEquals(3, c.columns());
        c = new DenseDoubleMatrix2D(2,2);
        assertEquals(2, c.rows());
        assertEquals(2, c.columns());
    }
}