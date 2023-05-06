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


public class CodexTest_0_9_9 { 
  @Test
    public void testDoubleMatrix2DLike4() {
        DoubleMatrix1D a = new DenseDoubleMatrix1D(new double[] { 0, 1, 2 });
        DoubleMatrix1D b = a.like1D(3);
        DoubleMatrix2D c = a.like2D(3, 3);
        DoubleMatrix2D d = a.viewFlip().like2D(3, 3);
        DoubleMatrix1D e = a.viewPart(0, 1).like1D(3);
        DoubleMatrix1D f = a.viewPart(0, 1).viewFlip().like1D(3);
        DoubleMatrix2D g = a.viewColumnFlip().like2D(3, 3);
        DoubleMatrix2D h = a.viewRowFlip().like2D(3, 3);
        DoubleMatrix1D i = a.viewDice().like1D(3);
        DoubleMatrix1D j = a.viewDice().viewFlip().like1D(3);
}