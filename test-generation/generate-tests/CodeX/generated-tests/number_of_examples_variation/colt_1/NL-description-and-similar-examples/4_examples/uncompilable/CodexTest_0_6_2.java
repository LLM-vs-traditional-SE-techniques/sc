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


public class CodexTest_0_6_2 { 
  @Test
    public static void testAssign() {
        DoubleMatrix1D m = FACTORY.make(3,3);
        m.assign(new DoubleFunction() {
            public double apply(double argument) {
                return argument+1;
            }
        });
        DoubleMatrix1D a = FACTORY.make(3);
        a.assign(m.viewColumn(0));
        assertEquals(a.get(0),1,TOL);
        assertEquals(a.get(1),2,TOL);
        assertEquals(a.get(2),3,TOL);
        a.assign(m.viewColumn(1));
        assertEquals(a.get(0),4,TOL);
        assertEquals(a.get(1),5,TOL);
        assertEquals(a.get(2),6,TOL);
    }
}