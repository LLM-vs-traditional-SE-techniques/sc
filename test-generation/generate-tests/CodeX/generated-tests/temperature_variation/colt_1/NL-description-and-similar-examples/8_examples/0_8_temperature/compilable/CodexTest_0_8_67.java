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


public class CodexTest_0_8_67 { 
  @Test
        public void testAssertEqualsByteArray() {
    byte[] arr = {10,20};
    byte[] arr2 = {10,20};
    byte[] arr3 = {30,40};
    byte[] arr4 = {10,20,30};
    //assertEquals
    assertEquals(arr, arr2);
    //assertNotEquals
    assertNotEquals(arr, arr3);
    //assertNotEquals(both null)
    assertNotEquals(null, null);
    //assertEquals(first null)
    assertNotEquals(arr, null);
    //assertEquals(second null)
    assertNotEquals(null, arr);
    //assertEquals(different length)
    assertNotEquals(arr, arr4);
}
}