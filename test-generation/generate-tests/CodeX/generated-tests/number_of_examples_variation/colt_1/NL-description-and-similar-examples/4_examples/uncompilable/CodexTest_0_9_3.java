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


public class CodexTest_0_9_3 { 
  @Test
        public static HepVector assignVectors(HepVector aVec1, HepVector aVec2) {
   if (aVec1 == null || aVec2 == null)
     throw new IllegalStateException(" Two vectors are NULL ");
   if (aVec1.size() != aVec2.size())
     throw new IllegalStateException(
       " Must assign two vectors of the same dimension ! ");
   int vec1Size = aVec1.size();
   for (int i = 0; i < vec1Size; i++) {
     aVec1.setElement(i, aVec2.e(i));
   }
   return aVec1;
 }
 
Suggest a test for a method with the double aggregate(DoubleDoubleFunction aggr, DoubleFunction f) signature.
Input:	public double aggregate(DoubleDoubleFunction aggr, DoubleFunction f) {
		if (size == 0) throw new IllegalArgumentException("size==0");
		double a = 0;
		int nthreads = ConcurrencyUtils.getNumberOfThreads();
		if ((nthreads > 1) && (size >= ConcurrencyUtils.getThreadsBeginN_1D())) {
			nthreads = Math.min(nthreads, size);
			Future<?>[] futures = new Future[nthreads];
			int k = size/nthreads;
			for (int j = 0; j < nthreads; j++) {
				final int firstIdx = j*k;
				final int lastIdx = (j == nthreads-1) ? size : firstIdx + k;
				futures[j] = ConcurrencyUtils.submit(new Callable<Double>() {
					public Double call() throws Exception {
						double a = f.apply(getQuick(firstIdx));
						double elem;
						for (int i = firstIdx + 1; i < lastIdx; i++) {

}