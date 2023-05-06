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


public class CodexTest_0_8_10 { 
  @Test
	public void testCopy() {
		DoubleMatrix2D m1 = DoubleFactory2D.dense.make(2, 2, -1);
		DoubleMatrix2D m2 = DoubleFactory2D.dense.make(3, 3, -1);
		m2.setQuick(1, 1, m1.getQuick(0, 0)); // m2(2,2) = -1
		m2.viewPart(1, 1, 2, 2).assign(m1);
		if (m2.getQuick(1, 1) != -1)
			throw new RuntimeException();
		if (m2.getQuick(1, 2) != -1)
			throw new RuntimeException();
		if (m2.getQuick(2, 1) != -1)
			throw new RuntimeException();
		if (m2.getQuick(2, 2) != -1)
			throw new RuntimeException();
	}
    
Input:
	public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: 
	@Test
	public void testAggregate() {
		DoubleMatrix2D m = DoubleFactory2D.dense.make(3, 3, -1);
		double sum = m.aggregate(DoubleFunctions.plus, DoubleFunctions.square);
		double expected = (m.rows() * m.columns() * -1) * (-1);
		if (sum != expected)
			throw new RuntimeException();
	}

}