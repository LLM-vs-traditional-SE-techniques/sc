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


public class CodexTest_0_7_68 { 
  @Test
    public void test0060() {
		DoubleMatrix2D A = new DenseDoubleMatrix2D(new double[][]{{0.9000,0.4000},{0.2000,0.8000}});
		DoubleMatrix2D B = new DenseDoubleMatrix2D(new double[][]{{0.9000,0.4000,0.7000},{0.2000,0.8000,0.3000}});
		DoubleMatrix2D C = new DenseDoubleMatrix2D(new double[][]{{0.9700,0.5600,0.9300,0.5700},{0.6900,0.3100,0.1400,0.8600}});
		DoubleMatrix2D D = new DenseDoubleMatrix2D(new double[][]{{0.2600,0.0800,0.1300},{0.0900,0.7600,0.6400},{0.5600,0.6600,0.9300},{0.0600,0.9400,0.7500}});
		DoubleMatrix2D Z = A.like2D(2,2);
		Z = A.zMult(B,C,Z);
		DoubleMatrix2D X = A.like2D(2,2);
		X.assign(new double[][]{{0.9700,0.5600},{0.6900,0.3100}});
		assertEquals(Z,X,1.0e-9);
		Z = A.zMult(B,C,Z);
		X.assign(new double[][]{{0.9315,0.6724},{1.0162,0.4984}});
		assertEquals(Z,X,1.0e-9);
		Z = A.zMult(B,C,Z,3.0,2.0,1.0);
		X.assign(new double[][]{{10.8122,8.6168},{10.4364,8.8336}});
		assertEqu
}