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


public class CodexTest_0_6_25 { 
  @Test
    public void testAssign() {
        DoubleMatrix2D a = doubleFactory2D.make(new double[][] {{1,2,3},{4,5,6},{7,8,9}});
        DoubleMatrix2D b = doubleFactory2D.make(new double[][] {{1,2,3},{4,0,0},{7,8,9}});
        DoubleMatrix2D c = doubleFactory2D.make(new double[][] {{0,2,3},{4,0,0},{7,0,9}});
        DoubleMatrix2D d = doubleFactory2D.make(new double[][] {{0,0,3},{4,0,0},{0,0,0}});
        DoubleMatrix2D e = doubleFactory2D.make(new double[][] {{0,0,0},{0,0,0},{0,0,0}});
}