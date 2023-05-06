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


public class CodexTest_0_7_3 { 
  @Test
  public void testAssign3() {
    		DoubleMatrix1D v = factory().make(new double[]{1,2,3,4,5,6});
    		DoubleMatrix1D w = factory().make(new double[]{1,2,3,4,5,6});
    		w.assign(v);
    		w.assign(cern.jet.math.Functions.sin);
    		assertEquals(Math.sin(v.getQuick(0)), w.getQuick(0), TOL);
    		assertEquals(Math.sin(v.getQuick(1)), w.getQuick(1), TOL);
    		assertEquals(Math.sin(v.getQuick(2)), w.getQuick(2), TOL);
    		assertEquals(Math.sin(v.getQuick(3)), w.getQuick(3), TOL);
    		assertEquals(Math.sin(v.getQuick(4)), w.getQuick(4), TOL);
    		assertEquals(Math.sin(v.getQuick(5)), w.getQuick(5), TOL);
    	}
}