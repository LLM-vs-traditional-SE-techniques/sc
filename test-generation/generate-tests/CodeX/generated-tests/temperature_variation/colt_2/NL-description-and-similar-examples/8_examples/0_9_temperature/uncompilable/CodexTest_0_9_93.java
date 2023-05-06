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


public class CodexTest_0_9_93 { 
  @Test
    public void testMatrixCreateByLCSubSeqBasic() {
        double[][] arrMatrix1 ={ 
            {0.11, 0.12, 0.13, 0.14, 0.15, 0.16, 0.17, 0.18, 0.19},
            {0.12, 0.22, 0.25, 0.26, 0.23, 0.24, 0.25, 0.26, 0.27},
            {0.13, 0.32, 0.35, 0.36, 0.33, 0.34, 0.35, 0.36, 0.37},
            {0.14, 0.42, 0.45, 0.46, 0.43, 0.44, 0.45, 0.46, 0.47},
            {0.15, 0.52, 0.55, 0.56, 0.53, 0.54, 0.55, 0.56, 0.57},
            {0.16, 0.62, 0.65, 0.66, 0.63, 0.64, 0.65, 0.66, 0.67},
            {0.17, 0.72, 0.75, 0.76, 0.73, 0.74, 0.75, 0.76, 0.77},
            {0.18, 0.82, 0.85, 0.86, 0.83, 0.84, 0.85, 0.86, 0.87},
            {0.19, 0.92, 0.95, 0.96, 0.93, 0.94, 0.95, 0.96, 0.97},
            {0.21, 0.92, 0.95, 0.96, 0.93, 0.94, 0.95, 0.96, 0.97},
            {0.22, 0.92, 0.95, 0.96, 0.93, 0.94, 0.95, 0.96, 0.97},
            {0.23, 0.92, 0.95, 0.96, 0.93, 0.94, 0.95, 0.96, 0.97},
            {0.24
}