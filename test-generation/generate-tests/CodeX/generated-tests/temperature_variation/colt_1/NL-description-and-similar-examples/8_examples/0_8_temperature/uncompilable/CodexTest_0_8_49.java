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


public class CodexTest_0_8_49 { 
  @Test
    public void testAssign9() {
        DoubleMatrix1D expected = factory().make(SIZE);
        for (int i = 0; i < SIZE; i++) {
            expected.setQuick(i, Math.random());
        }
        DoubleMatrix2D Acopy = A.copy();
        DoubleMatrix2D Bcopy = B.copy();
        DoubleMatrix2D Ccopy = C.copy();
        expected.assign(A.viewColumn(0));
        expected.assign(B.viewColumn(0), DoubleFunctions.mult);
        expected.assign(C.viewColumn(0), DoubleFunctions.div);
        DoubleMatrix1D actual = A.viewColumn(0);
        actual.assign(B.viewColumn(0), DoubleFunctions.mult);
        actual.assign(C.viewColumn(0), DoubleFunctions.div);
        assertEquals(expected, actual);
        A = Acopy;
        B = Bcopy;
        C = Ccopy;
    }
}