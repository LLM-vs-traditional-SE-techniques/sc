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


public class CodexTest_0_8_10 { 
  @Test
  public void test3() {
		double[] data = {2, 1, 4};
		DoubleMatrix1D d1 = new DenseDoubleMatrix1D(data);
		DoubleMatrix1D d2 = new DenseDoubleMatrix1D(data);
		DoubleFactory2D f2 = DoubleFactory2D.dense;
		DoubleMatrix2D mat = f2.make(3,3);
		mat.assign(
			new DoubleFunction() {
				public final double apply(double element) {
					return 1;
				}
			}
		);
		double[] res = new double[3];
		mat.zMult(d1,d2,3,3,false,false);
		System.out.println(d2);
}
}