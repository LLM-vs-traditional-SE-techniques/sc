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


public class CodexTest_0_7_58 { 
    @Test
    public void matrix_assign_dense() {
        double[][] matrix = getMatrix();
        cern.colt.matrix.DoubleMatrix1D a = new cern.colt.matrix.impl.DenseDoubleMatrix1D(matrix[0]);
        cern.colt.matrix.DoubleMatrix1D b = new cern.colt.matrix.impl.DenseDoubleMatrix1D(matrix[0]);
        a.assign(b);
        assertThat(a, equalTo(b));
    }
    
    @Test
    public void matrix_assign_sparse() {
        double[][] matrix = getMatrix();
        cern.colt.matrix.DoubleMatrix1D a = new cern.colt.matrix.impl.DenseDoubleMatrix1D(matrix[0]);
        cern.colt.matrix.DoubleMatrix1D b = new cern.colt.matrix.impl.SparseDoubleMatrix1D(matrix[0]);
        a.assign(b);
        assertThat(a, equalTo(b));
    }

}