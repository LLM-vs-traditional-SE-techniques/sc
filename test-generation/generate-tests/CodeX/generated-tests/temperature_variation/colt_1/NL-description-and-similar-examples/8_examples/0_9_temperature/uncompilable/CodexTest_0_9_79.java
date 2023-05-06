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


public class CodexTest_0_9_79 { 
  @Test
    public void testMult() {
        magicMat = Utils.TestUtilities.magic(nrow);
        dense = new SimpleMatrix(magicMat);
        int[] index = new int[nrow];
        rowA = new int[nrow-1];
        rowB = new int[nrow-1];
        for (int i = 0; i < nrow; ++i) {
            index[i]=i;
        }
        for (int i : index) {
            rowA[i] = i;
        }
        for (int i = 0; i < nrow-1; ++i) {
            rowB[i] = i;
        }
        colA = new int[nrow-1];
        colB = new int[nrow-1];
        for (int i = 0; i < nrow-1; ++i) {
            colA[i] = i;
        }
        for (int i = 0; i < nrow-1; ++i) {
            colB[i] = i+1;
        }
}