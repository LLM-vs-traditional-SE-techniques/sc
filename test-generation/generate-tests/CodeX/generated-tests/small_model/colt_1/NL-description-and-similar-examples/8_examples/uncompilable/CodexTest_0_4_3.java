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


public class CodexTest_0_4_3 { 
  @Test
    public static void testGet() {
        int[] data = {1,2,3,4,5,6};
        int[] data2 = {2,3,4,5,6,7};
        AlgVector v = new AlgVector(data);
        AlgVector v2 = new AlgVector(data2);
        assertEquals("0.0", 1, v.get(0));
        assertEquals("1.0", 2, v.get(1));
        assertEquals("2.0", 3, v.get(2));
        assertEquals("3.0", 4, v.get(3));
        assertEquals("4.0", 5, v.get(4));
        assertEquals("5.0", 6, v.get(5));
        assertEquals("6.0", 7, v2.get(6));
        assertEquals("7.
}