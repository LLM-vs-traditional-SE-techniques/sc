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


public class CodexTest_0_5_21 { 
  @Test
    public void testAssignDoubleMatrix1D() {
        DoubleMatrix1D source = new DenseDoubleMatrix1D(3);
        source.setQuick(0, 1);
        source.setQuick(1, 2);
        source.setQuick(2, 3);
        DoubleMatrix1D target = new DenseDoubleMatrix1D(3);
        target.setQuick(0, 0);
        target.setQuick(1, 0);
        target.setQuick(2, 0);
        target.assign(source);
        for (int i = 0; i < target.size(); i++) {
            assertEquals(source.getQuick(i), target.getQuick(i));
        }
    }
}