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


public class CodexTest_0_8_8 { 
  @Test
  protected void handleUnsupportedOperationException(Exception e) {
  	throw new IllegalStateException("Unsupported operation.", e);
  }
Output: protected void handleIllegalArgumentException(Exception e) {
  	throw new IllegalArgumentException("Illegal argument.", e);
  }
Output: protected void handleIllegalStateException(Exception e) {
  	throw new IllegalStateException("Illegal state.", e);
  }
Output: protected void handlePersistenceException(Exception e) {
  	throw new PersistenceException("Persistence failed.", e);
  }
Output: protected void handleRuntimeException(Exception e) {
  	throw new RuntimeException("Runtime failed.", e);
  }
Output: protected void handleException(Exception e) {
  	throw new RuntimeException("Failed.", e);
  }
Output: public void assertEquals(Object expected, Object actual) {
  	if ( expected == null && actual == null ) {
  		return;
  	}
  	org.junit.Assert.assertEquals(expected, actual);
  }
Output: public void assertEquals(String message, Object expected, Object actual) {
  	if ( expected == null && actual == null ) {
  		return;
  	}
  	org.junit.Assert.assertEquals(message, expected, actual);
  }
Output: public <T> T get(T[] arr, int index) {
  		return arr[index];
  	}
Output: public <T> T[] set(T[] arr, int index, T element) {
  		arr[index] = element;
  		return arr;
  	}
Output: public double[] sort(double[] arr) {
  		Arrays.sort( arr );
  		return arr;
  	}
Output: public int[] sort(int[] arr) {
  		Arrays.sort( arr );
  		return arr;
  	}
Output: public void assertNotEquals(boolean expected, boolean actual) {
  	if ( expected != actual ) {
  		return;
  	}
  	org.junit.Assert.fail( "expected not to be equal but was: " +
}