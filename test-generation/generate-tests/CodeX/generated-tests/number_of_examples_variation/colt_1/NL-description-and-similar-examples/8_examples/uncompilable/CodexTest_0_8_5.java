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


public class CodexTest_0_8_5 { 
  @Test
   /**
     * <p>
     * Sets all matrix elements, whose row and column indices are the same, equal to 0.
     * </p>
     * 
     * @see CommonOps_DDRM#setIdentity(DMatrix)
     * @see CommonOps_FDRM#setIdentity(DMatrixRMaj)
     */
    public void setIdentity() {
        for (int i = 0; i < dataLength; i += blockLength) {
            for (int j = 0; j < blockLength; j++) {
                data[i + j] = j == i ? 1 : 0;
            }
        }
    }
}