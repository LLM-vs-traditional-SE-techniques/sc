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


public class CodexTest_0_8_27 { 
  @Test
  public DoubleMatrix1D assignable(final cern.colt.function.DoubleFunction function) {
    // overriden for performance only
    if (function instanceof cern.jet.math.Mult) { // x[i] = mult*x[i]
      double alpha = ((cern.jet.math.Mult) function).multiplicator;
      if (alpha == 1)
        return this;
      if (alpha == 0)
        return assign(0);
      if (Double.isNaN(alpha))
        return assign(alpha); // the funny definition of isNaN(). This should better not happen.
      if (this.isNoView) {
        cern.colt.Timer timer = new cern.colt.Timer().start();
        final double[] elems = this.elements;
        for (int i = elems.length; --i >= 0;) {
          elems[i] *= alpha;
        }
        return this;
      } else {
        return cern.jet.math.tdouble.DoubleFunctions.mult(alpha).apply(this);
      }
    }
}