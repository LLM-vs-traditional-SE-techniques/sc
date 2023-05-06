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


public class CodexTest_0_9_4 { 
  @Test
    public static void doubleTest28() {
    double[] data={1,2,3,4,5,6};
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7}
			};
    DoubleMatrix2D f = DoubleFactory2D.dense.like2D(2, 3);
    assertEquals(new DenseDoubleMatrix2D(arrMatrix), f);
		}
        
Input:   public int getBits(int pos, int length, int bitsPerValue) {
        if (bitsPerValue == 8) {
            return get8Bits(pos, length);
        }
        if (bitsPerValue == 16) {
            return get16Bits(pos, length);
        }
        if (bitsPerValue == 32) {
            return get32Bits(pos, length);
        }
        if (bitsPerValue == 64) {
            return (int) get64Bits(pos, length);
        }
        throw new IndexOutOfBoundsException("Can index 8, 16, 32 and 64 bit values only");
    }
Output: public void testTooManyBitsTaken() {
    	FixedBitSet set = new FixedBitSet(12);
        set.set(0, 2);
        set.set(12);
        assertEquals(FixedBitSet.getBits(set, 0, 100, 12) , 0);
        assertEquals(FixedBitSet.getBits(set, 100, 100, 12) , 0);
    }
}