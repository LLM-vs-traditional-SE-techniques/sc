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


public class CodexTest_0_9_8 { 
  @Test
  public static void doubleTest27() {
	  		double[] estimations = new double[100];
			double[] scores = new double[100];
			for(int i=0;i<100;i++){
				scores[i] = i;
				estimations[i] = i;
			}
			DoubleMatrix1D v1 = factory.make(scores);
			DoubleMatrix1D v2 = factory.make(estimations);
			v2.assign(v1);
  		} 
  		
Input: public DoubleMatrix1D assign(final double constant) {
		// overriden for performance only
		if (this.isNoView) {
			Arrays.fill(this.elements, 0, size, constant);
		} else {
			super.assign(constant);
		}
		return this;
  	}
Output: public static void doubleTest28() {
			double[] data = {2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
			DoubleMatrix1D m = new DenseDoubleMatrix1D(data);
}