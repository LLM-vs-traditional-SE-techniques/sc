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


public class CodexTest_0_8_62 { 
    @Test
    public void testSortFromDoubleMatrix1D(){
        int numCases = 100;
        double max = 100;
        int size = 10;
        Random rng = new Random(0);
        for (int i = 0; i < numCases; i++) {
            double[] values = new double[size];
            for (int j = 0; j < size; j++) {
                values[j] = rng.nextDouble()*max;
            }
            DenseDoubleMatrix1D d1Double = new DenseDoubleMatrix1D(values);
            double[] sorted = new double[size];
            System.arraycopy(values, 0, sorted, 0, size);
            Arrays.sort(sorted);
            d1Double.assign(values);
            d1Double.sort();
            for (int j = 0; j < size; j++) {
                assertEquals("Position " + j + " of " + i + "is incorrect",
                             sorted[j], d1Double.getQuick(j), 0.0);
            }
        }
    }
}