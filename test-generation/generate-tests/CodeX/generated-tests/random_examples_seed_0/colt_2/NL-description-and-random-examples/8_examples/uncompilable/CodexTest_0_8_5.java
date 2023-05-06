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


public class CodexTest_0_8_5 { 
    public void testLike2DWithEmptyMatrix() {
        // Arrange
        DoubleMatrix2D input = new SparseDoubleMatrix2D(0, 0);
        // Act
        DoubleMatrix2D actual = input.like2D(3, 3);
        // Assert
        Assert.assertEquals(3L, actual.rows());
        Assert.assertEquals(3L, actual.columns());
    }
    
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: @Test
    public void testLike2DWithFilledMatrix() {
        // Arrange
        DoubleMatrix2D input = new SparseDoubleMatrix2D(3, 3);
        // Act
        DoubleMatrix2D actual = input.like2D(1, 1);
        // Assert
        Assert.assertEquals(1L, actual.rows());
        Assert.assertEquals(1L, actual.columns());
    }
    
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output: @Test
    public void testLike2DWithNullMatrix() {
        // Arrange
        DoubleMatrix2D input = null;
        // Act
        DoubleMatrix2D actual = input.like2D(2, 2);
        // Assert
        Assert.assertEquals(2L, actual.rows());
        Assert.assertEquals(2L, actual.columns());
    }
}