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


public class CodexTest_0_9_60 { 
  @Test
    public static void doubleTest18() {
        double[][] arrMatrix = 
        { 
            { 1, 2, 3, 4},
            { 2, 3, 4, 5},
            { 3, 4, 5, 6}
        };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix2D matrix = f.make(arrMatrix);
        matrix.like2D(2,5);
    }
    
Input: public DoubleMatrix2D like2D(int rows, int columns) {
		return new DenseDoubleMatrix2D(rows,columns);
	}
Output:
    public static void doubleTest18() {
        double[][] arrMatrix = 
        { 
            { 1, 2, 3, 4},
            { 2, 3, 4, 5},
            { 3, 4, 5, 6}
        };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix2D matrix = f.make(arrMatrix);
        matrix.like2D(3,5);
    }
    
Input: public static int count(InputStream is) throws IOException {
		return new CountingInputStream(is).getCount();
	  }
Output: public void testCountingIsIfRequested() throws IOException {
        long count = CountingInputStream.count(new ByteArrayInputStream(new byte[1024]));
        assertEquals(1024, count);
    }
}