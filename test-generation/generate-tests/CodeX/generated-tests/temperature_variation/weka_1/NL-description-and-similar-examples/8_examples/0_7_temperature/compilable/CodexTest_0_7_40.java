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


public class CodexTest_0_7_40 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    v2.setElement(0, 2.0);
    v2.setElement(1, 5.0);
    v2.setElement(2, 7.0);
    AlgVector v3 = v1.add(v2);
    assertEquals(v3.getElement(0), 3.0, 1e-10);
    assertEquals(v3.getElement(1), 7.0, 1e-10);
    assertEquals(v3.getElement(2), 10.0, 1e-10);
  }
}