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


public class CodexTest_0_7_29 { 
  @Test
    public void testLike2D() {
        double[][] vals = new double[2][2];
        vals[0][0] = 1;
        vals[0][1] = 2;
        vals[1][0] = 3;
        vals[1][1] = 4;
        DoubleMatrix2D m = new DenseDoubleMatrix2D(vals);
        DoubleMatrix2D res = m.like2D(m.rows(), m.columns());
        res.assign(m);
        assertEquals(1, res.get(0, 0), 1.0e-9);
        assertEquals(2, res.get(0, 1), 1.0e-9);
        assertEquals(3, res.get(1, 0), 1.0e-9);
        assertEquals(4, res.get(1, 1), 1.0e-9);
        assertEquals(m.rows(), res.rows());
        assertEquals(m.columns(), res.columns());
    }
}