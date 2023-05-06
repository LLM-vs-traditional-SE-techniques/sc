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


public class CodexTest_0_9_2 { 
  @Test
    public void doubleTest25() {
        int numRows = 3 + generator.nextInt(3);
        int numColumns = 3 + generator.nextInt(3);
        int numColumnsGrown = generateGrowth(numColumns);
        DoubleMatrix1D[] original = new DoubleMatrix1D[numColumns];
        for (int i = 0; i < numColumns; i++) {
            original[i] = new DenseDoubleMatrix1D(numRows);
        }
        DoubleMatrix2D A = new DenseColumnDoubleMatrix2D(numRows, numColumns);
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                A.setQuick(i, j, Math.random());
            }
        }
        DoubleMatrix2D Acopy = A.copy();
        DoubleMatrix2D B = A.like2D(numRows, numColumnsGrown);
        int minNumColumns = Math.min(numColumns, numColumnsGrown);
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < minNumColumns; j++) {
                B.setQuick(i, j, Math.random());
            }
        }
        DoubleMatrix2D Bcopy = B.copy();
        A.assign(B);
        DoubleMatrix2D dense = new DenseDoubleMatrix2D(numRows, numColumnsGrown);
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < minNumColumns; j++) {
                dense.setQuick(i, j, Math.random());
            }
        }
        DoubleMatrix2D BOrigCopy = dense.copy();
        for (int i = 0; i < B.rows(); i++) {
            for (int j = 0; j < B.columns(); j++) {
                assertEquals(BOrigCopy.getQuick(i, j),B.getQuick(i, j), TOL
}