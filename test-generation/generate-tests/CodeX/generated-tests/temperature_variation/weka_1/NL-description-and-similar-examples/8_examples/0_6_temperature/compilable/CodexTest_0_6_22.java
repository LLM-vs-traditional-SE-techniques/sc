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


public class CodexTest_0_6_22 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v1.setElement(0, 1.1);
    v1.setElement(1, 2.2);
    v2.setElement(0, 3.3);
    v2.setElement(1, 4.4);
    AlgVector v3 = v1.add(v2);
    assertEquals(2, v3.numElements());
    assertEquals(1.1 + 3.3, v3.getElement(0), 0.0001);
    assertEquals(2.2 + 4.4, v3.getElement(1), 0.0001);
  }
}