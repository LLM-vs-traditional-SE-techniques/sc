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


public class CodexTest_0_6_3 { 
  @Test
    public void testLike2D() {
        DoubleMatrix2D matrix = new DenseDoubleMatrix2D(2, 2);
        matrix.setQuick(0, 1, 2.3);
        matrix.setQuick(1, 2, 3.5);
        DoubleMatrix1D x = matrix.getRow(0);
        DoubleMatrix1D y = matrix.getRow(1);
        DoubleMatrix1D z = matrix.like(2, 2);
        z.setQuick(0, 0, 1);
        z.setQuick(1, 0, 2);
        z.setQuick(2, 1, 3);
        z.setQuick(3, 1, 4);
        assertEquals(2, x.size());
        assertEquals(2, y.size());
        assertEquals(4, z.size());
        assertEquals(1.0, x.getQuick(0), EPSILON);
        assertEquals(2.0, x.getQuick(1), EPSILON);
        assertEquals(3.0, y.getQuick(0), EPSILON);
        assertEquals(4.0, y.getQuick(1), EPSILON);
        assertEquals(2.0, z.getQuick(0), EPSILON);
        assertEquals(3.0, z.getQuick(1), EPSILON);
        assertEquals(0.0, z.getQuick(2), EPSILON);
        assertEquals(0.0, z.getQuick(3), EPSILON);
    }
}