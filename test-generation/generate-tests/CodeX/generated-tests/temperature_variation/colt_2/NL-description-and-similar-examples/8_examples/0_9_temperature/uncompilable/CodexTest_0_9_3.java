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


public class CodexTest_0_9_3 { 
  @Test
    public static void doubleTest35()
    {
        double[] arrValues = { 1.0, 2.0, 3.0 };
        double[][] arrMatrix =
        {
            {
                11.0, 12.0, 13.0,
            },
            {
                21.0, 22.0, 23.0,
            }
        };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix1D m1 = new DenseDoubleMatrix1D(arrValues);
        DoubleMatrix2D m2 = f.make(arrMatrix);
        DoubleMatrix2D res = m2.like2D(m2.rows(),m1.size());
        m2.zMult(m1,res);
        System.out.print(res);
    }

}