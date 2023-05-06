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
    public void testDefaultSparse64_0() {
        double[] expected =
        {
            19.0, 0.0, 0.0, 0.0,
            23.0, 0.0, 0.0, 0.0,
            29.0, 0.0, 78.0, 0.0,
            31.0, 0.0, 0.0, 0.0,
            37.0, 0.0, 0.0, 0.0,
            41.0, 0.0, 0.0, 53.0,
            43.0, 0.0, 0.0, 0.0,
            47.0, 0.0, 0.0, 0.0
          };
        SparseDoubleMatrix2D A = new SparseDoubleMatrix2D(NROWS, NCOLUMNS);
}