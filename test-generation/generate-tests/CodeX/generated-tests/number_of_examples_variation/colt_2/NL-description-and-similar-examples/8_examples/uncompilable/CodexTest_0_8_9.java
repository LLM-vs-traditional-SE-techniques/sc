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


public class CodexTest_0_8_9 { 
  @Test
    public static void doubleTest267() {
        try {
            DoubleMatrix2D f = DoubleFactory2D.dense.make(2, 3);
            double[][] data = {
                {1.0, 2.0, 3.0, 4.0, 5.0, 6.0},
                {1.0, 2.0, 3.0, 4.0, 5.0, 6.0}
            };
            DoubleMatrix2D A = DoubleFactory2D.dense.make(data);
            DoubleMatrix2D C = A.like2D(A.rows(), f.columns());
            System.out.println("C.rows()=" + C.rows());
            System.out.println("C.columns()=" + C.columns());
            System.out.println("C.toString()=" + C.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}