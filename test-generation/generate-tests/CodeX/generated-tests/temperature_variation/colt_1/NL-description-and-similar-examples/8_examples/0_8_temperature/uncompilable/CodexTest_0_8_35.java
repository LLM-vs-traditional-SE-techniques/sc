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


public class CodexTest_0_8_35 { 
  @Test
    
Input: public double aggregate(final cern.colt.function.DoubleDoubleFunction aggr, final cern.colt.function.DoubleFunction f) {
		if (size==0) return Double.NaN;
		double a = 0;
		int nthreads = ConcurrencyUtils.getNumberOfThreads();
		if ((nthreads > 1) && (size >= ConcurrencyUtils.getThreadsBeginN_1D())) {
			nthreads = Math.min(nthreads, size);
			Future<?>[] futures = new Future[nthreads];
			Integer[] n = new Integer[nthreads];
			int k = size/nthreads;
			for (int j = 0; j < nthreads; j++) {
				n[j] = j*k;
				futures[j] = ConcurrencyUtils.submit(new Callable<Double>() {
					public Double call() throws Exception {
						double a = f.apply(getQuick(n[0]));
						double d;
						int last = (n[0]+k) < size ? (n[0]+k) : size;
						for (int i = n[0] + 1; i < last; i++) {
							d = f.apply(getQuick(i));
							a = aggr.apply(a, d);
						}
						return a;
					}
				});
			}
			a = ConcurrencyUtils.waitForCompletion(futures, aggr);
		} else {
			a = f.apply(getQuick(0));
			double d;
			for (int i = 1; i < size; i++) {
				d = f.apply(getQuick(i));
				a
}