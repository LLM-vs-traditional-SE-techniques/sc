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


public class CodexTest_0_8_52 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2.0, 3.0});
    AlgVector v2 = new AlgVector(new double[]{5.0, 7.0});
    AlgVector v3 = v1.add(v2);
    assertEquals("Add value differs", v3.getElement(0), 7.0, 0.0001);
    assertEquals("Add value differs", v3.getElement(1), 10.0, 0.0001);
  }
}