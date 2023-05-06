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


public class CodexTest_0_8_84 { 
  @Test
    public void testAssignDoubleFunction() {
        cern.colt.function.DoubleFunction function = cern.jet.math.Functions.square;
         double[] values = {1,2,3,4,5};
        DoubleMatrix1D DenseDoubleMatrix1D = new DenseDoubleMatrix1D(values);
        DenseDoubleMatrix1D.assign(function);
        for(int i=0; i<DenseDoubleMatrix1D.size(); i++) {
            assertEquals(Math.pow(values[i],2), DenseDoubleMatrix1D.getQuick(i));
        }
    }
}