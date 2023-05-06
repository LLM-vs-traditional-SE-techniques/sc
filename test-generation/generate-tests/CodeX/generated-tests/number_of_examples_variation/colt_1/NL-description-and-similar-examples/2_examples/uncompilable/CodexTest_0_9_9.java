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


public class CodexTest_0_9_9 { 
  @Test
   public void testArrayLike() {
		  double [] data1 = {1.0, 1.0, 1.0, 1.0};
		  double [][] data2 = {{1.0, 1.0, 1.0, 1.0}, {2.0, 2.0, 2.0, 2.0}};
		  DenseDoubleMatrix1D v1 = new DenseDoubleMatrix1D(4);
		  DenseDoubleMatrix2D v2 = new DenseDoubleMatrix2D(2,4);
		  v1.assign(data1);
		  v2.assign(data2);
		  DoubleMatrix1D res = v1.like(2);
		  res.assign(v2);
		  double [][] resdata = {{ 1.,  1.,  1.,  1.},{ 2.,  2.,  2.,  2.}};
		  System.out.println(res);
		 
		  assertEquals(v1,res);
		}
}