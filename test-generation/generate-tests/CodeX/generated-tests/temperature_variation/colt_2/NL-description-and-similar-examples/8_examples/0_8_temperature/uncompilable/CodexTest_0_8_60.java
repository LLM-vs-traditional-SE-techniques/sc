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


public class CodexTest_0_8_60 { 
  @Test
    // Testing the like2D method.
    public static void doubleTest28() {
        double[][] arrMatrix = 
        { 
            { 1, 2, 3, 4, 5, 6},
            { 2, 3, 4, 5, 6, 7}
        };
        DoubleMatrix2D matrix = new DenseDoubleMatrix2D(arrMatrix);
        DoubleMatrix2D res = matrix.like2D(matrix.rows(),matrix.columns());
        Assert.assertEquals(matrix.rows(), res.rows());
        Assert.assertEquals(matrix.columns(), res.columns());
    }
}