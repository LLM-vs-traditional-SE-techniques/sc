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


public class CodexTest_0_6_9 { 
    @Test
    public void testAssign() {
        double[] values = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        DoubleMatrix1D A = new DenseDoubleMatrix1D(values);
        DoubleMatrix1D B = new DenseDoubleMatrix1D(values.length);
        B.assign(A);
        assertEquals(A, B);
        DoubleMatrix1D C = new DenseDoubleMatrix1D(values.length);
        C.assign(A, Functions.chain(Functions.plus(1), Functions.square));
        assertEquals(B.assign(Functions.plus(1)), C);
        DoubleMatrix1D D = new DenseDoubleMatrix1D(values.length);
        D.assign(A, Functions.chain(Functions.plus(1), Functions.square), Functions.plus);
        assertEquals(B.assign(Functions.plus(1)), D);
        DoubleMatrix1D E = new DenseDoubleMatrix1D(values.length);
        E.assign(A, Functions.chain(Functions.plus(1), Functions.square), Functions.plus, B);
        assertEquals(B.assign(Functions.plus(1)), E);
    }
}