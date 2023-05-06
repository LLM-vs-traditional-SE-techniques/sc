import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_51 { 
  @Test
  public void testAdd_otherNull_nullExpected() {
    ArrayList<Kernel> kernels = KernelTest.getAlgVectorKernels();
    for (Kernel k : kernels) {
      AlgVector v1 = (AlgVector) k.clone();
      AlgVector v2 = null;
}