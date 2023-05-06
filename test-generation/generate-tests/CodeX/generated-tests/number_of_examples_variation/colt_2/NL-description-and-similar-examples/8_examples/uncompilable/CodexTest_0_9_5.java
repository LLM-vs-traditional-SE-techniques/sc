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


public class CodexTest_0_9_5 { 
  @Test
  public void testLike2D() {
		AbstractDoubleMatrix2D matrix = (AbstractDoubleMatrix2D)
			new DenseDoubleMatrix2D(5,5).assign(MathFunctions.chain(MathFunctions.minus,
												   MathFunctions.square,
												   MathFunctions.plus(3)));
		AbstractDoubleMatrix2D matrix2 = (AbstractDoubleMatrix2D)
			matrix.like2D(matrix.rows(), matrix.columns());
		matrix2.assign(matrix);
		System.out.println(matrix);
		System.out.println(matrix2);
		assertEquals("matrix == matrix2", matrix, matrix2);
	}
}