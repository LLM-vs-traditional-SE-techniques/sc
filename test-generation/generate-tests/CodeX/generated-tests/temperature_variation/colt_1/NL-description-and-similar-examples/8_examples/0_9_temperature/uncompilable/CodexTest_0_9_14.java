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


public class CodexTest_0_9_14 { 
  @Test
  public void testNewInstance() {
			final double[] doubles = { 
					2.38,0.345,1.22 ,
					0.234,0.33123,2.22
			};
			final int rows = getNumRows();
			final int cols = doubles.length / rows;
			final DenseDoubleMatrix2D A = new DenseDoubleMatrix2D( rows, cols , doubles , 0, cols, true);
			DenseDoubleMatrix2D B = (DenseDoubleMatrix2D)A.copy().newInstance(A.rows(),A.columns());
			A.assign(B);
			A.assign(B);
			assertEquals("A == B", A, B);
			assertNotSame("!= shallow", A, B);
		}

}