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


public class CodexTest_0_9_87 { 
  @Test
    public static void doubleTest29() {
        double[][] arrMatrix = { { 1, 2, 3, 4 }, { 2, 5, 3, -1 } };
        DoubleFactory2D f = DoubleFactory2D.dense;
        DoubleMatrix2D V = f.make(arrMatrix);
        DoubleMatrix2D[] svd = null;
        DoubleMatrix2D res = null;
        try {
			svd = V.svd();
			assertEquals(5.0, svd[1].zDotProduct(svd[1], svd[1]), 1E-14 * Math.abs(svd[1]
					.zDotProduct(svd[1], svd[1])));
			res = svd[0].zMult(svd[1], null);
			assertEquals(0.0, res.aggregate(svd[2], Functions.plus, Functions.chain(
					Functions.square, Functions.minus(arrMatrix))), 1.0E-10);
		} catch (IllegalArgumentException e) {
			res = V.like2D(V.rows(), V.columns());
		}
        System.out.println(res);
    }

}