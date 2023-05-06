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


public class CodexTest_0_4_28 { 
  @Test
    public void testLike2D() {
        DoubleFactory2D factory = DoubleFactory2D.dense;
        DoubleMatrix2D matrix = factory.make(2, 3);
        matrix.assign(1);
        DoubleMatrix2D matrix2 = matrix.like2D(3, 2);
        assertEquals(3, matrix2.rows());
        assertEquals(2, matrix2.columns());
        DoubleMatrix2D matrix3 = matrix.like2D(3, 3);
        matrix3.assign(2);
        assertEquals(0, matrix.zSum(), TOLERANCE);
        assertEquals(6, matrix2.zSum(), TOLERANCE);
        assertEquals(18, matrix3.zSum(), TOLERANCE);
    }
}