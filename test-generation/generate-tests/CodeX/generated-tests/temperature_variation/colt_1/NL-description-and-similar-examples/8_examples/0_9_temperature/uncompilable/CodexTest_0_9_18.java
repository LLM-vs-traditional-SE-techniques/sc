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


public class CodexTest_0_9_18 { 
  @Test
            public void testSwap_Part() {
		DoubleMatrix1D d1 = new DenseDoubleMatrix1D(new double[SIZE]);
		DoubleMatrix1D d2 = new DenseDoubleMatrix1D(new double[SIZE]);
		
		for (int i = 0; i < SIZE; i++) {
			d1.setQuick(i,0);
			d2.setQuick(i,0);
		}
		d1.setQuick(0,1);
		d2.setQuick(0,2);
		d1.viewPart(4,4).swap(d2.viewPart(4,4));
		
		for (int i = 0; i < 4; i++) {
			assertEquals("",0,d1.get(i),TOL);
			assertEquals("",0,d2.get(i),TOL);
		}
		assertEquals("",2,d1.get(4),0);
		assertEquals("",1,d2.get(4),0);
		for (int i = 5; i < SIZE; i++) {
			assertEquals("",0,d1.get(i),TOL);
			assertEquals("",0,d2.get(i),TOL);
		}
	}
}