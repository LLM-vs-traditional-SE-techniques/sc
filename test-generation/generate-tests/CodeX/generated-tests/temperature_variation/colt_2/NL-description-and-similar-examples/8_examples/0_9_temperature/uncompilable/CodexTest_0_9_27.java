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


public class CodexTest_0_9_27 { 
  @Test
        public void doubleTest44(){
          DoubleMatrix1D u = new DenseDoubleMatrix1D(new double[] {1.0,0.0,0.0});
          DoubleMatrix1D v = new DenseDoubleMatrix1D(new double[] {0.0,1.0,0.0});
          DoubleMatrix1D w = new DenseDoubleMatrix1D(3);
          w = w.assign(v);
          w.setQuick(0,2.0);
          w.setQuick(1,0.0);
          w.setQuick(2,1.0);
          DoubleMatrix2D a = new DenseDoubleMatrix2D(new double[][] {
            {1.0,0.0,0.0},
            {0.0,1.0,0.0},
            {0.0,0.0,1.0}});
          DoubleMatrix2D b = new DenseDoubleMatrix2D(new double[][] {
            {2.0,0.0,1.0},
            {0.0,1.0,0.0},
            {0.0,0.0,1.0}});
          DoubleMatrix2D result = a.like2D(a.rows(),a.columns());
          result = result.assign(a);
          result.setQuick(0,2,2.0);
          result.setQuick(1,0,0.0);
          result.setQuick(2,1,0.0);
}