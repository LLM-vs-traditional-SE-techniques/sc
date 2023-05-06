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


public class CodexTest_0_9_56 { 
  @Test
    public void like2DComplexTest() {
    	DoubleMatrix2D matrix = factory.make(columns, rows);
    	double[][] data = new double[rows][columns];
    	for (int r = 0; r < rows; r++) {
    		for (int c = 0; c < columns; c++) {
    			data[r][c] = ((double) new Random().nextInt(100));
    		}
    	}
    	matrix.assign(data);
    	DoubleMatrix2D likematrix = factory.like2D(rows, columns);
    	double[][] datalike = new double[rows][columns];
    	for (int r = 0; r < rows; r++) {
    		for (int c = 0; c < columns; c++) {
    			datalike[r][c] = ((double) new Random().nextInt(100));
    		}
    	}
    	likematrix.assign(datalike);
    	likematrix = likematrix.zMult(matrix, likematrix);
    	System.out.println(likematrix);
    	}
    }
}