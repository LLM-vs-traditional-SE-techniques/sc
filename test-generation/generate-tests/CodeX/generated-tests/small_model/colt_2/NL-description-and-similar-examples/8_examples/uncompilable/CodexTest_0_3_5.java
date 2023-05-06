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


public class CodexTest_0_3_5 { 
  @Test
    public void testLike2D() {
			DoubleMatrix2D matrix = new DenseDoubleMatrix2D(2,2);
			matrix.setQuick(0,0,1);
			matrix.setQuick(0,1,2);
			matrix.setQuick(1,0,3);
			matrix.setQuick(1,1,4);
			DoubleMatrix2D result = matrix.like2D(2,2);
			assertEquals(2, result.rows());
			assertEquals(2, result.columns());
			assertEquals(0, result.getQuick(0,0));
			assertEquals(0, result.getQuick(0,1));
			assertEquals(0, result.getQuick(1,0));
			assertEquals(0, result.getQuick(1,1));
		}
}