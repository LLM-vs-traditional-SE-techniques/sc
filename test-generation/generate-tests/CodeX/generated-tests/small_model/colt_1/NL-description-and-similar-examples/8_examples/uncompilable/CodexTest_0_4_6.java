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


public class CodexTest_0_4_6 { 
  @Test
  public void testAssign() {
    double[] data = {1,2,3,4,5,6};
    DoubleMatrix1D other = new DenseDoubleMatrix1D(data);
    double[] otherData = {8,9,10,11,12,13};
    DoubleMatrix1D other2 = new DenseDoubleMatrix1D(otherData);
    DenseDoubleMatrix1D a = new DenseDoubleMatrix1D(6);
    a.assign(other);
    assertEquals(a.get(0), 8, 0);
    assertEquals(a.get(1), 9, 0);
    assertEquals(a.get(2), 10, 0);
    assertEquals(a.get(3), 11, 0);
    assertEquals(a.get(4), 12, 0);
    assertEquals(a.get(5), 13,
}