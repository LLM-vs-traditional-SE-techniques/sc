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


public class CodexTest_0_8_42 { 
  @Test
    public void testElementWiseDivide() {
		int n = 10;
		double[] origData = new double[n];
		// initialize data
		for (int i = 0; i < n; i++) {
			origData[i] = i;
		}
		// create a matrix with data
		DoubleMatrix1D m = new DenseDoubleMatrix1D(origData);
		double[] v = new double[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) {
			v[i] = r.nextDouble();
		}
		DoubleMatrix1D d = new DenseDoubleMatrix1D(v);
		DoubleMatrix1D mD = d.copy();
		m.assign(d, org.apache.commons.math3.special.Functions.chain(org.apache.commons.math3.special.Functions.div, org.apache.commons.math3.special.Functions.square));
}