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


public class CodexTest_0_9_7 { 
  @Test
   public static void doubleTestB37() {
			double[][] data = { 
				{1, 2, 3},
				{4, 5, 6}
			};
			DoubleFactory2D f2 = DoubleFactory2D.dense;
			DoubleMatrix2D m = f2.make(data);
			double result1 = m.zDotProduct(m.viewRow(0));
			double result2 = m.viewRow(0).zDotProduct(m.viewRow(0));
			assertEquals(result1,14,1.0e-12);
			assertEquals(result2,14,1.0e-12);
		}
*/
public class JavaTestCaseGenerator 
{
	String className = "ATest";
	String fullClassName = "ATest.java";
	String directory = "";
	ArrayList<String> helper_list = null;
	Hashtable<String, String> ht = null;
	Hashtable<String, String> cts = null;
	
	boolean complete;
	
	//Lists used in the generation of test cases
	ArrayList<String> testNameList;
	Array
}