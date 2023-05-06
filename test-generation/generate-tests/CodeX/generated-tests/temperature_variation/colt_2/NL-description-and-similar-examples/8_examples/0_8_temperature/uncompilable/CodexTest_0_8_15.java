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


public class CodexTest_0_8_15 { 
  @Test
    public void testLike2D() {
        DenseDoubleMatrix2D like = (DenseDoubleMatrix2D)getMatrixFactory().like2D(4, 4);
        assertEquals(4, like.rows());
        assertEquals(4, like.columns());
        like = (DenseDoubleMatrix2D)getMatrixFactory().like2D(4, 3);
        assertEquals(4, like.rows());
        assertEquals(3, like.columns());
        like = (DenseDoubleMatrix2D)getMatrixFactory().like2D(3, 4);
        assertEquals(3, like.rows());
        assertEquals(4, like.columns());
    }
}