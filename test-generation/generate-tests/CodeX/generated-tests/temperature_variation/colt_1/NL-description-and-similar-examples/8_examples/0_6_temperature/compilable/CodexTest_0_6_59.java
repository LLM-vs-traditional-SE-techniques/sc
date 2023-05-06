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


public class CodexTest_0_6_59 { 
  @Test
    public static void testAssign3() {
        int size = 5;
        DoubleMatrix2D A = new DenseDoubleMatrix2D(size, size);
        DoubleMatrix2D B = new DenseDoubleMatrix2D(size, size);
        DoubleMatrix2D C = new DenseDoubleMatrix2D(size, size);
        A.assign(cern.jet.math.Functions.mult(2));
        B.assign(cern.jet.math.Functions.mult(3));
        B.assign(A);
        C.assign(cern.jet.math.Functions.mult(6));
        assertEquals(C, B);
    }
}