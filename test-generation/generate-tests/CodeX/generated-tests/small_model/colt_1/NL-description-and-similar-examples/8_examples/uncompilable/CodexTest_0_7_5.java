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


public class CodexTest_0_7_5 { 
  @Test
  public static void testAssign() {
			double[] array= {1,2,3,4,5,6};
			double[] array1= {3,3,3,3,3,3};
			double[] array2= {5,5,5,5,5,5};
			double[] array3= {7,7,7,7,7,7};
			final int size=6;
		DenseDoubleMatrix1D vector = new DenseDoubleMatrix1D(array);
			DenseDoubleMatrix1D vector1 = new DenseDoubleMatrix1D(array1);
			DenseDoubleMatrix1D vector2 = new DenseDoubleMatrix1D(array2);
			DenseDoubleMatrix1D vector3 = new DenseDoubleMatrix1D(array3);
			vector.assign(vector1);

}