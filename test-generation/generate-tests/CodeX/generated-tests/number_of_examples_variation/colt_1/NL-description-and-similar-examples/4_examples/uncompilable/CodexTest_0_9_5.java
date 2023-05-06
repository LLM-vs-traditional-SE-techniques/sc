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


public class CodexTest_0_9_5 { 
        @Test
        public void testAssignDoubleMatrix1DSubMatrix1DArg() {
            DoubleMatrix2D A = new DenseDoubleMatrix2D(new double[][] {
                {1.00, 1.00, 1.00, 1.00},
                {1.00, 1.00, 1.00, 1.00},
                {1.00, 1.00, 1.00, 1.00},
                {1.00, 1.00, 1.00, 1.00},
            });
            DoubleMatrix1D B = A.viewRow(0).viewPart(0, 2);
            DoubleMatrix1D C = A.viewRow(1).viewPart(0, 2);
            DoubleMatrix2D D = A.viewPart(1, 1, 2, 2);
            B.assign(D);
            C.assign(D);
            Assert.assertEquals(B.get(0), 1, EPSILON);
            Assert.assertEquals(B.get(1), 1, EPSILON);
            Assert.assertEquals(C.get(0), 1, EPSILON);
            Assert.assertEquals(C.get(1), 1, EPSILON);
        }
}