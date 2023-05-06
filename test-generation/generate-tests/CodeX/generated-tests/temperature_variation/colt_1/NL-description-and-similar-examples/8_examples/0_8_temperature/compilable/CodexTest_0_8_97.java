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


public class CodexTest_0_8_97 { 
  @Test
         public static void main(String[] args) {
             int size = Integer.parseInt(args[0]);
             double[] x = new double[size];
             for (int i=x.length; --i >= 0; ) x[i] = 1.0;
             DoubleMatrix1D dx = new DenseDoubleMatrix1D(x);
             DoubleMatrix1D dy = new DenseDoubleMatrix1D(size);
             long t1 = System.currentTimeMillis();
             int n = Integer.parseInt(args[1]);
             for (int i=n; --i >= 0; ) dy.assign(dx);
             long t2 = System.currentTimeMillis();
             System.out.println(t2-t1);
         }
}