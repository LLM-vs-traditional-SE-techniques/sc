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


public class CodexTest_0_7_7 { 
    @Test public void testAssign5() {
		DoubleMatrix2D m=DoubleFactory2D.dense.make(5,5,0);
		m.viewPart(2,2,1,1).assign(DoubleFactory2D.dense.make(new double[][] {{2.2}}));
		assertEquals(0,m.get(0,0),0);
		assertEquals(0,m.get(0,1),0);
		assertEquals(0,m.get(0,2),0);
		assertEquals(0,m.get(0,3),0);
		assertEquals(0,m.get(0,4),0);
		assertEquals(0,m.get(1,0),0);
		assertEquals(0,m.get(1,1),0);
		assertEquals(0,m.get(1,2),0);
		assertEquals(0,m.get(1,3),0);
		assertEquals(0,m.get(1,4),0);
		assertEquals(0,m.get(2,0),0);
		assertEquals(0,m.get(2,1),0);
		assertEquals(2.2,m.get(2,2),0);
		assertEquals(0,m.get(2,3),0);
		assertEquals(0,m.get(2,4),0);
		assertEquals(0,m.get(3,0),0);
		assertEquals(0,m.get(3,1),0);
		assertEquals(0,m.get(3,2),0);
		assertEquals(0,m.get(3,3),0);
		assertEquals(0,m.get(3,4),0);
		assertEquals(0,m.get(4,0),0);
		assertEquals(0,m.get(4,1),0);
		assert
}