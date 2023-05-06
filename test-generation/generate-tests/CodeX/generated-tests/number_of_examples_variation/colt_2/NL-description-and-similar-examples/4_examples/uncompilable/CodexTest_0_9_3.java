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


public class CodexTest_0_9_3 { 
  @Test
  public void testEmpty() {
		int rows = 2;
		int cols = 3;
		DoubleMatrix2D A = DoubleFactory2D.dense.make2D(rows, cols);
		DoubleMatrix2D B = DoubleFactory2D.dense.like2D(rows, cols);
		assertEquals(rows, B.rows());
		assertEquals(cols, B.columns());
		for (int i = 0; i < rows; i++)
		  for (int j = 0; j < cols; j++)
			assertEquals(0.0, B.getQuick(i, j), 0.00001);
		assertNotSame(B, A);
	}
    
Input: public void set(int row, int column, double value) {
			m_Elements[row * m_Cols + column] = value;
		  }
Output:
public void testSet(){
		int rows = 2;
		int cols = 3;
		double[][] elems = new double[rows][cols];
		for (int i = 0; i < rows; i++)
		  for (int j = 0; j < cols; j++)
			elems[i][j] = (double) ((i+1) * (j+1));
		AlgVector v   = new AlgVector(rows*cols);
		AlgMatrix m = new AlgMatrix(rows, cols);
}