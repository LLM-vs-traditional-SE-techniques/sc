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


public class CodexTest_0_9_66 { 
  @Test
    public void testDenseDoubleMatrix2D() {
        double[][] values = new double[][]{{1, 2, 3}, {4, 5, 6}, {1, 2, 3}, {4, 5, 6}};
        DenseDoubleMatrix2D matrix = new DenseDoubleMatrix2D(values);
        assertArrayEquals(new double[]{1, 2, 3}, matrix.getRow(1), 0);
        assertArrayEquals(new double[]{1, 5}, matrix.getRow(1, 2, 1, 2));
        assertArrayEquals(new double[]{1, 4}, matrix.getColumn(2, 3, 0, 2));
        matrix.setQuick(1, 1, 7);
        assertArrayEquals(new double[]{1, 7, 3}, matrix.getRow(1), 0);
        matrix.setQuick(0, 1, 3);
        assertArrayEquals(new double[]{3}, matrix.getRow(0, 0, 1, 1));
    }
}