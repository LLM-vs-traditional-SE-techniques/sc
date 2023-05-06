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


public class CodexTest_0_9_76 { 
  @Test
                                                                             public void testData() {
		                                                             Array2DRowRealMatrix m = new Array2DRowRealMatrix();
									     assertNull(m.getData());
									     double[][] d = new double[2][2];
									     d[0][0] = 1;
									     d[0][1] = 2;
									     d[1][0] = 3;
									     d[1][1] = 4;
									     m = new Array2DRowRealMatrix(d);
									     assertSame(d, m.getDataRef());
									     for (int row = 0; row < d.length; row++) {
									     	for (int col = 0; col < d[row].length; col++) {
											assertEquals(d[row][col], m.getData()[row][col]);
											}
									     }
									     m.setData(d[0][0],d[0][1],d[1][0],d[1][1]);
									     assertSame(d, m.getDataRef());
									     m.setData(d);
									     assertSame(d, m.getDataRef());
	                                                                             }
}