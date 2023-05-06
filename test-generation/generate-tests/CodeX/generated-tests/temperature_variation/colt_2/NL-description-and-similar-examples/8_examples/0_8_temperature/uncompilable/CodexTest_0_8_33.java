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
     public void doubleTest1() {
         // TODO: check other values
         double[][] arrMatrix = {{3.0, 2.0}, {8.0, 0.0}, {2.5, 1.5}};
         int rows = arrMatrix.length;
         int columns = arrMatrix[0].length;
         DoubleFactory2D f = DoubleFactory2D.dense;
         DoubleMatrix2D matrix = f.make(arrMatrix);
         DoubleMatrix2D res = matrix.like2D(rows, columns);
         assertTrue(matrix.getDimension(0) == res.getDimension(0));
         assertTrue(matrix.getDimension(1) == res.getDimension(1));
         res = matrix.like2D(matrix.rows(), matrix.columns());
         assertTrue(matrix.getDimension(0) == res.getDimension(0));
         assertTrue(matrix.getDimension(1) == res.getDimension(1));
         res = matrix.like2D(matrix.slices(), matrix.columns());
         assertTrue(matrix.getDimension(0) == res.getDimension(0));
         assertTrue(matrix.getDimension(1) == res.getDimension(1));
         res = matrix.like2D(matrix.rows(), matrix.columns() / 2);
         assertTrue(matrix.getDimension(0) == res.getDimension(0));
         assertTrue(matrix.getDimension(1) / 2 == res.getDimension(1));
    }
}