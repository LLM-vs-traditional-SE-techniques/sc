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
    public void testAssignDoubleArray() {
        testAssignDoubleArray(0, 0);
        testAssignDoubleArray(0, 1);
        testAssignDoubleArray(1, 0);
        testAssignDoubleArray(2, 1);
        testAssignDoubleArray(0, 2);
        testAssignDoubleArray(1, 2);
        testAssignDoubleArray(2, 0);
        testAssignDoubleArray(2, 1);
        testAssignDoubleArray(0, 3);
        testAssignDoubleArray(1, 3);
        testAssignDoubleArray(3, 0);
        testAssignDoubleArray(3, 1);
        testAssignDoubleArray(3, 2);
        testAssignDoubleArray(3, 3);
    }

}