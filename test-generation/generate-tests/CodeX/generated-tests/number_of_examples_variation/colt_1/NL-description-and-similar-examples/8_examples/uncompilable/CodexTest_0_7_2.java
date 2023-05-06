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


public class CodexTest_0_7_2 { 
  @Test
    public void testAssignDoubleMatrix1D() {
        DoubleMatrix1D source = F.make(new double[] { 1, 2, 3, 4, 5, 6, 7, 8 });
        DoubleMatrix1D target = new DenseDoubleMatrix1D(new double[] { 8, 7, 6, 5, 4, 3, 2, 1 });
        target.assign(source);
        assertEquals(target.get(0), source.get(0));
        assertEquals(target.get(1), source.get(1));
        assertEquals(target.get(2), source.get(2));
        assertEquals(target.get(3), source.get(3));
        assertEquals(target.get(4), source.get(4));
        assertEquals(target.get(5), source.get(5));
        assertEquals(target.get(6), source.get(6));
        assertEquals(target.get(7), source.get(7));
    }
}