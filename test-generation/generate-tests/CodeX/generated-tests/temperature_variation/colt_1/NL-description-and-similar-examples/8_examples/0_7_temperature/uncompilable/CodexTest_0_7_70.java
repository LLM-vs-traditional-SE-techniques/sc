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


public class CodexTest_0_7_70 { 
  @Test
  public void testAssign() {
		// this = 3*identity + 2*diagonal
		DoubleMatrix2D m = new DenseDoubleMatrix2D(2,2);
		double v = 1;
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				if (i==j) m.set(i,j,v);
				else m.set(i,j,v+1);
			}
		}
		DoubleMatrix2D m2 = m.copy();
		m2.assign(m, cern.jet.math.Functions.plus);
		assertEquals(new DenseDoubleMatrix2D(new double[][]{{3,4},{4,3}}), m2);
		m2.assign(m, cern.jet.math.Functions.mult);
		assertEquals(new DenseDoubleMatrix2D(new double[][]{{2,8},{8,2}}), m2);
		m2.assign(m, cern.jet.math.Functions.chain(cern.jet.math.Functions.mult,cern.jet.math.Functions.square));
		assertEquals(new DenseDoubleMatrix2D(new double[][]{{4,16},{16,4}}), m2);
	}
}