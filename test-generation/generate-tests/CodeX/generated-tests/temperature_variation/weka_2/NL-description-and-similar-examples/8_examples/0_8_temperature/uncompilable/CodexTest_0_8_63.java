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


public class CodexTest_0_8_63 { 
    @Test
    public void testGetAsInstance() throws Exception {
      /** Test for method weka.core.DenseInstance getAsInstance(weka.core.Instances, java.util.Random) */
      eTest.setValue(0, 1.5);
      eTest.setValue(1, 3.2);
      assertTrue("Failed to get instance successfully",
      eTest.getAsInstance(test, random).equals(eTest));
      try {
        eTest.getAsInstance(test1, random);
        fail("Should fail as the Datatypes are different");
      } catch (Exception e) {
        // should reach here
      }
    }
}