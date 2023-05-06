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


public class CodexTest_0_8_39 { 
    @Test 
    public void testAssignDoubleArray() { 
        final double[] expected = new double[SIZE]; 
        for (int i=0; i<SIZE; i++) { 
            m_intArray[i] = i+1; 
            expected[i] = i+1; 
        } 
        DenseDoubleMatrix1D F = new DenseDoubleMatrix1D(SIZE); 
        F.assign(m_intArray); 
        for (int r=0; r<ROWS; r++) { 
            assertEquals("m_intArray[" + r + ], expected[r], F.getQuick(r), TOLERANCE); 
        } 
    } 
}