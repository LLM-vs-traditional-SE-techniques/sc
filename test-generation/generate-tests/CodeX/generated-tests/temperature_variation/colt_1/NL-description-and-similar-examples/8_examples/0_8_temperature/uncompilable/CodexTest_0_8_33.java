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


public class CodexTest_0_8_33 { 
    @Test
    public void testCumulativeSum() {
		Matrix3d m1 = Matrix3d.createZeroMatrix();
		Matrix3d m2 = new Matrix3d(1,2,3,4,5,6,7,8,9);
		m1.assign(m2.cumulativeSum());
		assertTrue(m1.equals(new Matrix3d(1,3,6,10,15,21,28,36,45)));
		m1.assign(m2.cumulativeSum());
		assertTrue(m1.equals(m2.cumulativeSum().cumulativeSum()));
    }
}