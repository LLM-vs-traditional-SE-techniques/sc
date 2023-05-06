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


public class CodexTest_0_8_2 { 
  @Test
        // add test code here
        public static void main(String[] args)
        {
            // add test code here
			double[] dataset={1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.1,1.1};
			DenseDoubleMatrix1D vector = new DenseDoubleMatrix1D(dataset);
			DoubleMatrix1D matrix = vector.assign(vector);
			System.out.println(matrix);
        }
	
Input: public int index(int rank) {
			return offset + stride * rank; // row-major
		}
Output: public static void testIndex() {
			int[] data = {1, 2, 3, 4, 5, 6};
			IntMatrix1D v = new EJMLIntMatrix1D(data);
			assertEquals(0, v.index(0));
			assertEquals(1, v.index(1));
			assertEquals(2, v.index(2));
			assertEquals(3, v.index(3));
			assertEquals(4, v.index(4));
			
}