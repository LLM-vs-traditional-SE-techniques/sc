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
  @Test public void assignFloatArray() {
		super.assignFloatArray();
		float[] array = new float[] { 2, 4, 2 };
		DoubleMatrix1D m2 = factory().make(3);
		m2.assign(array);
		assertEquals(m2.getQuick(0), 2, TOL);
		assertEquals(m2.getQuick(1), 4, TOL);
		assertEquals(m2.getQuick(2), 2, TOL);
	}
Input: public ArrayList(int initialCapacity) {
        super();
        if (initialCapacity < 0)
            throw new IllegalArgumentException("Illegal Capacity: "+
                                               initialCapacity);
        this.elementData = newElementArray(initialCapacity);
    }
Output: public void trimToSizeIsReflected() {
        assertEquals(0, list.size());
        list.trimToSize();
        assertEquals(new ArrayList<Object>(), list);
    }

}