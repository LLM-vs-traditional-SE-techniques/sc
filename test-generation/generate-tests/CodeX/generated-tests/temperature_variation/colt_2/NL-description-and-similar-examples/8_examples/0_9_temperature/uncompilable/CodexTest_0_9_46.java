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


public class CodexTest_0_9_46 { 
  @Test
    public void doubleTest1() {
        final int rows = 3;
        final int columns = 4;
        final DoubleMatrix2D doubleMatrix0 = new DenseDoubleMatrix2D(rows, columns);
        final double double0 = 1.5078121992647835;
        final double double1 = 4.280651226118763;
        final double[] doubleArray0 = new double[0];
        final int int0 = 15;
        final double double2 = 1.5078121992647835;
        final int int1 = 3;
        final double double3 = 2.5;
        doubleMatrix0.viewDiagonal().assign(double0);
        doubleMatrix0.set(0, 0, double1);
        // Undeclared exception!
        try {
            doubleMatrix0.like2D(doubleArray0, int0);
            fail("Expecting exception: ArrayIndexOutOfBoundsException");
}