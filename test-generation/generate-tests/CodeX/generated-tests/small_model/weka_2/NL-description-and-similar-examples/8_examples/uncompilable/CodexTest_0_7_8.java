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


public class CodexTest_0_7_8 { 
  @Test(expected = IllegalArgumentException.class)
  public void test_InstanceGetAsInstanceNullVector() throws Exception {
    AlgVector v = new AlgVector(2);
    DenseInstance newInst = v.getAsInstance(getModel(), new Random(42));
    assertEquals(2, newInst.numAttributes());
  }
}