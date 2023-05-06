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


public class CodexTest_0_8_4 { 
  @Test
    /**
     * Test method for {@link org.apache.commons.math3.linear.AbstractRealMatrix#assign(org.apache.commons.math3.linear.RealMatrix)}.
     */
	public void testAssignRealMatrix() {
        final double[] data = new double[] { 1, 2, 3, 4 };
        final RealMatrix m = MatrixUtils.createColumnRealMatrix(data);
        final int nRows = m.getRowDimension();
        final int nCols = m.getColumnDimension();
        final RealMatrix matrix = new OpenMapRealMatrix(nRows, nCols);
        final RealMatrix m2 = m.copy();
        assertNotSame(m, m2);
        assertEquals(m, m2);
        matrix.assign(m);
        assertEquals(m, matrix);
    }
}