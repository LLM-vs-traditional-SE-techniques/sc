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


public class CodexTest_0_7_28 { 
  @Test
    public void testLike2D() {
        DoubleFactory2D factory = DoubleFactory2D.dense;
        int rows = 3;
        int columns = 4;
        DoubleMatrix2D A = factory.make(rows, columns);
        DoubleMatrix2D B = factory.like2D(rows, columns);
        assertEquals(A.rows(), B.rows());
        assertEquals(A.columns(), B.columns());
    }
    
Input: public final int numDimensions() {
			return m_Elements.length;
		  }
Output: public void testLengthConstructor() {
			int len = 22;
			AlgVector v = new AlgVector(len);
			assertEquals("Length differs", len, v.numDimensions());
		  }
}