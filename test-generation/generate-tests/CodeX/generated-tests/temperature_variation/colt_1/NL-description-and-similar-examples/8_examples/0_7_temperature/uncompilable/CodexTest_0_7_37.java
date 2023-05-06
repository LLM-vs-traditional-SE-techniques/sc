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


public class CodexTest_0_7_37 { 
  @Test
  public DoubleMatrix1D assign(DoubleMatrix1D source) {
		// overriden for performance only
		if (! (source instanceof DenseDoubleMatrix1D)) {
			return super.assign(source);
		}
		DenseDoubleMatrix1D other = (DenseDoubleMatrix1D) source;
		if (other==this) return this;
		checkSize(other);
		if (isNoView && other.isNoView) { // quickest
			System.arraycopy(other.elements, 0, this.elements, 0, this.elements.length);
			return this;
		}
		if (haveSharedCells(other)) {
			DoubleMatrix1D c = other.copy();
			if (! (c instanceof DenseDoubleMatrix1D)) { // should not happen
				return super.assign(source);
			}
			other = (DenseDoubleMatrix1D) c;
		}
}