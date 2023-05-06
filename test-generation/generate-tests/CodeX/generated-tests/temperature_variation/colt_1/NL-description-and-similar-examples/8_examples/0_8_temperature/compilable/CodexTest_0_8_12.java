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


public class CodexTest_0_8_12 { 
  @Test
            public void testHashCode() {
		assertEquals(new IntArrayList().hashCode(), new IntArrayList().hashCode());
		assertEquals(new IntArrayList(new int[]{1,2,3}).hashCode(), new IntArrayList(new int[]{1,2,3}).hashCode());
		assertEquals(new IntArrayList(new int[]{1,2,3,4,5}).hashCode(), new IntArrayList(new int[]{1,2,3,4,5}).hashCode());
		assertEquals(new IntArrayList(new int[]{1,2,3,4,5,6}).hashCode(), new IntArrayList(new int[]{1,2,3,4,5,6}).hashCode());
		assertFalse(new IntArrayList().hashCode() == new IntArrayList(new int[]{1,2,3}).hashCode());
		assertFalse(new IntArrayList(new int[]{1,2,3}).hashCode() == new IntArrayList(new int[]{1,2,3,4,5}).hashCode());
		assertFalse(new IntArrayList(new int[]{1,2,3,4,5}).hashCode() == new IntArrayList(new int[]{1,2,3,4,5,6}).hashCode());
		assertFalse(new IntArrayList(new int[]{1,2,3}).hashCode() == new IntArrayList(new int[]{1,2,3,4,5,6}).hashCode());
	}

}