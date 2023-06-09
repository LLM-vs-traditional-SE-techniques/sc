/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 12 06:52:49 GMT 2022
 */

package org.graphstream.graph;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.graphstream.graph.Path;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Path_ESTest_1 extends Path_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Path path0 = new Path();
      Path path1 = new Path();
      path1.nodePath = null;
      // Undeclared exception!
      try { 
        path1.equals(path0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.graphstream.graph.Path", e);
      }
  }
}
