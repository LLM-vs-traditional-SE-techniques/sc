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


public class CodexTest_0_9_70 { 
  @Test
    public void testComplexSubmatrix2() {
			printTestHeader("Test3,Complex.submatrix(false,subRows,subCols)");
			
			DoubleMatrix2D A = DoubleFactory2D.dense.identity(5);
			
			int[] rowIndexes = new int[] {0,2,4};
			int[] columnIndexes = new int[] {1,4};
			
			DoubleMatrix2D B = A.viewSelection(rowIndexes, columnIndexes).copy();
			B.set(0, 0, 0.0);
			B.set(1, 0, 0.0);
			B.set(2, 0, 0.0);
			
			B.assign(A.viewSelection(rowIndexes, columnIndexes));
			
			System.out.println("A");
			printMatrix(A);
			
			System.out.println("B");
			printMatrix(B);
		}
Input: public final int numElements() {
      return m_Elements.length;
  }
Output: public void testLengthConstructor() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    assertEquals("Length differs", len, v.numElements());
  }
}