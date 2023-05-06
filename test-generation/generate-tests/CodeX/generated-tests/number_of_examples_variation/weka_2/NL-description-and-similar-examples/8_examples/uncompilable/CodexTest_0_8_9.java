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


public class CodexTest_0_8_9 { 
  @Test
  public void testGetAsInstance() {
    Instances data = makeSingleAttDataset("S");
    AlgVector v = new AlgVector(2);
    v.setElement(0, 1);
    v.setElement(1, 2);
    try {
      Instance converted = v.getAsInstance(data, new Random(42));
      assertEquals("Number of attributes mismatches",
		   data.numAttributes(), converted.numAttributes());
      assertEquals("Value of numeric attribute mismatches",
		   1.0, converted.value(0), 0.0001);
      assertEquals("Value of numeric attribute mismatches",
		   2.0, converted.value(1), 0.0001);
      assertEquals("Class value should be 0",
		   0.0, converted.classValue(), 0.0001);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}