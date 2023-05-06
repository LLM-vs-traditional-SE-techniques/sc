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


public class CodexTest_0_9_10 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[] {1.0, 4.5, 8.9});
      Instances insts = makeTestInstances();
      v.getAsInstance(insts, new Random(1));
    } catch (Exception e) {
      fail("Unexpected exception:\n " + e.getMessage());
    }
  }
}