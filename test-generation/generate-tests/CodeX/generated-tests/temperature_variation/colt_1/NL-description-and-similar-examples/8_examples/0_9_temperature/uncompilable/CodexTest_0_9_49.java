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


public class CodexTest_0_9_49 { 
  @Test
    public void testAssignDoubleArray() {
        double[] values = new double[2*2*2];
        int idx = 0;
        for (int i1 = 0; i1 < 2; ++i1) {
            for (int i2 = 0; i2 < 2; ++i2) {
                for (int i3 = 0; i3 < 2; ++i3) {
                    values[idx++] = i1*100 + i2*10 + i3;
                }
            }
        }
        DoubleMatrix3D matrix = new DenseDoubleMatrix3D(2, 2, 2);
        assertTrue(matrix.assign(values).equals(new DenseDoubleMatrix3D(values)));
    }
}