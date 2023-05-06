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
  	public void testDoubleMatrix2Dlike2D() {
		double[] data={1,2,3,4,5,6};
		double[][] arrMatrix = 
		{ 
			{ 1, 2, 3, 4, 5, 6},
			{ 2, 3, 4, 5, 6, 7}
		};
		DoubleFactory2D f = DoubleFactory2D.dense;
		DoubleMatrix2D m = f.make(arrMatrix);
		DenseDoubleMatrix2D matrix = (DenseDoubleMatrix2D) m.like2D(2,3);
		for (int i = 0; i < matrix.rows(); i++){
			for (int j=0; j<matrix.columns(); j++)
				assertEquals(matrix.get(i,j),0,0);
		}
	}
}