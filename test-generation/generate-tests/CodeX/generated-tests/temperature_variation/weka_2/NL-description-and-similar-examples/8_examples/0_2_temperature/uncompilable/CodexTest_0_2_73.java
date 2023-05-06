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


public class CodexTest_0_2_73 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 4;
    double[] vals = {1, 2, 3};
    Instances insts = new Instances("test", 
				    makeAttributes(numAtts, numVals), 0);
    AlgVector vec = new AlgVector(vals);
    try {
      Instance inst = vec.getAsInstance(insts, new Random(1));
      assertEquals("Num atts differ", numAtts, inst.numAttributes());
      assertEquals("Num vals differ", numVals, inst.numValues());
      assertEquals("Num classes differ", numVals, inst.numClasses());
      assertEquals("Num missing values differ", 0, inst.numMissingValues());
      assertEquals("Value 0 differs", vals[0], inst.value(0));
      assertEquals("Value 1 differs", vals[1], inst.value(1));
      assertEquals("Value 2 differs", vals[2], inst.value(2));
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}