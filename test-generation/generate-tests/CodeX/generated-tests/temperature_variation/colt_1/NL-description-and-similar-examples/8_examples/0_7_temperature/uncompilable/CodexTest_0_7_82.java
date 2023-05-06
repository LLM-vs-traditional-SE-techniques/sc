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


public class CodexTest_0_7_82 { 
   @Test
   public void testDefaultAssignMatrix() {
      DoubleMatrix2D a = new DenseDoubleMatrix2D(SIZE,SIZE);
      DoubleMatrix2D b = new DenseDoubleMatrix2D(SIZE,SIZE);
      for (int row=SIZE; --row >= 0;) {
         for (int col=SIZE; --col >= 0;) {
            a.set(row,col,Math.random());
            b.set(row,col,Math.random());
         }
      }
      a.assign(b);
      assertEquals(b,a);
   }
}