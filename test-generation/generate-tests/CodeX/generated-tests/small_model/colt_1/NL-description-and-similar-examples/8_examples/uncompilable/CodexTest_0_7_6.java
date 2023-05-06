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


public class CodexTest_0_7_6 { 
  @Test
  public void testDoubleMatrix1D() {
	  DoubleFactory2D f = DoubleFactory2D.dense;
	  DoubleMatrix2D matrix = f.make(new double[][] { {1, 1, 1}, {1, 1, 1} });
	  int rows = matrix.rows();
	  int cols = matrix.columns();
	  DoubleMatrix1D v1 = (DoubleMatrix1D) matrix.viewPart(0, 0, 1, cols);
	  DoubleMatrix1D v2 = (DoubleMatrix1D) matrix.viewPart(1, 0, 1, cols);
	  double sum = 0;
	  for (int i = 0; i < rows; i++) {
		  DoubleMatrix1D row = matrix.viewRow(i);
		  sum += row.aggregate(Functions.plus, Functions.identity);
	  }
	
}