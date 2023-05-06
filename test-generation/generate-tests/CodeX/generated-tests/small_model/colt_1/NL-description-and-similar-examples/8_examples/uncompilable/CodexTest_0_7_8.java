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


public class CodexTest_0_7_8 { 
  @Test
  public void testCopyConstructor() {
    DenseDoubleMatrix1D a = new DenseDoubleMatrix1D(2);
    a.setQuick(0, 2.3);
    a.setQuick(1, 1.2);
    DenseDoubleMatrix1D b = new DenseDoubleMatrix1D(a);
    assertEquals("b.getElement(0)=", 2.3, b.getElement(0));
    assertEquals("b.getElement(1)=", 1.2, b.getElement(1));
    assertThat("b.get(0)=", b.get(0), is(2.3));
    assertThat("b.get(1)=", b.get(1), is(1.2));
    assertThat("b.getQuick(0)=", b.getQuick(0), is(2.3));
    assertThat("b.getQuick
}