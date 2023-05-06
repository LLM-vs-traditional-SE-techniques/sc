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


public class CodexTest_0_8_24 { 
  @Test
        public void testAssignDoubleArrayDoubleArrayDoubleArray() {
                double[] x = new double[SIZE];
                double[] expected = new double[SIZE];
                for (int i = 0; i < SIZE; i++) {
                        x[i] = Math.random();
                        expected[i] = x[i];
                }
                DoubleMatrix1D a = factory().make(SIZE, SIZE);
                DoubleMatrix1D b = factory().make(SIZE, SIZE);
                DoubleMatrix1D c = factory().make(SIZE, SIZE);
                b.assign(x);
                expected[0] = 0;
                expected[1] = 0;
                c.assign(x, 0, 2);
                a.assign(b, c, DoubleFunctions.div);
                for (int i = 0; i < SIZE; i++)
                        assertEquals("a[" + i + "]", a.getQuick(i), b.getQuick(i) / c.getQuick(i), TOL);
                a.assign(x, 0, 2, DoubleFunctions.div);
                for (int i = 0; i < SIZE; i++)
                        assertEquals("a[" + i + "]", a.getQuick(i), expected[i], TOL);
        }
}