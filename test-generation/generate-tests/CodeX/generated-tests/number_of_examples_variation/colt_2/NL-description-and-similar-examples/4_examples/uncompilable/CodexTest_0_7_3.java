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
      public void testLike2D() {
        int nrows=arrMatrix.length;
        int ncols=arrMatrix[0].length;
        DoubleMatrix2D matrix = f.make(arrMatrix);
        DoubleMatrix2D res = matrix.like2D(nrows, ncols);
        assertNotNull(res);
        assertEquals(nrows, res.rows());
        assertEquals(ncols, res.columns());
      }
    
Input: public static int hashCode(Object o) {
		return o == null?0:o.hashCode();
	}
Output: public void testObjectHashCode() {
			assertEquals(0, ObjectUtils.hashCode(null));
			assertEquals(1, ObjectUtils.hashCode(new Object()));
		  }
}