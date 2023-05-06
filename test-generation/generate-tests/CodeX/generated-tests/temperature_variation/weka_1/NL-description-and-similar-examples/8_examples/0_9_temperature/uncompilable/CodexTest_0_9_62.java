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


public class CodexTest_0_9_62 { 
  @Test
  public void testAdd_differentSizeVectors_ExpectException() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = v1.newInstance(data.length + 1);
    try {
      v1.add(v2);
      fail("add must fail because vectors have different sizes");
    } catch (Exception e) {
      // expected
    }
  }
}