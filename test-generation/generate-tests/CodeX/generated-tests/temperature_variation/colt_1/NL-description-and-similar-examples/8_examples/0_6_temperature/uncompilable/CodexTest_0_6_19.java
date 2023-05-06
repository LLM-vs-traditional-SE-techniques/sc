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


public class CodexTest_0_6_19 { 
  @Test
    public void testAssignDoubleMatrix1D() {
        cern.colt.matrix.tdouble.impl.DenseDoubleMatrix2D v = new cern.colt.matrix.tdouble.impl.DenseDoubleMatrix2D(NROWS, NCOLUMNS);
        cern.colt.matrix.tdouble.impl.DenseDoubleMatrix2D w = new cern.colt.matrix.tdouble.impl.DenseDoubleMatrix2D(NROWS, NCOLUMNS);
        for (int r = 0; r < NROWS; r++) {
            for (int c = 0; c < NCOLUMNS; c++) {
                double value = Math.random();
                v.setQuick(r, c, value);
                w.setQuick(r, c, value);
            }
        }
        cern.colt.matrix.tdouble.impl.DenseDoubleMatrix1D x = new cern.colt.matrix.tdouble.impl.DenseDoubleMatrix1D(NROWS * NCOLUMNS);
        x.assign(v);
        for (int r = 0; r < NROWS; r++) {
            for (int c = 0; c < NCOLUMNS; c++) {
                assertEquals(x.getQuick(r * NCOLUMNS + c), v.getQuick(r, c), TOL);
            }
        }
        cern.colt.matrix.tdouble.impl.DenseDoubleMatrix1D y = new cern.colt.matrix.tdouble.impl.DenseDoubleMatrix1D(NROWS * NCOLUMNS);
        y.assign(w);
        for (int r = 0; r < NROWS; r++) {
            for (int c = 0; c < NCOLUMNS; c++) {
                assertEquals(y.getQuick(r * NCOLUMNS + c), w.getQuick(r, c), TOL);
            }
        }
    }
}