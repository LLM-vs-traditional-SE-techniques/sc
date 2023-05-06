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


public class CodexTest_0_8_23 { 
  @Test
  public void testAssign() {
    double[] data = new double[] { 3.0, 2.0, 1.0, 4.0, 5.0, 6.0, 7.0, 8., 9. };
    DoubleMatrix1D v1 = new DenseDoubleMatrix1D(data);
    DoubleMatrix1D v2 = new DenseDoubleMatrix1D(data.length);
    v2.assign(cern.jet.math.Functions.pow(2));
    v2.assign(v1, cern.jet.math.Functions.minus);
    v2.assign(cern.jet.math.Functions.abs);
    double[] result = {0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0., 0. };
    for (int i = 0; i < result.length; i++) {
      assertEquals("v2[" + i + "]", result[i], v2.getQuick(i), TOL);
    }
}