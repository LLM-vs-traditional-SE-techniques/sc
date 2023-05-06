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


public class CodexTest_0_9_75 { 
  @Test
   public void testBasic() {
        DoubleMatrix2D mat = DoubleFactory2D.dense.make(new double[][] {{1, 2}, {3, 4}});
        DoubleMatrix2D mat1 = new DenseDoubleMatrix2D(2, 2);
        assertEquals(mat.rows(), 2);
        assertEquals(mat.columns(), 2);
        assertEquals(mat.cardinality(), 4);
        assertEquals(mat1.rows(), 2);
        assertEquals(mat1.columns(), 2);
        assertEquals(mat1.cardinality(), 4);
    }
}