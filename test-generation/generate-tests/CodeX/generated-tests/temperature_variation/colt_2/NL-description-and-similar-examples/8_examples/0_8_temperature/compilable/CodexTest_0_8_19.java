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


public class CodexTest_0_8_19 { 
  @Test
    public void testMultiply() {
        DoubleMatrix2D matrix = new DenseDoubleMatrix2D(new double[][]{
                {0.4, 0.5, 0.3},
                {0.2, 0.3, 0.2},
                {0.1, 0.2, 0.4},
        });
        DoubleMatrix1D vector = new DenseDoubleMatrix1D(new double[]{1.0, 1.0, 1.0});
        DoubleMatrix1D result = vector.like(3);
        matrix.zMult(vector, result);
        assertEquals("Multiplication result", 1.3, result.getQuick(0), 1e-10);
        assertEquals("Multiplication result", 0.8, result.getQuick(1), 1e-10);
        assertEquals("Multiplication result", 1.1, result.getQuick(2), 1e-10);
    }
}