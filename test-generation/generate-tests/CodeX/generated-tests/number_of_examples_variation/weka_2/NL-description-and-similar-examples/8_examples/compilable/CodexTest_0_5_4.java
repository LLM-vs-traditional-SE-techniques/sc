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


public class CodexTest_0_5_4 { 
  @Test
  public void testGetAsInstance() {
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    try {
      v.getAsInstance(null, null);
      fail("Exception expected, but not thrown");
    } catch (Exception ex) {
      // expected
    }
  }
}