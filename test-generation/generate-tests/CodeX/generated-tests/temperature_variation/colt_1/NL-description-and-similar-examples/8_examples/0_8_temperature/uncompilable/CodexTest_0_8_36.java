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


public class CodexTest_0_8_36 { 
  @Test
    public void test5_0() {
        double[] values = {-1,1};
        FloatMatrix1D x = new DenseFloatMatrix1D(values);
        FloatMatrix1D y = new DenseFloatMatrix1D(2);
        FloatMatrix2D A = new DenseFloatMatrix2D(new float[][] { {1,2},{3,4} });
        FloatMatrix1D b = new DenseFloatMatrix1D(new float[] {-2,1});
        FloatMatrix1D z = new DenseFloatMatrix1D(2);
        cern.colt.function.floatfunctions.FloatFloatFunction fn = cern.jet.math.tdcomplex.DComplexFunctions.plus;
							A.zMult(x,y,fn,1,1,true);
							z.assign(b);
							z.assign(y,cern.jet.math.tdcomplex.DComplexFunctions.plus);
}