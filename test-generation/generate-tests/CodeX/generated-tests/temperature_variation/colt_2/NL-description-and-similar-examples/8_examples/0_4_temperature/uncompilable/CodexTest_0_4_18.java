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


public class CodexTest_0_4_18 { 
  @Test
    public void testLike2D() {
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix2D A = f.make(2, 3);
        A.assign(1);
        DoubleMatrix2D B = A.like2D(4, 2);
        B.assign(2);
        DoubleMatrix2D C = f.make(A.rows(), B.columns());
        C.assign(3);
        A.zMult(B, C);
        assertEquals(24, C.getQuick(0, 0), TOL);
        assertEquals(24, C.getQuick(0, 1), TOL);
        assertEquals(24, C.getQuick(1, 0), TOL);
        assertEquals(24, C.getQuick(1, 1), TOL);
    }
}