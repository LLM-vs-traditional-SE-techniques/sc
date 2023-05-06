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


public class CodexTest_0_9_19 { 
  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void test_goto_LastStart_F2L() {
    final MultidimDoubleArray m = MultidimDoubleArray.createDoubleArray(
            MultidimDoubleArrayTest.RAW_DATA_3D);
    final int totalDimensions = m.totalDimensions();
    for (int d = 0; d < totalDimensions; d++) {
      m.gotoLastStart(d);
    }
    // test the same dimension 2 times in a row to catch the faulty case
    // first the faulty case
    m.gotoLastStart(2);
    // and the next index
    m.gotoLastStart(2);
  }
}