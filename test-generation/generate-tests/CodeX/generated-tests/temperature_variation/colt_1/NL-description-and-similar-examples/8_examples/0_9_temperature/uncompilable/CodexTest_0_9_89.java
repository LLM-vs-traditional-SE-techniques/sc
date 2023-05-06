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


public class CodexTest_0_9_89 { 
  @Test
    public void testAssign() {
        DoubleMatrix2D v = DenseDoubleMatrix2D.make(2, 2);
        DoubleMatrix2D w = DenseDoubleMatrix2D.make(2, 2);
        v = v.assign(w);
        assertEquals(v.get(0, 0), 0.0, 1.0e-14);
        assertEquals(v.get(0, 1), 0.0, 1.0e-14);
        assertEquals(v.get(1, 0), 0.0, 1.0e-14);
        assertEquals(v.get(1, 1), 0.0, 1.0e-14);
    }
}