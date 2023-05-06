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


public class CodexTest_0_6_10 { 
  @Test
  public void testGetAsInstance() {
    Instance testInst = null;
    try {
      testInst = getAsInstance(new DenseInstance(2));
    } catch (Exception e) {
      e.printStackTrace();
    }
    assertNotNull(testInst);
    assertEquals(0.0, testInst.value(0), 0);
    assertEquals(0.0, testInst.value(1), 0);
  }
}