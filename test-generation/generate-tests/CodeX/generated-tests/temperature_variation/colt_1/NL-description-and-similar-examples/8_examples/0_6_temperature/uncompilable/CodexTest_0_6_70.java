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


public class CodexTest_0_6_70 { 
  @Test
    public void testAssign() {
        double[] values = new double[] {1,2,3,4,5,6};
        DoubleMatrix1D a = new DenseDoubleMatrix1D(values);
        DoubleMatrix1D b = a.viewPart(1,2);
        b.assign(new DenseDoubleMatrix1D(new double[] {7,8}));
        assertEquals(1,a.getQuick(0),TOL);
        assertEquals(7,a.getQuick(1),TOL);
        assertEquals(8,a.getQuick(2),TOL);
        assertEquals(4,a.getQuick(3),TOL);
        assertEquals(5,a.getQuick(4),TOL);
        assertEquals(6,a.getQuick(5),TOL);
    }
}