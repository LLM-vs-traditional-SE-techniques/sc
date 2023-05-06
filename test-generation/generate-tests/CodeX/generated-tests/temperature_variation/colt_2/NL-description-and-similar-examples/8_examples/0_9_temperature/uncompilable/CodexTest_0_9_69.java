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


public class CodexTest_0_9_69 { 
  @Test
    public void should_have_right_size_when_creating_lu_decomposition() {
        DoubleMatrix2D initial = DoubleFactory2D.dense.make(new double[][] {{1, 2, -1, 3}, {2, 3, 0, 2}, {0, -1, 2, 1}});
        DoubleMatrix2D lu = initial.like2D(initial.rows(), initial.columns());
        lu.assign(initial, DoubleFunctions.multSecond(2.0));
        assertEquals("Not the right column size", initial.columns(), lu.columns());
        assertEquals("Not the right row size", initial.rows(), lu.rows());
    }
}