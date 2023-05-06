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


public class CodexTest_0_6_2 { 
  @Test
    public void testLike2D() {
        DoubleMatrix2D a = factory.make(4, 2);
        DoubleMatrix2D b = a.like2D(2, 4);
        assertEquals(2, b.rows());
        assertEquals(4, b.columns());
    }
Input: public DoubleMatrix1D like1D(int size) {
		return new DenseDoubleMatrix1D(size);
	}
Output: public void testLike1D() {
        DoubleMatrix2D a = factory.make(4, 2);
        DoubleMatrix1D b = a.like1D(2);
        assertEquals(2, b.size());
    }
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: public void testLike2D() {
        DoubleMatrix2D a = factory.make(4, 2);
        DoubleMatrix2D b = a.like2D(2, 4);
        assertEquals(2, b.rows());
        assertEquals(4, b.columns());
    }
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: public void testLike2D() {
        DoubleMatrix2D a = factory.make(4, 2);
        DoubleMatrix2D b = a.like2D(2, 4);
        assertEquals(2, b.rows());
        assertEquals(4, b.columns());
    }
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: public void testLike2D() {
        DoubleMatrix2D a = factory.make(4, 2);
        DoubleMatrix2D b = a.like2D(2, 4);
        assertEquals(2, b.rows());
        assertEquals(4, b.columns());
    }
Input
}