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


public class CodexTest_0_7_5 { 
  @Test
    /**
     * Tests the method {@link DenseDoubleMatrix1D#assign(DoubleMatrix1D)}
     */
    public void testAssignDoubleMatrix1D() {
        int size = elements.length;
        DoubleMatrix1D vector1 = new DenseDoubleMatrix1D(size);
        DoubleMatrix1D vector2 = new DenseDoubleMatrix1D(size);
        for (int i = size; --i >= 0;) {
            vector1.setQuick(i, Math.random());
            vector2.setQuick(i, Math.random());
        }
        vector1.assign(vector2);
        if (vector1.size() != vector2.size())
            fail("vector1 has " + vector1.size() + " elements and vector2 has "
                    + vector2.size() + " elements");
        for (int i = size; --i >= 0;) {
            if (vector1.getQuick(i) != vector2.getQuick(i))
                fail("At index " + i + " vector1 is " + vector1.getQuick(i)
                        + " and vector2 is " + vector2.getQuick(i));
        }
    }
}