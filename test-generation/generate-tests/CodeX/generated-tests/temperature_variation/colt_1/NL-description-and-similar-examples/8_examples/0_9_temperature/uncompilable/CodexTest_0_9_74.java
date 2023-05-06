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


public class CodexTest_0_9_74 { 
  @Test
    public static void doubleTest67() {
			double[] temp = {
				23.4, 25.4, 29.4, 45.4, 
				58.4, 54.4, 54.4, 54.4, 
				14.4, 42.4, 24.4, 34.4, 
				34.4, 54.4, 54.4, 54.4, 
				14.4, 42.4, 24.4, 34.4, 
				34.4, 54.4, 54.4, 54.4, 
				14.4, 42.4, 24.4, 34.4, 
				34.4, 54.4, 54.4, 54.4, 
				14.4, 42.4, 24.4, 34.4
			};
			DoubleMatrix3D m1 = DoubleFactory3D.dense.make(4,4,4,temp);
			DoubleMatrix2D m2 = DoubleFactory2D.dense.make(4,4);
		
			m1.viewSlice(0).zAssign(m2);
			
	
			System.out.println(m1);
	}

}