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


public class CodexTest_0_9_11 { 
    // BEGIN GENERATED CODE
    /**
     * Returns the matrix cell value at coordinate <tt>index</tt>.
     *
     * <p>Provided with invalid parameters this method may return invalid objects without throwing any exception.
     * <b>You should only use this method when you are absolutely sure that the coordinate is within bounds.</b>
     * Precondition (unchecked): <tt>index&lt;0 || index&gt;=size()</tt>.
     *
     * @param     index   the index of the cell.
     * @return    the value of the specified cell.
     */
    public abstract long getQuick(int index);
// END GENERATED CODE:
    @Test public void testGetQuick() {
        Assume.assumeTrue(matrix.size() >= 2);
        assertEquals(4, matrix.getQuick(1));
    }
}