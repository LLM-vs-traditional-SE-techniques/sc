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


public class CodexTest_0_9_95 { 
  @Test
     public static void booleanTest2() {
        boolean[][] data = {{true},{false}};
        BooleanMatrix2D matrix = new DenseBooleanMatrix2D(data);
        boolean[] vector = new boolean[]{false,true};
        vector =  matrix.zMult(vector,new boolean[2]);
        System.out.println(vector);
    }
    
Input: public static <T> T[] toArray(Collection<T> c) {
		return c.toArray(zeroLengthObjectArray);
	}
Output: public void testToArrayIntArray() {
			ArrayIntList list = new ArrayIntList();
			for (int i = 0; i < 10; i++) {
				list.add(i);
			}
			int[] array = list.toArray();
			assertEquals(10, array.length);
			for (int i = 0; i < 10; i++) {
				assertEquals(i, array[i]);
			}
		}
}