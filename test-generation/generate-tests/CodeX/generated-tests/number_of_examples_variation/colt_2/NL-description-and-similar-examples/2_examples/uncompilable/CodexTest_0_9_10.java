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


public class CodexTest_0_9_10 { 
  @Test
    	// test of like2D method
    	public static void doubleTest5() {
			double[][] elements = {{1.0,2.0,3.0},{3.0,5.0,6.0}};
			DoubleFactory2D factory = DoubleFactory2D.dense;
			DoubleMatrix2D matrix = factory.make(elements);
			DoubleMatrix2D result = matrix.like2D(matrix.slices(), matrix.rows());
			System.out.println("first matrix:");
			System.out.println("matrix rows = " + matrix.rows());
			System.out.println("matrix columns = " + matrix.columns() + "\n");
			System.out.println(matrix);
			System.out.println("new matrix:");
			System.out.println("matrix rows = " + result.rows());
			System.out.println("matrix columns = " + result.columns());
		}
}