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
    public void assign_1() {
        double[] values = new double[] {3.0, 2.0, 1.0, 0.0, -1.0, -2.0};
        int[] idx = new int[] {5, 4, 3, 2, 1, 0};
        DenseDoubleMatrix1D DenseDoubleMatrix1D = new DenseDoubleMatrix1D(values);
        DenseDoubleMatrix1D viewed = (DenseDoubleMatrix1D) DenseDoubleMatrix1D.viewSelection(idx);
        DoubleMatrix1D copy = viewed.copy();
        viewed.assign(DenseDoubleMatrix1D);
        DoubleMatrix1D origin = new DenseDoubleMatrix1D(idx.length);
        origin.assign(DenseDoubleMatrix1D);
        assertEquals(copy, origin);
    }
}