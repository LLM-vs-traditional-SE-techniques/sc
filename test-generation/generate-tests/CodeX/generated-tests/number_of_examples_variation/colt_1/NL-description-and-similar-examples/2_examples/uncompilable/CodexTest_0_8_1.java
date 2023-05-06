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


public class CodexTest_0_8_1 { 
  @Test
    /**
     * Creates a new <i>m X n</i> matrix which is initialized with <tt>0</tt>
     * at the diagonal and <tt>1</tt> elsewhere.
     *
     * @param m number of rows
     * @param n number of columns
     * @return  an <i>m X n</i> matrix.
     * @throws	IllegalArgumentException if <tt>m<0 || n<0 || (double)m*n > Integer.MAX_VALUE</tt>.
     */
    public static DoubleMatrix2D identity(int m, int n) {
        return diagonal(m,n,1,0);
    }
}