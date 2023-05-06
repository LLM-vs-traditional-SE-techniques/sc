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


public class CodexTest_0_8_37 { 
  @Test
    public void testPermutedView() {
        int[] perm = new int[] {0,1,2,3,4,5,6,7};
        IntMatrix2D m = new SparseIntMatrix2D(SIZE,SIZE);
        m.assign(Functions.identity);
        IntMatrix2D m1 = m.viewSelection(perm,null);
        //System.out.println(m1);
        assertEquals(DoubleFactory2D.dense, m1.getFactory());
        assertTrue(m1 instanceof DenseIntMatrix2D);
        int[] idx = new int[] {4,2,0,0,0,0,1,1,1,1,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5}; // not necessarily sorted
        int[] idx2 = new int[idx.length];
        for (int i=0; i < idx.length; i++) {
            idx2[i] = perm[idx[i]];
        }
        Arrays.sort(idx2);
        IntMatrix1D mAv = m.viewColumn(0).viewSelection(idx);
        IntMatrix1D mAv2 = m1.viewColumn(0).viewSelection(idx2);
        assertEquals(mAv.size(), mAv2.size());
        assertTrue(mAv instanceof SelectedSparseIntMatrix1D);
        assertTrue(mAv2 instanceof SelectedDenseIntMatrix1D);
    }
}