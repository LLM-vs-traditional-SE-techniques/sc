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


public class CodexTest_0_6_2 { 
  @Test
    public void testAssign() {
        DoubleFactory2D F = DoubleFactory2D.dense;
        DoubleMatrix2D A = F.make(2, 2);
        A.assign(2);
        DoubleMatrix2D B = F.make(2, 2);
        B.assign(3);
        A.assign(B);
        assertEquals(3, A.get(0, 0), 1e-10);
        assertEquals(3, A.get(0, 1), 1e-10);
        assertEquals(3, A.get(1, 0), 1e-10);
        assertEquals(3, A.get(1, 1), 1e-10);
    }
}