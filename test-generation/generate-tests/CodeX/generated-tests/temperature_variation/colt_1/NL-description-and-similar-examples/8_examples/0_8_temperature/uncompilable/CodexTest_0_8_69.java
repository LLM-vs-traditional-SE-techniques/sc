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


public class CodexTest_0_8_69 { 
  @Test
    public DoubleMatrix2D assign(DoubleMatrix2D source) {
        // overriden for performance only
        if (source == this) return this; // nothing to do
        checkShape(source);
        if (source instanceof RCDoubleMatrix2D) {
            RCDoubleMatrix2D other = (RCDoubleMatrix2D) source;
            final int zero = (int) index(0, 0);
            final int zeroOther = (int) other.index(0, 0);
            final int rowStrideOther = other.rowStride();
            final int colStrideOther = other.columnStride();
            final double[] elemsOther = other.elements();
            final int rowStride = this.rowStride();
            final int colStride = this.columnStride();
            final double[] elems = this.elements();
            if (elems == null || elemsOther == null)
                throw new InternalError();
            for (int row = rows; --row >= 0;) {
                for (int i = rowStrideOther * row + zeroOther, j = rowStride * row + zero, column = columns; --column >= 0;) {
                    elems[j] = elemsOther[i];
                    i += colStrideOther;
                    j += colStride;
                }
            }
        } else {
            super.assign(source);
        }
        return this;
    }
    
    
    
    
    
    
Input: public ArrayDeque() {
        elements = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
Output: public static void iterator() {
}