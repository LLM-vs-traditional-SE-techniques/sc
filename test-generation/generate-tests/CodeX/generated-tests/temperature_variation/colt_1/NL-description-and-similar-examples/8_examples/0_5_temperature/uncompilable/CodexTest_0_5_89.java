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


public class CodexTest_0_5_89 { 
  @Test
  public static void testAssign() {
    System.out.println("testAssign");
    DoubleFactory1D F = DoubleFactory1D.dense;
    DoubleMatrix1D A = F.make(new double[] {1,2,3,4,5,6,7,8,9,10});
    DoubleMatrix1D B = F.make(new double[] {10,20,30,40,50,60,70,80,90,100});
    DoubleMatrix1D C = F.make(new double[] {1,2,3,4,5,6,7,8,9,10});
    DoubleMatrix1D D = F.make(new double[] {1,2,3,4,5,6,7,8,9,10});
}