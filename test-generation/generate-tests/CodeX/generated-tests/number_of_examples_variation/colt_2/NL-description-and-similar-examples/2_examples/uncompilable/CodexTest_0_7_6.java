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


public class CodexTest_0_7_6 { 
  @Test
   public static void doubleTest29() {
		DoubleMatrix2D matrix1= new DenseDoubleMatrix2D(3,3);
		DoubleMatrix2D matrix2= new DenseDoubleMatrix2D(3,3);
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				matrix1.set(i,j,i);
			}
		}
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 3; j++) {
				matrix2.set(i,j,j);
			}
		}
		matrix1.assign(matrix2, org.apache.mahout.math.function.Functions.toDouble(1));
		System.out.println(matrix1);
		matrix1.assign(matrix2, org.apache.mahout.math.function.Functions.toDouble(0));
		System.out.println(matrix1);
		matrix1.assign(matrix2, org.apache.mahout.math.function.Functions.toDouble
}