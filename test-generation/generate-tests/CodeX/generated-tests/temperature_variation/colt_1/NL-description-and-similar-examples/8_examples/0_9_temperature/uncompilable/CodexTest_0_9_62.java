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


public class CodexTest_0_9_62 { 
    @Test
        public void testPutWithDifferentIndexes()
        {
            int dim = 5;
            IVector x = new SparseVector(dim);
            IVector y = new SparseVector(dim);
            x.set(0, 1.0);
            x.set(1, 2.0);
            x.set(3, 3.0);
                 x.put(x.nonZeros(), y);
                 assertEquals(5.0, y.get(2), 0.0001);
        }
Input: public DoubleMatrix2D forEachNonZero(DoubleIntIntFunction func) {
		if (size() == 0)
			return this;
			int s = this.stride();
		int nz = cardinality();
		int[] indexList = new int[nz];
		double[] valueList = new double[nz];
		final int zero = index(0);
		//assign all cells
		int nz_=0;
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				double r = elements[zero + i*s + j];
				if (r!=0) {
					valueList[nz_] = r;
					indexList[nz_] = zero + i*s + j;
					nz_++;
					elements[zero + i*s + j] = func.apply(r, i, j);
				}
			}
		}
		if (nz_!=nz)
			throw new RuntimeException("should never happen.");
		//restore previous values;
		for (int i=nz; --i >= 0; ) {
			elements[indexList[i]] = valueList[i];
			valueList[i] = 0; // attempt to reduce garbage (worthless, i know...)
		}
		return this;
	}
Output:
}