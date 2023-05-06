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


public class CodexTest_0_5_35 { 
  @Test
    public void testDisjoint() {
        DoubleMatrix2D a = new DenseDoubleMatrix2D(2, 2);
        a.set(0, 0, 1);
        a.set(1, 1, 1);
        DoubleMatrix2D b = new DenseDoubleMatrix2D(2, 2);
        b.set(1, 0, 1);
        b.set(0, 1, 1);
        DoubleMatrix2D c = new DenseDoubleMatrix2D(2, 2);
        c.set(0, 0, 1);
        c.set(1, 1, 1);
        DoubleMatrix2D d = new DenseDoubleMatrix2D(2, 2);
        d.set(1, 0, 1);
        d.set(0, 1, 1);
        assertTrue(a.disjoint(b));
        assertTrue(b.disjoint(a));
        assertFalse(c.disjoint(d));
        assertFalse(d.disjoint(c));
    }
}