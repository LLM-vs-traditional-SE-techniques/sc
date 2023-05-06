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


public class CodexTest_0_9_13 { 
  @Test
   public void testAssign() {
		DoubleMatrix1D matrix = new DenseDoubleMatrix1D(1, 2, 3, 4);
		DoubleMatrix1D view = matrix.viewSelection(new int[] {1, 2, 3});
		view.assign(new DoubleMatrix1D() {
			public double getQuick(int i) {
				return -1;
			}
			public int size() {
				return 3;
			}
		});
		assertEquals(view.getQuick(0), -1, 1e-10);
		assertEquals(view.getQuick(1), -1, 1e-10);
		assertEquals(view.getQuick(2), -1, 1e-10);
		assertEquals(view.size(), 3, 1e-10);
		assertEquals(view.get(0), -1, 1e-10);
		assertEquals(view.get(1), -1, 1e-10);
		assertEquals(view.get(2), -1, 1e-10);
	}
	
Input: public void setTAG(String tag) {
}