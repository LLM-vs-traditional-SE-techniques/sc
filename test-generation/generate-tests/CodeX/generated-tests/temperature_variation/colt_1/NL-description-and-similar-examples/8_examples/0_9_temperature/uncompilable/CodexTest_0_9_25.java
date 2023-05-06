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


public class CodexTest_0_9_25 { 
  @Test
  public static void assign15() {
		double[] avals = {1,2,3,4,5,6};
		double[] bvals = {0,1,2,3,4,5};
		double[] cvals = {5,6,2,3,5,6};
		double[] dvals = {0,1,1,1,1,1};
		int n=avals.length;
		DenseDoubleMatrix1D A = new DenseDoubleMatrix1D(n, avals);
		DenseDoubleMatrix1D B = new DenseDoubleMatrix1D(n, bvals);
		DenseDoubleMatrix1D C = new DenseDoubleMatrix1D(n, cvals);
		DenseDoubleMatrix1D D = new DenseDoubleMatrix1D(n, dvals);
		// apply a function to two matrices
		A.assign(B,
			new cern.colt.function.DoubleDoubleFunction(){
				public double apply(double x,double y) { return java.lang.Math.pow(x,y); }
			});
}