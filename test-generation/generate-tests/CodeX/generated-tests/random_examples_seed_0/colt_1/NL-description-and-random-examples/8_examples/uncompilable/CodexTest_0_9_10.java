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


public class CodexTest_0_9_10 { 
  @Test
    public void testAssignDoubleMatrix1DIntIntDenseDoubleMatrix1DIntInt() {
        double d = Math.random();
        double[] values = new double[shape[1]];
        for (int i = 0; i < shape[1]; i++) {
            values[i] = d;
        }
        DoubleMatrix1D source = new DenseDoubleMatrix1D(shape[1], values);
        DenseDoubleMatrix1D matrix = new DenseDoubleMatrix1D(rows, columns);
        matrix.assign(source, 0, size);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                assertEquals(d, matrix.getQuick(r, c), TOL);
            }
        }
    }
}