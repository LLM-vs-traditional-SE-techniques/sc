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


public class CodexTest_0_6_6 { 
  @Test
  public static void testMultiply() {
    double[] temp = new double[2];
    temp[0] = 2;
    temp[1] = 3;
    DoubleMatrix1D d1Double = new DenseDoubleMatrix1D(temp);
    double[] temp2 = new double[2];
    temp2[0] = 2;
    temp2[1] = 3;
    DoubleMatrix2D d2Double = new DenseDoubleMatrix2D(temp2);
    DoubleMatrix2D d3Double = d1Double.like2D(2,2);
    DoubleMatrix2D d4Double = d2Double.like2D(2,2);
    d3Double.assign(d1Double);
    d4Double.assign(d2Double);
    DoubleMatrix2D d5Double = d3Double.zMult(d4Double, null);
    System.out.println(d5Double);
  }

}