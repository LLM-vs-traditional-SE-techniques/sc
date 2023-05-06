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


public class CodexTest_0_9_95 { 
  @Test
        public Test sparse() {
                int size = 3;
                int[] ai = {0,0,0,1,1,1,2,2,2};
                int[] aj = {0,1,2,0,1,2,0,1,2};
                double[] data = {1,2,3,4,5,6,7,8,9};
                DoubleMatrix2D A = new SparseDoubleMatrix2D(size,size,ai,aj,data,false,false,false);
                double[][] b = new double[size][size];
                A.toArray(b);
                check(new DenseDoubleMatrix2D(b));
}