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


public class CodexTest_0_7_7 { 
  @Test
    public void testAssignDoubleArray(){
        double[] assignedValues;
        int r = 4;
        int c = 4;
        double value = 0;
        final DoubleMatrix2D A = new DenseDoubleMatrix2D(r,c);
        assignedValues = A.viewRow(0).toArray();
        for (int i = 0; i < assignedValues.length; i++) {
            assignedValues[i] = value++;
        }
        A.assign(assignedValues);
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                Assert.assertEquals(assignedValues[col], A.get(row, col), TOL);
            }
        }
    }
}