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


public class CodexTest_0_6_27 { 
  @Test
   public void testAssignDoubleMatrix1D() {
        System.out.println(testAssignDoubleMatrix1D);
        double[] values1 = {1, 2, 3, 4, 5};
        double[] values2 = {5, 4, 3, 2, 1};
        DoubleMatrix1D m1 = new DenseDoubleMatrix1D(values1);
        DoubleMatrix1D m2 = new DenseDoubleMatrix1D(values2);
        DoubleMatrix1D m3 = new DenseDoubleMatrix1D(values2);
        m3.assign(m1);
        for (int r=0; r<m3.size(); r++) {
            assertEquals(m1.get(r), m3.get(r), TOL);
        }
        m3.assign(m2);
        for (int r=0; r<m3.size(); r++) {
            assertEquals(m2.get(r), m3.get(r), TOL);
        }
    }
}