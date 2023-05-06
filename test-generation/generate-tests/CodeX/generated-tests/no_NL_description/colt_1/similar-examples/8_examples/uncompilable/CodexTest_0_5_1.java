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


public class CodexTest_0_5_1 { 
  @Test
    /**
     * Tests the method {@link cern.colt.matrix.DoubleMatrix1D#assign(cern.colt.matrix.DoubleMatrix1D)}.
     */
    public void testAssignDoubleMatrix1D() {
        DoubleMatrix1D A = new DenseDoubleMatrix1D(SIZE);
        DoubleMatrix1D B = new DenseDoubleMatrix1D(SIZE);
        for (int i = 0; i < SIZE; i++) {
            A.setQuick(i, Math.random());
            B.setQuick(i, Math.random());
        }
        A.assign(B);
        for (int i = 0; i < SIZE; i++) {
            assertEquals(B.get(i), A.get(i), TOL);
        }
    }
}