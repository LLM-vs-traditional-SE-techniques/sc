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


public class CodexTest_0_6_29 { 
  @Test
        public void testLike2D() {
            DoubleMatrix2D a = cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra.DEFAULT.identity(3);
            DoubleMatrix2D b = cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra.DEFAULT.identity(3);
            DoubleMatrix2D c = cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra.DEFAULT.identity(3);
            DoubleMatrix2D d = cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra.DEFAULT.identity(3);
            DoubleMatrix2D e = cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra.DEFAULT.identity(3);
            DoubleMatrix2D f = cern.colt.matrix.tdouble.algo.DenseDoubleAlgebra.DEFAULT.identity(3);
}