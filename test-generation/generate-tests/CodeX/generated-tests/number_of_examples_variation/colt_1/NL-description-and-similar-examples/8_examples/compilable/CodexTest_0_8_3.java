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


public class CodexTest_0_8_3 { 
  @Test
    public void assignment(){
        double[] a = new double[10];
        double[] b = new double[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1; // a = {1,...,10}
            b[i] = i + 2; // b = {2,...,11}
        }
        DoubleMatrix1D A = new DenseDoubleMatrix1D(a);  // A = {1,...,10}
        DoubleMatrix1D B = new DenseDoubleMatrix1D(b);  // B = {2,...,11}
        DoubleMatrix1D C = A.copy(); // C = {1,...,10}
        A.assign(B); // A = B = {2,...,11}
        B.assign(C); // B = C = {1,...,10}
        System.out.println("A = " + A); // prints {2,...,11}
        System.out.println("B = " + B); // prints {1,...,10}
   }

}