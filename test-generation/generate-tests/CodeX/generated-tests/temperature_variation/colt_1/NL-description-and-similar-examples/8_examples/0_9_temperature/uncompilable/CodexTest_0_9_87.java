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
    public static double[] doubleTest27() {
		DoubleFactory2D f = DoubleFactory2D.dense;
		int rows = 3;
		int columns = 3;
		DoubleMatrix2D m = f.random(rows,columns);
		DoubleMatrix2D rowView = m.viewRowFlip();
		double elements[] = new double[rowView.size()];
		DoubleMatrix1D v = new DenseDoubleMatrix1D(elements);
		rowView.assign(v.viewSelection(new int[] {1,2,0}));
		return elements;
	}
--------------------------------------------------------------------------
Input: public DenseDoubleMatrix1D(double[] values) {
			this(values.length);
			assign(values);
		}
Output: public static void testSingle() {
	DoubleMatrix1D vector = new DenseDoubleMatrix1D(new double[]{4, 10, 50});
	vector.setQuick(2,7);
	vector.setQuick(0,9);
	}
}