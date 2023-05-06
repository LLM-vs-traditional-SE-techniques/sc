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


public class CodexTest_0_7_23 { 
  @Test
  /**
   * Test of getAsInstance method, of class weka.core.AlgVector.
   */
  public void testGetAsInstance() {
    System.out.println("getAsInstance");
    
    Instances model = null;
    Random random = null;
    AlgVector instance = new AlgVector();
    Instance expResult = null;
    Instance result = instance.getAsInstance(model, random);
    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
}