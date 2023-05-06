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


public class CodexTest_0_8_28 { 
  @Test
    public void testLike2D() {
        DoubleMatrix2D x = new DenseDoubleMatrix2D(2,3);
        DoubleFactory2D factory = DoubleFactory2D.dense;
        DoubleMatrix2D y = factory.like2D(5,7);
        int rows = x.rows();
        int columns = x.columns();
        int columns2 = y.columns();
        int rows2 = y.rows();
        assertEquals(rows, 2);
        assertEquals(columns, 3);
        assertEquals(columns2, 7);
        assertEquals(rows2, 5);
}