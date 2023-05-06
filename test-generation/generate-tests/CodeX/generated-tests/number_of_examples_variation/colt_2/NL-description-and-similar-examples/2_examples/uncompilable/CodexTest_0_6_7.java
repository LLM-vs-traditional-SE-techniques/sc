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


public class CodexTest_0_6_7 { 
  @Test
  public static void doubleTest29() {
			double[][] arrMatrix = 
			{ 
				{ 1, 2, 3, 4, 5, 6},
				{ 2, 3, 4, 5, 6, 7},
				{ 3, 4, 5, 6, 7, 8},
				{ 4, 5, 6, 7, 8, 9}
			};
			double[][] arrMatrix2 = 
			{ 
				{ 2, 3, 4, 5, 6, 7},
				{ 3, 4, 5, 6, 7, 8},
				{ 4, 5, 6, 7, 8, 9},
				{ 5, 6, 7, 8, 9, 10}
			};
			double[][] arrMatrix3 = 
			{ 
				{ 2, 4, 6, 8, 10, 12},
				{ 3, 6, 9, 12, 15, 18},
				{ 4, 8, 12, 16, 20, 24},
				{ 5, 10, 15, 20, 25, 30}
			};
			
}