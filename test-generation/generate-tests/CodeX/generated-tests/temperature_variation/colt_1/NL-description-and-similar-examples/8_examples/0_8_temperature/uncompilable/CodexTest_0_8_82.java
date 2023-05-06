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


public class CodexTest_0_8_82 { 
    @Test
    public void test_add_3x3_3x3_plus_3x3() {
        ////////
        Random rand = new DRandom();
        double[][] a = new double[][]{
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()},
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()},
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()}
        };
        double[][] b = new double[][]{
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()},
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()},
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()}
        };
        double[][] c = new double[][]{
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()},
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()},
                new double[]{rand.nextDouble(), rand.nextDouble(), rand.nextDouble()}
        };
        DenseDoubleMatrix2D aDenseDoubleMatrix2D = new DenseDoubleMatrix2D(a);
        DenseDoubleMatrix2D bDenseDoubleMatrix2D = new DenseDoubleMatrix2D(b);
        DenseDoubleMatrix2D cDenseDoubleMatrix2D = new DenseDoubleMatrix2D(c);
        DoubleMatrix2D resultDoubleMatrix2D = aDenseDoubleMatrix2D.assign(bDenseDoubleMatrix2D, cDenseDoubleMatrix2D, plus);
        double[][] expected = new double[][]{
                new double[]{a[0][0] + b[0][0] + c[0][0], a[0][1] + b[0][1] + c[0][1], a[0][2] + b[0][2] + c[0][2]},
                new double[]{a[1][0
}