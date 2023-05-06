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


public class CodexTest_0_8_59 { 
    /**
     * Test of like2D method, of class DoubleFactory2D.
     */
    @Test
    public void testLike2D_int_int() {
        int rows = 6;
        int columns = 6;
        DoubleFactory2D instance = DoubleFactory2D.dense;
        DoubleMatrix2D expResult = new DenseDoubleMatrix2D(rows,columns);
        DoubleMatrix2D result = instance.like2D(rows, columns);
        assertEquals(expResult.rows(), result.rows());
        assertEquals(expResult.columns(), result.columns());
    }
}