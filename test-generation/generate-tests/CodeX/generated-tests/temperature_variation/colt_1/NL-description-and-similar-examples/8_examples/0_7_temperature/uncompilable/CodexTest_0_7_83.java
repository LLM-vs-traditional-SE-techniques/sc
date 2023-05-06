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


public class CodexTest_0_7_83 { 
  @Test
  public void testSetDouble() {
    double v1 = random.nextDouble();
    double v2 = random.nextDouble();
    double v3 = random.nextDouble();
    double v4 = random.nextDouble();
    long v5 = random.nextLong();
    long v6 = random.nextLong();
    long v7 = random.nextLong();
    long v8 = random.nextLong();
    double[] doubles = {v1, v2};
    LongsRef result = set(new LongsRef(), 0, doubles);
    assertEquals(0, result.offset);
    assertEquals(2, result.length);
    assertEquals(v1, result.longs[0]);
    assertEquals(v2, result.longs[1]);
    long[] longs = {v5, v6, v7, v8};
    result = set(new LongsRef(), 2, longs);
    assertEquals(2, result.offset);
    assertEquals(4, result.length);
    assertEquals(v5, result.longs[0]);
    assertEquals(v6, result.longs[1]);
    assertEquals(v7, result.longs[2]);
    assertEquals(v8, result.longs[3]);
    result = set(new LongsRef(), 0, doubles, 1, 1);
    assertEquals(0, result.offset);
    assertEquals(1, result.length);
    assertEquals(v2, result.longs[0]);
    result = set(new LongsRef(), 1, longs, 1, 2);
    assertEquals(1, result.offset);
    assertEquals(2, result.length);
    assertEquals(v6, result.longs[0]);
    assertEquals(v7, result.longs[1]);
  }
}