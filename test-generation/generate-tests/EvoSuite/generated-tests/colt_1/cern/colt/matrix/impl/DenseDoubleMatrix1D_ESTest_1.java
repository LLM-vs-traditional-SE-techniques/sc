/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 06 13:03:13 GMT 2023
 */

package cern.colt.matrix.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.impl.DenseDoubleMatrix1D;
import cern.colt.matrix.impl.SelectedDenseDoubleMatrix1D;
import cern.colt.matrix.impl.SparseDoubleMatrix1D;
import cern.colt.matrix.impl.WrapperDoubleMatrix1D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DenseDoubleMatrix1D_ESTest_1 extends DenseDoubleMatrix1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DenseDoubleMatrix1D denseDoubleMatrix1D0 = new DenseDoubleMatrix1D(1523);
      SparseDoubleMatrix1D sparseDoubleMatrix1D0 = new SparseDoubleMatrix1D(1523);
      DoubleMatrix1D doubleMatrix1D0 = denseDoubleMatrix1D0.assign((DoubleMatrix1D) sparseDoubleMatrix1D0);
      assertSame(denseDoubleMatrix1D0, doubleMatrix1D0);
  }
}
