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


public class CodexTest_0_9_21 { 
    @Test
    public void testSimpleCase() {
        IntBuffer v1 = IntBuffer.allocate(3);
        v1.put(1);
        v1.put(0);
        v1.put(2);
        IntBuffer v2 = IntBuffer.allocate(3);
        v2.put(0);
        v2.put(1);
        v2.put(3);
        RealVector v1d = new ArrayRealVector(v1.array());
        RealVector v2d = new ArrayRealVector(v2.array());
        RealMatrix m = v1d.outerProduct(v2d);
        assertEquals(0, m.getEntry(0, 0), 0);
        assertEquals(0, m.getEntry(0, 1), 0);
        assertEquals(0, m.getEntry(0, 2), 0);
        assertEquals(1, m.getEntry(1, 0), 0);
        assertEquals(0, m.getEntry(1, 1), 0);
        assertEquals(3, m.getEntry(1, 2), 0);
        assertEquals(0, m.getEntry(2, 0), 0);
        assertEquals(2, m.getEntry(2, 1), 0);
        assertEquals(0, m.getEntry(2, 2), 0);
    }
}