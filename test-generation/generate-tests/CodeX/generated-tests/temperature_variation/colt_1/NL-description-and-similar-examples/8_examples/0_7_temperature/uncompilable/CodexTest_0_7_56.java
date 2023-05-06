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


public class CodexTest_0_7_56 { 
  @Test
    public void testAssignDoubleMatrix1DDoubleFunction() {
    DoubleMatrix1D a = new DenseDoubleMatrix1D(SIZE);
    for (int i = 0; i < SIZE; i++) {
      a.set(i,Math.random());
    }
    DoubleMatrix1D b = new DenseDoubleMatrix1D(SIZE);
    b.assign(a,com.cern.jet.math.Functions.chain(com.cern.jet.math.Functions.tan, com.cern.jet.math.Functions.sqrt));
    for (int i = 0; i < SIZE; i++) {
      assertEquals(Math.sqrt(Math.tan(a.get(i))), b.get(i), TOL);
    }
  }
}