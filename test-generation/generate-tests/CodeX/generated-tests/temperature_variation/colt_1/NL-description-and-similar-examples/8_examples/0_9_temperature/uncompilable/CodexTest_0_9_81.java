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


public class CodexTest_0_9_81 { 
  @Test
    public void test2DMatrixTo1DArray_Convert1Dto2DMatrix_Assign() {
        int length = 5;
        double values[] = new double[] {1,2,3,4,5};
        DoubleMatrix1D vec1D = new DenseDoubleMatrix1D(values);
        DoubleMatrix2D mat2D = vec1D.toArray2D();
        DoubleMatrix1D vec2D = mat2D.vectorize();
        assertEquals(values.length, vec2D.size());
        for (int i=0; i<values.length; i++) {
            assertEquals(values[i], vec2D.get(i), Double.MIN_VALUE);
        }
    }
}