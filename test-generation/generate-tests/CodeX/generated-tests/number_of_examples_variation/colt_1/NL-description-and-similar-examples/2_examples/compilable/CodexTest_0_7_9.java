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


public class CodexTest_0_7_9 { 
  @Test
    public static void testAssignDenseDoubleMatrix1D(){
        double[] matrix = {2.3, 1.2, 5.0};
        int size = matrix.length;
        DenseDoubleMatrix1D denseDoubleMatrix1D = new DenseDoubleMatrix1D(size);
        DenseDoubleMatrix1D denseDoubleMatrix1D1 = new DenseDoubleMatrix1D(matrix);
        denseDoubleMatrix1D.assign(denseDoubleMatrix1D1);
        System.out.println(denseDoubleMatrix1D);
    }
}