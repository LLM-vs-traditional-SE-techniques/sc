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
    public void testSpecialFunction106() {
		DoubleMatrix2D x = new DenseDoubleMatrix2D(3,3);
		DoubleMatrix2D y = new DenseDoubleMatrix2D(3,3);
		DoubleMatrix2D res = new DenseDoubleMatrix2D(3,3);
		DoubleMatrix1D vector = new DenseDoubleMatrix1D(new double[]{1,2,3});
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				x.setQuick(i, j, 3);
				y.setQuick(i, j, 2);
			}
		}
		res = x.like2D(y.rows(),y.columns()).assign(x.zMult(vector,y,2,0,false));
		System.out.println(res);
	}
}