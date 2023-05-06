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


public class CodexTest_0_4_5 { 
    @Test
    public void testAssignDoubleMatrix1D() {
        DoubleMatrix1D source = new DenseDoubleMatrix1D(new double[] { 1, 2, 3, 4, 5 });
        DoubleMatrix1D target = new DenseDoubleMatrix1D(5);
        DoubleMatrix1D result = target.assign(source);
        assertEquals(result, target);
        assertEquals(1, target.getQuick(0), 0);
        assertEquals(2, target.getQuick(1), 0);
        assertEquals(3, target.getQuick(2), 0);
        assertEquals(4, target.getQuick(3), 0);
        assertEquals(5, target.getQuick(4), 0);
    }
}