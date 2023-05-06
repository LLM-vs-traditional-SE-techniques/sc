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


public class CodexTest_0_9_23 { 
   @Test
   public void testAssign4() {
    double[] values = {1,2,3,4,5,6,7,8,9,10,11,12};
    int size = 6;
    double[] values2 = {-1,-2,-3};
    int size2 = 3;
    DoubleMatrix1D     v   = new DenseDoubleMatrix1D(values2,2,size2);
    DoubleMatrix1D    v1 = new DenseDoubleMatrix1D(values,3,size);
    DoubleMatrix1D    v3 = v1.viewSelection(new int[] { 0, 2, 3, 4 });
    DoubleMatrix1D    v4 = new DenseDoubleMatrix1D(v1.elements(),6,2);
    DoubleMatrix1D    v5 = v4.viewSelection(new int[] { 1, 3, 4 });
}