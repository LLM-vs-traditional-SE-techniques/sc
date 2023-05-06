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


public class CodexTest_0_8_40 { 
  @Test
    public void testSolveSparseSparseSparse() {
        int size = 10;
        Random r = new Random();
		//TODO Make SolveSparseSparseSparse		
        SparseDoubleMatrix2D A = new SparseDoubleMatrix2D(size, size, size);
        SparseDoubleMatrix2D x = new SparseDoubleMatrix2D(size, size);
        SparseDoubleMatrix2D b = new SparseDoubleMatrix2D(size, size);
        SparseDoubleMatrix2D y = new SparseDoubleMatrix2D(size, size);
        SparseDoubleMatrix2D z = new SparseDoubleMatrix2D(size, size);
        for (int indx = 0; indx < size; indx++) {
            for (int jndx = indx; jndx < size; jndx++) {
                A.set(indx, jndx, r.nextDouble());
                A.set(jndx, indx, A.get(indx, jndx));
            }
        }
        for (int indx = 0; indx < size; indx++) {
            for (int jndx = indx; jndx < size; jndx++) {
                b.set(indx, jndx, r.nextDouble());
                b.set(jndx, indx, b.get(indx, jndx));
            }
        }
}