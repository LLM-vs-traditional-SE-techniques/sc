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


public class CodexTest_0_5_7 { 
  @Test
  public void testAssign() {
		DoubleMatrix2D A = make(2,3);
		DoubleMatrix2D B = make(2,3);
		A.assign(B);
		A.assign(B,Functions.mult);
		A.assign(B,Functions.multSecond);
		A.assign(B,Functions.div);
		A.assign(B,Functions.divSecond);
		A.assign(B,Functions.plus);
		A.assign(B,Functions.minus);
		A.assign(B,Functions.chain(Functions.mult,Functions.plus));
		A.assign(B,Functions.chain(Functions.mult,Functions.minus));
		A.assign(B,Functions.chain(Functions.div,Functions.plus));
		A.assign(B,Functions.chain(Functions.div,Functions.minus));
		A.assign(B,Functions.pow);
}