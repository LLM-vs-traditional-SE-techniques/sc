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


public class CodexTest_0_4_3 { 
  @Test
    public void testLike2D() {
			DoubleMatrix2D matrix = new DenseDoubleMatrix2D(2,2);
			matrix.set(0,0,1);
			matrix.set(0,1,2);
			matrix.set(1,0,3);
			matrix.set(1,1,4);
			
			DoubleMatrix2D matrix2 = new DenseDoubleMatrix2D(2,2);
			matrix2.set(0,0,5);
			matrix2.set(0,1,6);
			matrix2.set(1,0,7);
			matrix2.set(1,1,8);
			
			DoubleMatrix2D matrix3 = matrix.like2D(2,2);
			matrix3.set(0,0,1);
			matrix3.set(0,1,2);
			matrix3.set(1,0,3);
			matrix3.set(1,1,4);
			matrix3.set(2,0,5);
			matrix3.set(2,1,6);
			
			DoubleMatrix2D matrix4 = matrix.like2D(2,2);
			matrix4.set(0,0,1);
			matrix4.set(0,1,2);
			matrix4.set(1,0,3);
			matrix4.set(1,1,4);
			matrix4.set(2,0,5);
			matrix4.set(2,1,6);
			
			assertEquals(matrix3,matrix4);
		}
}