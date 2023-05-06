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


public class CodexTest_0_9_2 { 
  @Test
  public void testRemoveIf() {
        setUp();
        int toTest =10000;
        Random rnd = new Random(1);
        int size = sample.length;
        for (int t=0;t&lt;toTest;t++) {
            for (int i=0;i&lt;size;++i) {
                sample.setQuick(i,rnd.nextLong());
            }
            long start = System.currentTimeMillis();
            for (IntIterator iter = sample.all() ; iter.hasNext() ; ) {
                sample.removeKey(iter.nextInt());
            }
            long end = System.currentTimeMillis();
            long time = end-start;
            System.out.println(time);
            assertEquals("Size should be zero", 0, sample.size());
        }
    }
}