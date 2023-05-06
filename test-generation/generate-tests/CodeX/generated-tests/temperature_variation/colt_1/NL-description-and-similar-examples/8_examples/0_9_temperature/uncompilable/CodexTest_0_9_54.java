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


public class CodexTest_0_9_54 { 
  @Test
    public static void test24() {
          double[][] values = { {1, 1, 0}, {0, 1, 1}};
          DoubleFactory2D factory = DoubleFactory2D.dense;
  
          DoubleMatrix2D A = factory.make(values);
          DoubleMatrix2D B = A.copy();
  
          DoubleMatrix1D x = factory.column(A, 2);
          DoubleMatrix1D y = factory.column(B, 2);
          A.viewColumn(2).assign(y);
  
          System.out.println(x);
          System.out.println(B);
          System.out.println(A);
      }
}