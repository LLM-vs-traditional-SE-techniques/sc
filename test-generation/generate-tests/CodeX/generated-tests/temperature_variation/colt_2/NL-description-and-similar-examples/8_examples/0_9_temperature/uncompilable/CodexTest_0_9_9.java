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


public class CodexTest_0_9_9 { 
  @Test
    public static void doubleTest2() {
        double[][] arrMatrix = {{1, 2, 3},
				{2, 3, 4}};
        DoubleFactory2D f = DoubleFactory2D.dense;
        double[][] arrMatrix1 = {{1, 2, 3},
			{2, 3, 4},
			{3, 4, 5}};
			double[][] arrMatrix2 = {{1, 2, 3},
			{2, 3, 4},
			{3, 4, 5}};
			//with both DoubleMatrix
			DoubleMatrix2D matrix = f.make(arrMatrix);
			DoubleMatrix2D matrix1 = f.make(arrMatrix1);
			DoubleMatrix2D matrix2 = f.make(arrMatrix2);
			DoubleMatrix2D a = matrix.like2D(matrix1.rows(),matrix2.columns());
			
			matrix.zMult(matrix1,a);
}