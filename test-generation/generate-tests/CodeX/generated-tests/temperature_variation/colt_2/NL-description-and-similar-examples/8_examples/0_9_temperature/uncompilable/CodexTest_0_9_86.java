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


public class CodexTest_0_9_86 { 
  @Test
    public void testOrderOfOutputRows() {
        // given
        DenseDoubleMatrix2D denseDoubleMatrix2D = new DenseDoubleMatrix2D(2,2);
        double[][] input = {{1,2},{3,4}};
        denseDoubleMatrix2D.assign(input);
        AbstractAlgebra abstractAlgebra = null;
        // when
        double[][] result = abstractAlgebra.twoNorm(denseDoubleMatrix2D).toArray();
        // then
        double[][] expected = {{5,7},{9,11}};
        assertThat(result).isEqualTo(expected);
    }
}