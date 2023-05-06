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


public class CodexTest_0_7_65 { 
  @Test
  public void testGetAsInstance() {
    int num = 5;
    int numAtts = 10;
    double[] vals = new double[num];
    for (int i = 0; i < num; i++) {
      vals[i] = Math.random();
    }
    AlgVector v = new AlgVector(vals);
    Instances insts = new Instances(numAtts);
    try {
      Instance inst = v.getAsInstance(insts, null);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}