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


public class CodexTest_0_9_24 { 
  @Test
    public static void testConstructor()
	{
		DoubleMatrix2D matrix1 = factory.make(testData);
		DoubleMatrix2D matrix2 = factory.make(testData, 4);
		for (int r = 0; r < matrix1.rows(); r++) {
			for (int c = 0; c < matrix1.columns(); c++) {
				TestUtils.assertEquals("matrix2[" + r + "][" + c + "]", matrix1.get(r,c), matrix2.get(r,c), normTolerance);
			}
		}   
	}
}