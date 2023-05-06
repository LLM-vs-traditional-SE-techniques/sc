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


public class CodexTest_0_5_91 { 
  @Test
    public void testAssignDoubleArray() {
        DoubleMatrix2D A = new DenseDoubleMatrix2D(2,3);
        A.assign(new double[] {1,2,3,4,5,6});
        assertEquals(1,A.get(0,0),TOL);
        assertEquals(2,A.get(0,1),TOL);
        assertEquals(3,A.get(0,2),TOL);
        assertEquals(4,A.get(1,0),TOL);
        assertEquals(5,A.get(1,1),TOL);
        assertEquals(6,A.get(1,2),TOL);
    }
}