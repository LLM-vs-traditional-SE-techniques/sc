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


public class CodexTest_0_9_1 { 
  @Test
                                              	public void testAssignComplex() {
        double[] expectedRe = { 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        double[] expectedIm = { 0, 0, 0, 0, 1, 0, -1, 1, 0, 0, 1, 0, -1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, -1, 1, 0, 0, 0, 0, 1, 0, -1, 1, 0, 0, 0, 0, 1, 0, -1, 1, 0, 0 };
        DoubleMatrix2D re = new DenseDoubleMatrix2D(8, 8).assign(1);
        re.viewRow(2).assign(0);
        re.viewColumn(1).assign(0);
        re.viewColumn(3).assign(0);
        re.viewRow(1).assign(re.viewRow(2).copy().assign(cern.jet.math.Functions.neg));
        re.viewRow(5).assign(re.viewRow(6).copy().assign(cern.jet.math.Functions.neg));
        re.viewRow(7).assign(re.viewRow(6).copy().assign(cern.jet.math.Functions.neg));
        DoubleMatrix2D im = new DenseDoubleMatrix2D(8, 8).assign(0);
        im.viewRow(3).assign(1);
        im.viewRow(4).assign(1);
        im.viewRow(5).assign(1);
        im.viewRow(6).assign(1);
        im.viewRow(5).assign(re.viewRow(5).copy().assign(cern.jet.math.Functions.neg));
       
}