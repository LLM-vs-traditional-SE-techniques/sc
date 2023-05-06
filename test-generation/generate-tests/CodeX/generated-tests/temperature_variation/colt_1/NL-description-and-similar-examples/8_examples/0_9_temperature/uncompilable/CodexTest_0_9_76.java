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


public class CodexTest_0_9_76 { 
  @Test
        public void testExampleDoubleMatrix4() {
            DoubleFactory2D factory2D = DoubleFactory2D.dense;
            DoubleMatrix2D m = factory2D.sample(5,5,5.0);
            System.out.println(m);
            m.assign(2.0);
            System.out.println(m);
        }
        
        public void testExampleDoubleMatrix5() {
            DoubleFactory2D factory2D = DoubleFactory2D.dense;
            DoubleMatrix2D m = factory2D.sample(5,5,5.0);
            System.out.println(m);
            m = m.assign(2.0);
            System.out.println(m);
        }
}