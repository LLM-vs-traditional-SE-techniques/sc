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


public class CodexTest_0_7_66 { 
  @Test
  public void testSetAndGetValue() {
    double[] data = { 0.1, 0.2, 0.3, 0.4 };
    AlgVector v = new AlgVector(data);
    assertEquals(0.2, v.getElement(1));
    v.setElement(1, 1.1);
    assertEquals(1.1, v.getElement(1));
  }
}