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


public class CodexTest_0_7_86 { 
  @Test
        public void testAssign() {
        DoubleFactory1D factory = DoubleFactory1D.dense;
        DoubleMatrix1D A = factory.make(SIZE);
        A.assign(2);
        for (int i=A.size(); --i >= 0; ) {
            assertEquals(2, A.getQuick(i), TOL);
        }
        DoubleMatrix1D B = factory.make(SIZE);
        B.assign(A);
        for (int i=B.size(); --i >= 0; ) {
            assertEquals(2, B.getQuick(i), TOL);
        }
        assertTrue(A != B);
        DoubleMatrix1D C = factory.make(SIZE);
        C.assign(3);
        A.assign(C, DoubleFunctions.plus);
        for (int i=A.size(); --i >= 0; ) {
            assertEquals(5, A.getQuick(i), TOL);
        }
        A.assign(C, DoubleFunctions.plusMultFirst(2));
        for (int i=A.size(); --i >= 0; ) {
            assertEquals(11, A.getQuick(i), TOL);
        }
        A.assign(C, DoubleFunctions.plusMultSecond(3));
        for (int i=A.size(); --i >= 0; ) {
            assertEquals(14, A.getQuick(i), TOL);
        }
        A.assign(C, DoubleFunctions.plusMult(2,3));
        for (int i=A.size(); --i >= 0; ) {
            assertEquals(20, A.getQuick(i), TOL);
        }
    }
}