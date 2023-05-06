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


public class CodexTest_0_8_1 { 
  @Test
  public static void testGetNonZeroPattern() {
    SparseDoubleMatrix2D m = new SparseDoubleMatrix2D(50,50);
    m.assign(0);
    	m.setQuick(25,25,1);
    m.setQuick(25,26,1);
    	m.setQuick(25,27,1);
    m.setQuick(26,25,1);
    	m.setQuick(26,26,1);
    m.setQuick(27,25,1);
    	m.setQuick(26,27,1);
    m.setQuick(27,27,1);
    	System.out.println("m="+m);
    
    	System.out.println("count="+m.cardinality());
    for (int i=0; i<8; i++) {
      	int row = m.getNonZeros()[2*i];
      	int col = m.getNonZeros()[2*i+1];
      	System.out.println("row: "+row+", col:"+col);
    }
  }
}