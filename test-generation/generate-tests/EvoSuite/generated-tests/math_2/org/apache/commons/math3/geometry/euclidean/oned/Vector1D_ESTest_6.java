/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 07:21:57 GMT 2022
 */

package org.apache.commons.math3.geometry.euclidean.oned;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Vector1D_ESTest_6 extends Vector1D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector1D vector1D0 = new Vector1D((-1.0));
      Vector1D vector1D1 = new Vector1D((-2919.562706480771), vector1D0, 140.615, vector1D0);
      Vector1D vector1D2 = new Vector1D(Double.NaN, vector1D1, (-1.0), vector1D1);
      assertEquals(2778.9477064807706, vector1D1.getX(), 0.01);
  }
}