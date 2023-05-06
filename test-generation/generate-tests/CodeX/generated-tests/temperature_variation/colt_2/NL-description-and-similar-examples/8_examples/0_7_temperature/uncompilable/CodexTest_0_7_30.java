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


public class CodexTest_0_7_30 { 
  @Test
    public void testDoubleMatrix2D() {
        DoubleFactory2D factory = DoubleFactory2D.dense;
        DoubleMatrix2D matrix = factory.like2D(2, 3);
        matrix.setQuick(0, 0, 1);
        matrix.setQuick(0, 1, 2);
        matrix.setQuick(0, 2, 3);
        matrix.setQuick(1, 0, 4);
        matrix.setQuick(1, 1, 5);
        matrix.setQuick(1, 2, 6);
        assertEquals(1, matrix.getQuick(0, 0), 1e-9);
        assertEquals(2, matrix.getQuick(0, 1), 1e-9);
        assertEquals(3, matrix.getQuick(0, 2), 1e-9);
        assertEquals(4, matrix.getQuick(1, 0), 1e-9);
        assertEquals(5, matrix.getQuick(1, 1), 1e-9);
        assertEquals(6, matrix.getQuick(1, 2), 1e-9);
    }
}