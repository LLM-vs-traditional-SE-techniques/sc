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


public class CodexTest_0_8_71 { 
  @Test
        int n = 200;
        DenseDoubleMatrix1D v = new DenseDoubleMatrix1D(n,2);
        DenseDoubleMatrix1D A = new DenseDoubleMatrix1D(v.toArray());
        DenseDoubleMatrix1D B = new DenseDoubleMatrix1D(n,3);
        DenseDoubleMatrix1D C = new DenseDoubleMatrix1D(n);
        Assert.assertTrue("Diagonal: ",A.diagonal().equals(B));
        Assert.assertTrue("Assign: ",A.assign(B).equals(B));
        Assert.assertTrue("ForEachNonZero: ",A.forEachNonZero(new cern.colt.function.DoubleIntDoubleFunction() {
            public double apply(double first, int second, double third) {
                return first+second*third;
            }
        })!=null);
        Assert.assertTrue("ForEachPair: ",A.forEachPair(new cern.colt.function.DoubleDoubleProcedure() {
            public boolean apply(double first, double second) {
                return first+second>0;
            }
        }));
        Assert.assertTrue("Aggregate: ",A.aggregate(B, new cern.colt.function.DoubleDoubleFunction() {
            public double apply(double first, double second) {
                return first+second;
            }
        }));
        Assert.assertTrue("Aggregate: ",A.aggregate(B, C, new cern.colt.function.DoubleDoubleDoubleFunction() {
            public double apply(double first, double second, double third) {
                return first+second+third;
            }
        })!=null);
        Assert.assertTrue("Assign: ",A.assign(new cern.colt.function.DoubleFunction() {
            public double apply(double value) {
                return value+1;
            }
        }).getQuick(1)==A.getQuick(1)+1);
        Assert.assertTrue("Assign: ",B.assign(new cern.colt.
}