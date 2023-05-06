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


public class CodexTest_0_6_22 { 
  @Test
    public void testAssignFloatMatrix2DView() {
        float[][] expected = new float[][] {
            { 1, 2, 3, 4, 5, 6 }, { 2, 3, 4, 5, 6, 7 },
            { 3, 4, 5, 6, 7, 8 }, { 4, 5, 6, 7, 8, 9 },
            { 5, 6, 7, 8, 9, 10 }, { 6, 7, 8, 9, 10, 11 } };
        FloatMatrix2D A = FloatFactory2D.dense.make(expected);
        FloatMatrix2D B = A.viewPart(1, 2, 2, 2).viewRowFlip();
        FloatMatrix2D C = FloatFactory2D.dense.make(2, 2);
        C.assign(B);
        assertEquals(B, C);
    }
}