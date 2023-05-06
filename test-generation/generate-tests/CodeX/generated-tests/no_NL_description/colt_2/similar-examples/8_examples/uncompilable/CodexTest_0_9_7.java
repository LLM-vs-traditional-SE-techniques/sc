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


public class CodexTest_0_9_7 { 
  @Test
    public void testConstructor2() {
        double[][] a = { {0.5,0.4,0.3}, {1.5,1.4,1.3}, {2.5,2.4,2.3}, {3.5,3.4,3.3} };
        DoubleMatrix2D A = SparseDoubleAlgebra.DEFAULT.make(a);
        int[] c = {3,4,1};
        int[] r = {0,2,3};
        DoubleMatrix2D B = SparseDoubleAlgebra.DEFAULT.getSelection(A,r,c);
        double[][] b = B.toArray();
        double[][] expected = { {3.5,3.4,3.3} , {2.5,2.4,2.3}, {0.5,0.4,0.3} };
        assertTrue(Equals.doubleArrayArrayEquals(expected,b));
    }
}