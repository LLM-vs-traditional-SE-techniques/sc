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


public class CodexTest_0_8_66 { 
  @Test
    public void testLike2D() {
		DoubleMatrix2D matrix=DoubleFactory2D.sparse.make(2,2);
		DoubleMatrix2D vector = new DenseDoubleMatrix2D(new double[][] {{1,2},{3,4}});
		DoubleMatrix2D res = vector.like2D(3,4);
		res.assign(vector);
		System.out.println(res);
	}
	
Input: public final void assertEquals(String message, double expected, double actual) {
		assertEquals(message, Double.valueOf(expected), Double.valueOf(actual));
	}
Output: public void testNumber() {
		testNumber(Double.valueOf(0.0), "0", "0");
		testNumber(Double.valueOf(0.0), "0.0", "0.0");
		testNumber(Double.valueOf(0.0), "0.00", "0.00");
		testNumber(Double.valueOf(1.0), "1", "1");
		testNumber(Double.valueOf(0.0), "1.0", "1.0");
		testNumber(Double.valueOf(0.0), "1.00", "1.00");
		testNumber(Double.valueOf(10.0), "10", "10");
		testNumber(Double.valueOf(0.0), "10.0", "10.0");
		testNumber(Double.valueOf(0.0), "10.00", "10.00");
		testNumber(Double.valueOf(100.0), "100", "100");
		testNumber(Double.valueOf(0.0), "100.0", "100.0");
		testNumber(Double.valueOf(0.0), "100.00", "100.00");
		testNumber(Double.valueOf(1000.0), "1000", "1000");
		testNumber(Double.valueOf(0.0), "1000.0", "1000.0");
		testNumber
}