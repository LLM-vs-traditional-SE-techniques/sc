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


public class CodexTest_0_8_60 { 
  @Test
  public void testGetAsInstance() {
    boolean exceptionOccured = false;
    FastVector atts = new FastVector();
    atts.addElement(new Attribute("att1"));
    Instances data = new Instances("test", atts, 0);
    Random random = new Random(0);
    AlgVector vec = new AlgVector(2);
    vec.setElement(0, 0);
    vec.setElement(1, 0);
    try {
      Instance inst = vec.getAsInstance(data, random);
      assertEquals("Number of attributes differ", inst.numAttributes(), 1);
      assertEquals("Value differs", 0.0, inst.value(0));
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }
}