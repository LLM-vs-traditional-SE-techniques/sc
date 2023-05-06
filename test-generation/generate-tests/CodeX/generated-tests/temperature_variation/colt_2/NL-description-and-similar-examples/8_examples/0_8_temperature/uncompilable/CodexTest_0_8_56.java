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


public class CodexTest_0_8_56 { 
  @Test
  public void test45() {
      DoubleMatrix2D m4 = new DenseDoubleMatrix2D(2, 2);
      DoubleMatrix2D m5 = new DenseDoubleMatrix2D(3, 2);
      DoubleMatrix2D m6 = new DenseDoubleMatrix2D(2, 3);
      DoubleFactory2D f = DoubleFactory2D.dense;
      DoubleMatrix2D res = m4.like2D(m5.rows(), m6.columns());
      DoubleMatrix2D expected = f.make(2, 3);
      m4.zMult(m5, m6, res);
      Assert.assertEquals(expected, res);
  }
 
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: public void test46() {
      DoubleMatrix2D m4 = new DenseDoubleMatrix2D(2, 2);
      DoubleMatrix2D m5 = new DenseDoubleMatrix2D(2, 3);
      DoubleMatrix2D m6 = new DenseDoubleMatrix2D(3, 2);
      DoubleMatrix2D res = m4.like2D(m5.rows(), m6.columns());
      DoubleMatrix2D expected = new SparseDoubleMatrix2D(2, 2);
      m4.zMult(m5, m6, res);
      Assert.assertEquals(expected, res);
  }
 
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: public void test47() {
      DoubleMatrix2D m1 = new DenseDoubleMatrix2D(new double[][] { { 1, 2, 3 }, { 4, 5, 6 } });
      DoubleMatrix2D m2 = new DenseDoubleMatrix2D(new double[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } });
      DoubleMatrix2D m3 = new DenseDoubleMatrix2D(new double
}