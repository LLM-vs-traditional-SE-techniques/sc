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


public class CodexTest_0_7_3 { 
  @Test
    public void testAssignDoubleMatrix2D() {
        double[][] expected = new double[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                expected[r][c] = getEntry(r+1, c+1);
            }
        }
        RealMatrix m = new Array2DRowRealMatrix(expected, false);
        matrix.assign(m);
        assertEquals(0, new LUDecomposition(matrix).getDeterminant(), entryTolerance);
        assertClose("assign double[][]", expected, matrix.getData(), entryTolerance);
        m = new Array2DRowRealMatrix(expected, true);
        matrix.assign(m);
        assertEquals(0, new LUDecomposition(matrix).getDeterminant(), entryTolerance);
        assertClose("assign double[][]", expected, matrix.getData(), entryTolerance);
    }
}